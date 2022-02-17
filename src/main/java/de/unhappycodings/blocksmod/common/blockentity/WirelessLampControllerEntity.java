package de.unhappycodings.blocksmod.common.blockentity;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.LampFlatBlock;
import de.unhappycodings.blocksmod.common.block.TubeLampBlock;
import de.unhappycodings.blocksmod.common.block.WirelessLampControllerBlock;
import de.unhappycodings.blocksmod.common.util.NbtUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.NotNull;

public class WirelessLampControllerEntity extends BlockEntity {

    ListTag positions;
    boolean powered;
    boolean origin;

    public WirelessLampControllerEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WIRELESS_LAMP_CONTROLLER.get(), pos, state);
    }

    @Override
    public void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        nbt.putBoolean("powered", this.powered);
        if (this.positions != null)
            nbt.put("positions", this.positions);
    }

    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);
        this.powered = nbt.getBoolean("powered");
        if (!nbt.getList("positions", Tag.TAG_COMPOUND).isEmpty())
            this.positions = nbt.getList("positions", Tag.TAG_COMPOUND);

    }

    public ListTag getPositions() { return this.positions; }

    public void setPositions(ListTag positions) {
        this.positions = positions;
    }

    public void tick() {
        BlockState state = this.getBlockState();
        Level level = this.getLevel();
        BlockPos pos = this.getBlockPos();
        if (level.hasNeighborSignal(pos)) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (!(blockEntity instanceof WirelessLampControllerEntity curBlockEntity)) return;
            CompoundTag tag = new CompoundTag();
            curBlockEntity.saveAdditional(tag);

            if (!tag.getBoolean("powered")) {
                tag.putBoolean("powered", !tag.getBoolean("powered"));
                blockEntity.load(tag);
                blockEntity.setChanged();
                if (!tag.isEmpty()) {
                    ListTag list = tag.getList("positions", Tag.TAG_COMPOUND);
                    list.forEach((x) -> {
                        BlockPos blockPos = NbtUtil.getPos((CompoundTag) x);
                        BlockState blockState = level.getBlockState(blockPos);
                        if (blockState.getBlock() instanceof LampFlatBlock || blockState.getBlock() instanceof TubeLampBlock) {
                            if (!blockState.getValue(LampFlatBlock.REMOTED)) {
                                if (blockState.getValue(BlockStateProperties.LIT)) {
                                    blockState = blockState.setValue(BlockStateProperties.LIT, false);
                                } else {
                                    blockState = blockState.setValue(BlockStateProperties.LIT, true);
                                }
                                this.origin = true;
                                level.setBlockAndUpdate(blockPos, blockState.setValue(LampFlatBlock.REMOTED, true));
                            }
                        }
                    });
                }
            }
        } else {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (!(blockEntity instanceof WirelessLampControllerEntity curBlockEntity)) return;
            CompoundTag tag = new CompoundTag();
            curBlockEntity.saveAdditional(tag);

            if (tag.getBoolean("powered")) {
                tag.putBoolean("powered", !tag.getBoolean("powered"));
                blockEntity.load(tag);
                blockEntity.setChanged();
                if (!tag.isEmpty()) {
                    ListTag list = tag.getList("positions", Tag.TAG_COMPOUND);
                    list.forEach((x) -> {
                        BlockPos blockPos = NbtUtil.getPos((CompoundTag) x);
                        BlockState blockState = level.getBlockState(blockPos);
                        if (blockState.getBlock() instanceof LampFlatBlock || blockState.getBlock() instanceof TubeLampBlock) {
                            if (!blockState.getValue(LampFlatBlock.REMOTED) || this.origin) {
                                if (blockState.getValue(BlockStateProperties.LIT)) {
                                    blockState = blockState.setValue(BlockStateProperties.LIT, false);
                                } else {
                                    blockState = blockState.setValue(BlockStateProperties.LIT, true);
                                }
                                level.setBlockAndUpdate(blockPos, blockState.setValue(LampFlatBlock.REMOTED, false));
                            }
                        }
                    });
                }
            }
        }
    }
}
