package de.unhappycodings.blocksmod.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;

import java.util.function.ToIntFunction;

public class LampBlock extends RedstoneLampBlock {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final BooleanProperty REMOTED = BooleanProperty.create("remoted");
    public boolean inverted;

    public LampBlock() {
        super(Block.Properties.copy(Blocks.REDSTONE_LAMP));
        this.inverted = false;

        registerDefaultState(this.getStateDefinition().any()
                .setValue(LIT, false)
                .setValue(REMOTED, false));
    }

    public LampBlock(String x) {
        super(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true)));
        this.inverted = true;

        registerDefaultState(this.getStateDefinition().any()
                .setValue(LIT, false)
                .setValue(REMOTED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT, REMOTED);
    }

    @Override
    public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos fromPos, boolean isMoving) {
        if (!state.getValue(REMOTED)) {
            super.neighborChanged(state, level, pos, block, fromPos, isMoving);
        }
    }

    private static ToIntFunction<BlockState> litBlockEmission(boolean inverted) {
        if (inverted)
            return (p_50763_) -> !p_50763_.getValue(BlockStateProperties.LIT) ? 15 : 0;
        return (p_50763_) -> p_50763_.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

}
