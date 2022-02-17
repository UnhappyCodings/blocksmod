package de.unhappycodings.blocksmod.common.util;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.client.KeyBindings;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TranslatableComponent;
import org.jetbrains.annotations.Nullable;

public class TextComponentUtil {

    public static MutableComponent getTComp(String key, boolean subModColored) {
        MutableComponent x = new TranslatableComponent("item.blocksmod." + key,
                KeyBindings.DESCRIPTION_KEYBINDING.getTranslatedKeyMessage());
        return x.setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR_SUB));
    }

    public static MutableComponent getTComp(String key, boolean modColored, @Nullable ChatFormatting formatting) {
        MutableComponent x = new TranslatableComponent("item.blocksmod." + key,
                KeyBindings.DESCRIPTION_KEYBINDING.getTranslatedKeyMessage());
        if (modColored) return x.setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR));
        if (formatting == null)
            return x;
        return x.setStyle(Style.EMPTY.withColor(formatting));
    }

    public static MutableComponent getTCompNK(String key, boolean subModColored) {
        MutableComponent x = new TranslatableComponent("item.blocksmod." + key);
        return x.setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR_SUB));
    }

    public static MutableComponent getTCompNK(String key, boolean modColored, @Nullable ChatFormatting formatting) {
        MutableComponent x = new TranslatableComponent("item.blocksmod." + key);
        if (modColored) return x.setStyle(Style.EMPTY.withColor(BlocksMod.MOD_COLOR));
        if (formatting == null)
            return x;
        return x.setStyle(Style.EMPTY.withColor(formatting));
    }
}
