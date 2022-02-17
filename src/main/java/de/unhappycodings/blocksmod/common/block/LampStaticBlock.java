package de.unhappycodings.blocksmod.common.block;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.client.KeyBindings;
import de.unhappycodings.blocksmod.common.util.TextComponentUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class LampStaticBlock extends RedstoneLampBlock {
    boolean inverted;

    public LampStaticBlock(boolean inverted) {
        super(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP));
        this.inverted = inverted;
    }

    @Override // empty to prevent blockupdating
    public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos fromPos, boolean isMoving) { }

    @Override // empty to prevent blockupdating
    public void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull Random rand) { }


    @Override
    public void appendHoverText(@NotNull ItemStack stack, @org.jetbrains.annotations.Nullable BlockGetter level, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag flag) {
        if (!KeyBindings.DESCRIPTION_KEYBINDING.isDown()) {
            tooltipComponents.add(TextComponentUtil.getTComp("tooltip.show_description_0", false, ChatFormatting.GRAY)
                    .append(new TextComponent(" CTRL ").setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR)))
                    .append(TextComponentUtil.getTComp("tooltip.show_description_1", false, ChatFormatting.GRAY)));
        } else {
            tooltipComponents.add(new TextComponent(""));
            tooltipComponents.add(TextComponentUtil.getTComp("tooltip.static_lamp", false, ChatFormatting.GRAY));
            tooltipComponents.add(new TextComponent(""));
        }
        super.appendHoverText(stack, level, tooltipComponents, flag);
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
        if (!inverted)
            return this.defaultBlockState().setValue(LIT, false);
        return this.defaultBlockState().setValue(LIT, true);
    }
}
