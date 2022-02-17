package de.unhappycodings.blocksmod.common.block;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.client.KeyBindings;
import de.unhappycodings.blocksmod.common.blockentity.WirelessLampControllerEntity;
import de.unhappycodings.blocksmod.common.blockentity.ModBlockEntities;
import de.unhappycodings.blocksmod.common.item.LinkingCardItem;
import de.unhappycodings.blocksmod.common.util.TextComponentUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class WirelessLampControllerBlock extends BaseEntityBlock {

    protected WirelessLampControllerBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.STONE));
    }

    @SuppressWarnings("deprecation")
    @NotNull
    @Override
    public RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.MODEL;
    }

    @SuppressWarnings("deprecation")
    @NotNull
    @Override
    public InteractionResult use(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        BlockEntity block = level.getBlockEntity(pos);
        if (!(block instanceof WirelessLampControllerEntity blockEntity)) return InteractionResult.SUCCESS;
        if (!(player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof LinkingCardItem))
            return InteractionResult.PASS;
        if (level.isClientSide()) return InteractionResult.SUCCESS;
        CompoundTag nbtItem = player.getItemInHand(InteractionHand.MAIN_HAND).getTag();
        if (nbtItem == null) return InteractionResult.SUCCESS;
        CompoundTag tag = new CompoundTag();
        blockEntity.saveAdditional(tag);

        if (level.hasNeighborSignal(block.getBlockPos())) {
            player.sendMessage(TextComponentUtil.getTCompNK("message.turn_off", false, ChatFormatting.GRAY).append(" ")
                    .append(TextComponentUtil.getTCompNK("message.lamp_controller", true, null).append(" ")
                            .append(TextComponentUtil.getTCompNK("message.first", false, ChatFormatting.GRAY).append("!"))), UUID.randomUUID());
            player.playNotifySound(SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 1f, 0.5f);
            return InteractionResult.SUCCESS;
        }
        if (tag.getList("positions", Tag.TAG_COMPOUND).isEmpty()) {
            if (nbtItem.isEmpty()) return InteractionResult.SUCCESS;
            blockEntity.load(nbtItem);
            player.sendMessage(TextComponentUtil.getTCompNK("message.link_bound_bounds", true, null).append(" ")
                    .append(TextComponentUtil.getTCompNK("message.link_bound_have_been", false, ChatFormatting.GRAY).append(" ")
                            .append(TextComponentUtil.getTCompNK("message.link_bound_set", true)).append(" ")
                            .append(TextComponentUtil.getTCompNK("message.to", true)).append(" ")
                            .append(TextComponentUtil.getTCompNK("message.link_bound_the_controller", true))), UUID.randomUUID());
            player.playNotifySound(SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 1f, 4.0f);
            blockEntity.setChanged();
        } else {
            blockEntity.setPositions(null);
            player.sendMessage(TextComponentUtil.getTCompNK("message.link_bound_bounds", true, null).append(" ")
                    .append(TextComponentUtil.getTCompNK("message.link_bound_have_been", false, ChatFormatting.GRAY).append(" ")
                            .append(TextComponentUtil.getTCompNK("message.link_bound_cleared", true))), UUID.randomUUID());
            player.playNotifySound(SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 1f, 1.5f);
            blockEntity.setChanged();
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter level, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag flag) {
        if (!KeyBindings.DESCRIPTION_KEYBINDING.isDown()) {
            tooltipComponents.add(TextComponentUtil.getTComp("tooltip.show_description_0", false, ChatFormatting.GRAY)
                    .append(new TextComponent(" CTRL ").setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR)))
                    .append(TextComponentUtil.getTComp("tooltip.show_description_1", false, ChatFormatting.GRAY)));
        } else {
            tooltipComponents.add(TextComponentUtil.getTComp("message.used", false, ChatFormatting.GRAY).append(" ")
                    .append(TextComponentUtil.getTComp("message.to", false, ChatFormatting.GRAY)).append(" ")
                    .append(TextComponentUtil.getTComp("message.control", false, ChatFormatting.GRAY)).append(" ")
                    .append(TextComponentUtil.getTComp("message.flat_lamps", true, null)).append(" "));
            tooltipComponents.add(new TextComponent(""));
            tooltipComponents.add(TextComponentUtil.getTComp("message.add", false, ChatFormatting.GRAY).append(" ")
                    .append(TextComponentUtil.getTComp("message.link_bound_bounds", true).append(" "))
                    .append(TextComponentUtil.getTComp("message.by_using", false, ChatFormatting.GRAY).append(" "))
                    .append(TextComponentUtil.getTComp("message.linking_card", true).append(" ")));
            tooltipComponents.add(new TextComponent(""));
            tooltipComponents.add(TextComponentUtil.getTComp("tooltip.wireless_lamp_controller_addrem", false, ChatFormatting.GRAY));
            tooltipComponents.add(getDescription());
        }
        super.appendHoverText(stack, level, tooltipComponents, flag);
    }

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, @Nullable Direction direction) {
        return true;
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
        return level.isClientSide ? null : ($0, $1, $2, blockEntity) -> ((WirelessLampControllerEntity) blockEntity).tick();
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return ModBlockEntities.WIRELESS_LAMP_CONTROLLER.get().create(pos, state);
    }

}
