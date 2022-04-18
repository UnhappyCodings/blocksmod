package de.unhappycodings.blocksmod.common.blockentity;

import de.unhappycodings.blocksmod.common.block.BigSlidingDoorBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;
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

public class BigSlidingDoorEntity extends BlockEntity implements IAnimatable, AnimationController.ISoundListener<BigSlidingDoorEntity> {
    boolean last;
    boolean lasts;
    long timestamp;
    byte state = 1;
    private AnimationFactory factory = new AnimationFactory(this);

    public BigSlidingDoorEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BIG_SLIDING_DOOR.get(), pos, state);
    }

    @NotNull
    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag tag = super.getUpdateTag();
        this.timestamp = System.currentTimeMillis();
        this.saveAdditional(tag);
        return tag;
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.putBoolean("last", this.last);
        nbt.putByte("state", this.state);
        nbt.putLong("timestamp", this.timestamp);
    }

    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);
        this.last = nbt.getBoolean("last");
        this.state = nbt.getByte("state");
        this.timestamp = nbt.getLong("timestamp");
    }

    public void tick() { // SERVER
        Level level = getLevel();
        BlockPos blockPos = getBlockPos();
        BlockState blockState = level.getBlockState(blockPos);
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag);

        if (blockState.getBlock() != Blocks.AIR) {
            if (level.hasNeighborSignal(blockPos)) {
                if (!this.lasts) {
                    tag.putBoolean("last", true);
                    this.lasts = true;
                    this.load(tag);
                    this.setChanged();
                }
            } else {
                if (this.lasts) {
                    tag.putBoolean("last", false);
                    this.lasts = false;
                    this.load(tag);
                    this.setChanged();
                }
            }
        }
    }

    @Override
    public AABB getRenderBoundingBox() {
        return new AABB(getBlockPos().offset(-2, -2, -2), getBlockPos().offset(2, 2, 2));
    }

    @Override
    public void playSound(SoundKeyframeEvent<BigSlidingDoorEntity> event) {
        LocalPlayer player = Minecraft.getInstance().player;
        if (player != null) {
            player.playSound(SoundEvents.ANVIL_BREAK, 1, 1);
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
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<BigSlidingDoorEntity>(this, "animation.big_sliding_door.idle_closed", 9, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
