package de.unhappycodings.blocksmod.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Objects;

public class ShroomlightBlock extends Block {

    public static final BooleanProperty CONNECTED_UP = BooleanProperty.create("con_up");
    public static final BooleanProperty CONNECTED_DOWN = BooleanProperty.create("con_dwn");
    public static final BooleanProperty CONNECTED_NORTH = BooleanProperty.create("con_n");
    public static final BooleanProperty CONNECTED_EAST = BooleanProperty.create("con_e");
    public static final BooleanProperty CONNECTED_SOUTH = BooleanProperty.create("con_s");
    public static final BooleanProperty CONNECTED_WEST = BooleanProperty.create("con_w");
    public String blockType;

    public ShroomlightBlock(String blockType) {
        super(Properties.of(Material.STONE).strength(1.0F).sound(SoundType.STONE).color(MaterialColor.NONE).lightLevel((x) -> 15));
        this.blockType = blockType;
        registerDefaultState(this.getStateDefinition().any()
                .setValue(CONNECTED_UP, Boolean.FALSE)
                .setValue(CONNECTED_DOWN, Boolean.FALSE)
                .setValue(CONNECTED_NORTH, Boolean.FALSE)
                .setValue(CONNECTED_EAST, Boolean.FALSE)
                .setValue(CONNECTED_SOUTH, Boolean.FALSE)
                .setValue(CONNECTED_WEST, Boolean.FALSE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_49915_) {
        p_49915_.add(CONNECTED_DOWN, CONNECTED_UP, CONNECTED_NORTH, CONNECTED_SOUTH, CONNECTED_WEST, CONNECTED_EAST);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void neighborChanged(@NotNull BlockState blockstate, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos blockPos, boolean isMoving) {
        super.neighborChanged(blockstate, level, pos, block, blockPos, isMoving);
        level.setBlockAndUpdate(pos, getDisplayState(level, pos));
    }

    public BlockState getDisplayState(Level level, BlockPos pos) {
        return defaultBlockState().setValue(CONNECTED_DOWN, isConnectable(level.getBlockState(pos.below())))
                .setValue(CONNECTED_UP, isConnectable(level.getBlockState(pos.above())))
                .setValue(CONNECTED_NORTH, isConnectable(level.getBlockState(pos.north())))
                .setValue(CONNECTED_SOUTH, isConnectable(level.getBlockState(pos.south())))
                .setValue(CONNECTED_WEST, isConnectable(level.getBlockState(pos.west())))
                .setValue(CONNECTED_EAST, isConnectable(level.getBlockState(pos.east())));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_49820_) {
        return getDisplayState(p_49820_.getLevel(), p_49820_.getClickedPos());
    }

    public boolean isConnectable(BlockState blockState) {
        Block block = blockState.getBlock();
        if (block instanceof ShroomlightBlock shroomlightBlock)
            return Objects.equals(shroomlightBlock.blockType, this.blockType);
        return false;
    }

}
