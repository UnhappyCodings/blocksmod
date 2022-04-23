package de.unhappycodings.blocksmod.common.block;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.client.KeyBindings;
import de.unhappycodings.blocksmod.common.blockentity.BigSlidingDoorEntity;
import de.unhappycodings.blocksmod.common.blockentity.BoundingBlockEntity;
import de.unhappycodings.blocksmod.common.blockentity.ModBlockEntities;
import de.unhappycodings.blocksmod.common.blockentity.WirelessLampControllerEntity;
import de.unhappycodings.blocksmod.common.util.TextComponentUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.example.registry.SoundRegistry;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;

import java.util.List;

public class BigSlidingDoorBlock extends BaseEntityBlock {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    protected static final VoxelShape CLOSED_NS = Block.box(-16, 0, 7, 32, 32, 9);
    protected static final VoxelShape CLOSED_EW = Block.box(7, 0, -16, 9, 32, 32);

    protected static final VoxelShape OPEN_NS_1 = Shapes.or(Block.box(-16, 0, 7, 8, 32, 9),Block.box(8, 0, 7, 32, 32, 9));
    protected static final VoxelShape OPEN_NS_2 = Shapes.or(Block.box(-16, 0, 7, 3.5, 32, 9), Block.box(12.5, 0, 7, 32, 32, 9));
    protected static final VoxelShape OPEN_NS_3 = Shapes.or(Block.box(-16, 0, 7, -1, 32, 9), Block.box(17, 0, 7, 32, 32, 9));
    protected static final VoxelShape OPEN_NS_4 = Shapes.or(Block.box(-16, 0, 7, -5.5, 32, 9), Block.box(21.5, 0, 7, 32, 32, 9));
    protected static final VoxelShape OPEN_NS_5 = Shapes.or(Block.box(-16, 0, 7, -11.15, 32, 9), Block.box(27.15, 0, 7, 32, 32, 9));

    protected static final VoxelShape OPEN_EW_1 = Shapes.or(Block.box(7, 0, 8, 9, 32, 32), Block.box(7, 0, -16, 9, 32, 8.0));
    protected static final VoxelShape OPEN_EW_2 = Shapes.or(Block.box(7, 0, 12.5, 9, 32, 32), Block.box(7, 0, -16, 9, 32, 3.5));
    protected static final VoxelShape OPEN_EW_3 = Shapes.or(Block.box(7, 0, 17, 9, 32, 32), Block.box(7, 0, -16, 9, 32, -1));
    protected static final VoxelShape OPEN_EW_4 = Shapes.or(Block.box(7, 0, 21.5, 9, 32, 32), Block.box(7, 0, -16, 9, 32, -5.5));
    protected static final VoxelShape OPEN_EW_5 = Shapes.or(Block.box(7, 0, 27.15, 9, 32, 32), Block.box(7, 0, -16, 9, 32, -11.15));

    protected BigSlidingDoorBlock() {
        super(Properties.copy(Blocks.STONE));
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(POWERED, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(POWERED, context.getLevel().hasNeighborSignal(context.getClickedPos()));
    }

    @SuppressWarnings("deprecation")
    @Override
    public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos fromPos, boolean isMoving) {
        level.setBlock(pos, state.setValue(POWERED, level.hasNeighborSignal(pos)), 3);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, POWERED);
    }

    @SuppressWarnings("deprecation")
    @NotNull
    @Override
    public VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        Direction direction = state.getValue(FACING);
        if (!(level.getBlockEntity(pos) instanceof BigSlidingDoorEntity blockEntity)) return Shapes.empty();
        CompoundTag tag = new CompoundTag();
        blockEntity.saveAdditional(tag);

        if (direction == Direction.NORTH || direction == Direction.SOUTH) {
            switch (tag.getByte("state")) {
                case 1:
                    return OPEN_NS_1;
                case 2:
                    return OPEN_NS_2;
                case 3:
                    return OPEN_NS_3;
                case 4:
                    return OPEN_NS_4;
                case 5:
                    return OPEN_NS_5;
            }
        }
        switch (tag.getByte("state")) {
            case 1:
                return OPEN_EW_1;
            case 2:
                return OPEN_EW_2;
            case 3:
                return OPEN_EW_3;
            case 4:
                return OPEN_EW_4;
            case 5:
                return OPEN_EW_5;
        }
        return Shapes.empty();
    }

    @SuppressWarnings("deprecation")
    @NotNull
    @Override
    public RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, @Nullable Direction direction) {
        return true;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter level, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag flag) {
        if (!KeyBindings.DESCRIPTION_KEYBINDING.isDown()) {
            tooltipComponents.add(TextComponentUtil.getTComp("tooltip.show_description_0", false, ChatFormatting.GRAY)
                    .append(new TextComponent(" CTRL ").setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR)))
                    .append(TextComponentUtil.getTComp("tooltip.show_description_1", false, ChatFormatting.GRAY)));
        } else {
            tooltipComponents.add(TextComponentUtil.getTComp("message.big_sliding_door", false, ChatFormatting.GRAY).append(" "));
            tooltipComponents.add(new TextComponent(""));
            tooltipComponents.add(TextComponentUtil.getTComp("message.big_sliding_door_control", false, ChatFormatting.GRAY).append(" "));
            tooltipComponents.add(getDescription());
        }
        super.appendHoverText(stack, level, tooltipComponents, flag);
    }

    @NotNull
    public Component getDescription() {
        String descriptionId = getDescriptionId();
        int lastIndex = descriptionId.lastIndexOf('.');
        return new TranslatableComponent(String.format(
                "%s.tooltip.%s",
                descriptionId.substring(0, lastIndex).replaceFirst("^block", "item"),
                descriptionId.substring(lastIndex + 1))).withStyle(ChatFormatting.DARK_GRAY);
    }

    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState blockState, @NotNull BlockEntityType<T> type) {
        return level.isClientSide ? null : ($0, $1, $2, blockEntity) -> ((BigSlidingDoorEntity) blockEntity).tick();
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return ModBlockEntities.BIG_SLIDING_DOOR.get().create(pos, state);
    }

}
