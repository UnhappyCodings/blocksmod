package de.unhappycodings.blocksmod.common.item;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.client.KeyBindings;
import de.unhappycodings.blocksmod.common.block.LampBlock;
import de.unhappycodings.blocksmod.common.block.LampFlatBlock;
import de.unhappycodings.blocksmod.common.block.TubeLampBlock;
import de.unhappycodings.blocksmod.common.block.WirelessLampControllerBlock;
import de.unhappycodings.blocksmod.common.blockentity.WirelessLampControllerEntity;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import de.unhappycodings.blocksmod.common.util.NbtUtil;
import de.unhappycodings.blocksmod.common.util.TextComponentUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class LinkingCardItem extends Item {

    public static final BooleanProperty REMOTED = BooleanProperty.create("remoted");

    public LinkingCardItem() {
        super(new Item.Properties().stacksTo(1).tab(BlocksMod.ItemTab));
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag isAdvanced) {
        if (!KeyBindings.DESCRIPTION_KEYBINDING.isDown()) {
            tooltipComponents.add(TextComponentUtil.getTComp("tooltip.show_description_0", false, ChatFormatting.GRAY).append(" ")
                    .append(new TextComponent(KeyBindings.DESCRIPTION_KEYBINDING.getName().toUpperCase()).setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR))).append(" ")
                    .append(TextComponentUtil.getTComp("tooltip.show_description_1", false, ChatFormatting.GRAY)));
        } else {
            int size = stack.getOrCreateTag().getList("positions", Tag.TAG_COMPOUND).size();
            tooltipComponents.add(new TextComponent(size + "").setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR))
                    .append(new TextComponent("/").withStyle(ChatFormatting.DARK_GRAY)
                            .append(new TextComponent(CommonConfig.LINKING_TOOL_MAX_BOUNDS.get().toString()).setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR))).append(" ")
                            .append(TextComponentUtil.getTComp("tooltip.linking_card_currently", false, ChatFormatting.GRAY))));
            tooltipComponents.add(new TextComponent(""));
            tooltipComponents.add(TextComponentUtil.getTComp("message.use", false, ChatFormatting.GRAY).append(" ")
                    .append(TextComponentUtil.getTComp("message.on", false, ChatFormatting.GRAY)).append(" ")
                    .append(TextComponentUtil.getTComp("message.flat_lamps", true)).append(" ")
                    .append(TextComponentUtil.getTComp("message.or", false, ChatFormatting.GRAY)).append(" ")
                    .append(TextComponentUtil.getTComp("message.lamp_controller", true)));
            tooltipComponents.add( new TextComponent("Sneak").setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR)).append(" ")
                    .append(TextComponentUtil.getTComp("message.to", false, ChatFormatting.GRAY)).append(" ")
                    .append(TextComponentUtil.getTComp("message.copy", false, ChatFormatting.GRAY)).append(" ")
                    .append(TextComponentUtil.getTComp("message.from", false, ChatFormatting.GRAY)).append(" ")
                    .append(TextComponentUtil.getTComp("message.lamp_controller", true)));
            tooltipComponents.add(new TextComponent(""));
            tooltipComponents.add(TextComponentUtil.getTComp("tooltip.linking_card_addrem", false, ChatFormatting.GRAY));
            tooltipComponents.add(getDescription());
        }
        super.appendHoverText(stack, level, tooltipComponents, isAdvanced);
    }

    @NotNull
    @Override
    public InteractionResult useOn(@NotNull UseOnContext context) {
        Level level = context.getLevel();
        Player player = context.getPlayer();
        ItemStack item = context.getItemInHand();
        BlockPos pos = context.getClickedPos();
        if (level.getBlockState(pos).getBlock() instanceof LampFlatBlock || level.getBlockState(pos).getBlock() instanceof TubeLampBlock || level.getBlockState(pos).getBlock() instanceof LampBlock) {
            ListTag nbtList = new ListTag();
            if (item.getOrCreateTag().contains("positions"))
                nbtList = item.getOrCreateTag().getList("positions", Tag.TAG_COMPOUND);
            if (nbtList.size() >= CommonConfig.LINKING_TOOL_MAX_BOUNDS.get()) {
                player.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 1, 0.5f);
                int x = CommonConfig.LINKING_TOOL_MAX_BOUNDS.get();
                if (!level.isClientSide)
                    player.sendMessage(TextComponentUtil.getTComp("message.link_max_bounds_reached", false, ChatFormatting.GRAY).append(" ")
                            .append(TextComponentUtil.getTComp("message.link_bound_full", true)).append(" ")
                            .append(new TextComponent(" (").withStyle(ChatFormatting.DARK_GRAY))
                            .append(new TextComponent(x + "").setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR_SUB)))
                            .append(new TextComponent(" /").withStyle(ChatFormatting.DARK_GRAY))
                            .append(new TextComponent(x + "").setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR_SUB)))
                            .append(new TextComponent(" )").withStyle(ChatFormatting.DARK_GRAY)), UUID.randomUUID());
                return InteractionResult.SUCCESS;
            }
            if (NbtUtil.posExistsInList(nbtList, pos)) {
                NbtUtil.removePosFromList(nbtList, pos);
                player.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 1, 1.5f);
            } else {
                CompoundTag posTag = new CompoundTag();
                NbtUtil.writePos(posTag, pos);
                nbtList.add(posTag);
                player.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 1, 4f);
            }
            item.getOrCreateTag().put("positions", nbtList);

            player.setItemSlot(EquipmentSlot.MAINHAND, item);
            return InteractionResult.SUCCESS;
        } else if (level.getBlockState(pos).getBlock() instanceof WirelessLampControllerBlock) {
            if (level.isClientSide()) return InteractionResult.SUCCESS;
            if (player.isShiftKeyDown()) {
                BlockEntity block = level.getBlockEntity(pos);
                if (!(player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof LinkingCardItem)) return InteractionResult.SUCCESS;
                if (!(block instanceof WirelessLampControllerEntity blockEntity)) return InteractionResult.SUCCESS;
                ListTag tag = blockEntity.getPositions();
                if (tag != null) {
                    ListTag nbtList = new ListTag();
                    tag.forEach((x) -> {
                        CompoundTag posTag = new CompoundTag();
                        NbtUtil.writePos(posTag, NbtUtil.getPos((CompoundTag) x));
                        nbtList.add(posTag);
                    });
                    item.getOrCreateTag().put("positions", nbtList);
                    player.playNotifySound(SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 1, 4f);
                    return InteractionResult.SUCCESS;
                } else {
                    player.playNotifySound(SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 1, 1.5f);
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.PASS;
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

}
