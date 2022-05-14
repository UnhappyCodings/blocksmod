package de.unhappycodings.blocksmod.common.blockentity;

import de.unhappycodings.blocksmod.common.block.BigSlidingDoorBlock;
import de.unhappycodings.blocksmod.common.registration.ModSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.Objects;

public class BigSlidingDoorEntity extends BlockEntity implements IAnimatable, AnimationController.ISoundListener<BigSlidingDoorEntity> {
    private final AnimationFactory factory = new AnimationFactory(this);
    boolean lasts;
    boolean last;
    byte state = 1;
    int ticks;

    public BigSlidingDoorEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BIG_SLIDING_DOOR.get(), pos, state);
    }

    public void tick() {
        Level level = getLevel();
        BlockPos blockPos = getBlockPos();
        BlockState blockState = level.getBlockState(blockPos);
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag);

        if (blockState.getBlock() != Blocks.AIR) {
            if (level.hasNeighborSignal(blockPos)) {
                if (!this.lasts) {
                    tag.putBoolean("last", true);
                    ticks = 0;
                    this.lasts = true;
                    this.load(tag);
                }
            } else {
                if (this.lasts) {
                    tag.putBoolean("last", false);
                    ticks = 0;
                    this.lasts = false;
                    this.load(tag);
                }
            }
        }
        if (blockState.getValue(BigSlidingDoorBlock.POWERED)) {
            switch (ticks) {
                case 36 -> tag.putByte("state", (byte) 5);
                case 30 -> tag.putByte("state", (byte) 4);
                case 25 -> tag.putByte("state", (byte) 3);
                case 21 -> tag.putByte("state", (byte) 2);
                case 18 -> tag.putByte("state", (byte) 1);
            }
            this.load(tag);
        } else {
            switch (ticks) {
                case 28 -> tag.putByte("state", (byte) 1);
                case 23 -> tag.putByte("state", (byte) 2);
                case 18 -> tag.putByte("state", (byte) 3);
                case 14 -> tag.putByte("state", (byte) 4);
                case 0 -> tag.putByte("state", (byte) 5);
            }
            this.load(tag);
        }
        level.sendBlockUpdated(blockPos, blockState, blockState, Block.UPDATE_ALL);
        this.setChanged();
        ticks++;
    }

    @Override
    public AABB getRenderBoundingBox() {
        return new AABB(getBlockPos().offset(-2, -2, -2), getBlockPos().offset(2, 2, 2));
    }

    private <ENTITY extends IAnimatable> void soundListener(SoundKeyframeEvent<ENTITY> event) {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player != null) {
            if (Objects.equals(event.sound, "open"))
                player.getLevel().playLocalSound(this.getBlockPos().getX(), this.getBlockPos().getY(), this.getBlockPos().getZ(), ModSounds.BIG_SLIDING_DOOR_OPEN.get(), SoundSource.BLOCKS, 1f, 1f, false);
            if (Objects.equals(event.sound, "close"))
                player.getLevel().playLocalSound(this.getBlockPos().getX(), this.getBlockPos().getY(), this.getBlockPos().getZ(), ModSounds.BIG_SLIDING_DOOR_CLOSE.get(), SoundSource.BLOCKS, 1f, 1f, false);
        }
    }

    private <E extends BlockEntity & IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        AnimationController<E> controller = event.getController();
        Level level = getLevel();
        BlockPos blockPos = getBlockPos();
        BlockState blockState = level.getBlockState(blockPos);

        if (blockState.getBlock() != Blocks.AIR) {
            if (level.hasNeighborSignal(blockPos)) {
                if (!this.lasts) {
                    controller.clearAnimationCache();
                    controller.setAnimation(new AnimationBuilder().addAnimation("animation.big_sliding_door.anim_open", false));
                    this.lasts = true;
                } else {
                    if (event.getController().getAnimationState() == AnimationState.Stopped)
                        controller.setAnimation(new AnimationBuilder().addAnimation("animation.big_sliding_door.idle_open", false));
                }
            } else {
                if (this.lasts) {
                    controller.clearAnimationCache();
                    controller.setAnimation(new AnimationBuilder().addAnimation("animation.big_sliding_door.anim_close", false));
                    this.lasts = false;
                } else {
                    if (event.getController().getAnimationState() == AnimationState.Stopped)
                        controller.setAnimation(new AnimationBuilder().addAnimation("animation.big_sliding_door.idle_close", false));
                }

            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        if (level.isClientSide && net.getDirection() == PacketFlow.CLIENTBOUND) {
            //Handle the update tag when we are on the client
            handleUpdateTag(pkt.getTag());
        }
    }

    @NotNull
    @Override
    public CompoundTag getUpdateTag() {
        super.getUpdateTag();
        CompoundTag nbt = new CompoundTag();
        nbt.putBoolean("last", this.last);
        nbt.putByte("state", this.state);
        return nbt;
    }

    @Override
    public void handleUpdateTag(CompoundTag nbt) {
        this.last = nbt.getBoolean("last");
        this.state = nbt.getByte("state");
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.putBoolean("last", this.last);
        nbt.putByte("state", this.state);
    }

    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);
        this.last = nbt.getBoolean("last");
        this.state = nbt.getByte("state");
    }

    @Override
    public void registerControllers(AnimationData data) {
        AnimationController<BigSlidingDoorEntity> controller = new AnimationController<BigSlidingDoorEntity>(this, "animation.big_sliding_door.idle_closed", 9, this::predicate);

        data.addAnimationController(controller);
        controller.registerSoundListener(this::soundListener);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void playSound(SoundKeyframeEvent<BigSlidingDoorEntity> event) {
    }
}
