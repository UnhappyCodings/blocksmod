package de.unhappycodings.blocksmod.common.blockentity;

import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3d;
import de.unhappycodings.blocksmod.common.block.PlayerSensorBlock;
import de.unhappycodings.blocksmod.common.registration.ModSounds;
import de.unhappycodings.blocksmod.common.util.LocationUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
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

import java.util.List;
import java.util.Objects;

public class PlayerSensorEntity extends BlockEntity {
    boolean state;
    int ticks;

    public PlayerSensorEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PLAYER_SENSOR.get(), pos, state);
    }

    public void tick() {
        Direction direction = getBlockState().getValue(PlayerSensorBlock.FACING);
        BlockPos pos1; BlockPos pos2;
        switch (direction) {
            case NORTH -> { pos1 = getBlockPos().offset(-1, 0, 1); pos2 = getBlockPos().offset(2, -2, -1); }
            case EAST ->  { pos1 = getBlockPos().offset(2, 0, 2);  pos2 = getBlockPos().offset(0, -2, -1); }
            case SOUTH -> { pos1 = getBlockPos().offset(2, 0, 2);  pos2 = getBlockPos().offset(-1, -2, 0); }
            default ->    { pos1 = getBlockPos().offset(1, 0, -1); pos2 = getBlockPos().offset(-1, -2, 2); }
        }
        List<Player> players = level.getEntitiesOfClass(Player.class, new AABB(pos1.getX(), pos1.getY(), pos1.getZ(), pos2.getX(), pos2.getY(), pos2.getZ()), entity -> !entity.isSpectator());

        if (!players.isEmpty()) {
            if (!state) {
                LocalPlayer player = Minecraft.getInstance().player;
                ticks = 0;
                state = true;
                if (player != null)
                    player.getLevel().playLocalSound(this.getBlockPos().getX() + 0.5, this.getBlockPos().getY() + 0.5, this.getBlockPos().getZ() + 0.5,
                            ModSounds.PLAYER_SENSOR_CLICK_OFF.get(), SoundSource.BLOCKS, 0.4f, 1f, false);
                level.setBlock(getBlockPos(), getBlockState().setValue(PlayerSensorBlock.POWERED, true), 3);
            }
        } else {
            if (ticks > 3 * 20) {
                if (state) {
                    LocalPlayer player = Minecraft.getInstance().player;
                    ticks = 0;
                    state = false;
                    if (player != null)
                        player.getLevel().playLocalSound(getBlockPos().getX() + 0.5, getBlockPos().getY() + 0.5, getBlockPos().getZ() + 0.5,
                                ModSounds.PLAYER_SENSOR_CLICK_ON.get(), SoundSource.BLOCKS, 0.4f, 1f, false);
                    level.setBlock(getBlockPos(), getBlockState().setValue(PlayerSensorBlock.POWERED, false), 3);
                }
            }
        }
        ticks++;
    }
}
