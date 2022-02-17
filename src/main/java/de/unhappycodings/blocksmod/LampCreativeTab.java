package de.unhappycodings.blocksmod;

import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.item.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class LampCreativeTab extends CreativeModeTab {

    public LampCreativeTab() {
        super(BlocksMod.MOD_ID + ".lamps");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(ModBlocks.WHITE_LAMP.get());
    }

    @Override
    public void fillItemList(@NotNull NonNullList<ItemStack> items) {
        int index = 0;

        ArrayList<Block> blockList = new ArrayList<>();
        Collections.addAll(blockList,
                ModBlocks.WHITE_LAMP.get(),
                ModBlocks.LIGHT_GRAY_LAMP.get(),
                ModBlocks.GRAY_LAMP.get(),
                ModBlocks.BLACK_LAMP.get(),
                ModBlocks.YELLOW_LAMP.get(),
                ModBlocks.ORANGE_LAMP.get(),
                ModBlocks.RED_LAMP.get(),
                ModBlocks.GREEN_LAMP.get(),
                ModBlocks.CYAN_LAMP.get(),
                ModBlocks.BLUE_LAMP.get(),
                ModBlocks.LIGHT_BLUE_LAMP.get(),
                ModBlocks.PINK_LAMP.get(),
                ModBlocks.MAGENTA_LAMP.get(),
                ModBlocks.PURPLE_LAMP.get(),

                ModBlocks.WHITE_LAMP_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_ENLIGHTED.get(),

                ModBlocks.WHITE_LAMP_BUTTON.get(),
                ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.WHITE_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.WHITE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.WHITE_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.WHITE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get(),
                ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.GRAY_LAMP_BUTTON.get(),
                ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.BLACK_LAMP_BUTTON.get(),
                ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.BLACK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.BLACK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.YELLOW_LAMP_BUTTON.get(),
                ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.ORANGE_LAMP_BUTTON.get(),
                ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.RED_LAMP_BUTTON.get(),
                ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.RED_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.RED_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.GREEN_LAMP_BUTTON.get(),
                ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.GREEN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.GREEN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.CYAN_LAMP_BUTTON.get(),
                ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.CYAN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.CYAN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.BLUE_LAMP_BUTTON.get(),
                ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get(),
                ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.PINK_LAMP_BUTTON.get(),
                ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.PINK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.PINK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.MAGENTA_LAMP_BUTTON.get(),
                ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.PURPLE_LAMP_BUTTON.get(),
                ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE.get(),
                ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER.get(),
                ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(),

                ModBlocks.WHITE_LAMP_FLAT.get(),
                ModBlocks.WHITE_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.WHITE_LAMP_FLAT_FRAMED.get(),
                ModBlocks.WHITE_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.WHITE_LAMP_FLAT_BIG.get(),
                ModBlocks.WHITE_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.WHITE_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.WHITE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.WHITE_LAMP_FLAT_HUGE.get(),
                ModBlocks.WHITE_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.WHITE_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.WHITE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.LIGHT_GRAY_LAMP_FLAT.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_FRAMED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.GRAY_LAMP_FLAT.get(),
                ModBlocks.GRAY_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_FLAT_FRAMED.get(),
                ModBlocks.GRAY_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_FLAT_BIG.get(),
                ModBlocks.GRAY_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.GRAY_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_FLAT_HUGE.get(),
                ModBlocks.GRAY_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.GRAY_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.GRAY_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.BLACK_LAMP_FLAT.get(),
                ModBlocks.BLACK_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_FLAT_FRAMED.get(),
                ModBlocks.BLACK_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_FLAT_BIG.get(),
                ModBlocks.BLACK_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.BLACK_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_FLAT_HUGE.get(),
                ModBlocks.BLACK_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.BLACK_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.BLACK_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.GREEN_LAMP_FLAT.get(),
                ModBlocks.GREEN_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_FLAT_FRAMED.get(),
                ModBlocks.GREEN_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_FLAT_BIG.get(),
                ModBlocks.GREEN_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.GREEN_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_FLAT_HUGE.get(),
                ModBlocks.GREEN_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.GREEN_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.GREEN_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.CYAN_LAMP_FLAT.get(),
                ModBlocks.CYAN_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_FLAT_FRAMED.get(),
                ModBlocks.CYAN_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_FLAT_BIG.get(),
                ModBlocks.CYAN_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.CYAN_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_FLAT_HUGE.get(),
                ModBlocks.CYAN_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.CYAN_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.CYAN_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.BLUE_LAMP_FLAT.get(),
                ModBlocks.BLUE_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_FLAT_FRAMED.get(),
                ModBlocks.BLUE_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_FLAT_BIG.get(),
                ModBlocks.BLUE_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.BLUE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_FLAT_HUGE.get(),
                ModBlocks.BLUE_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.BLUE_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.BLUE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.LIGHT_BLUE_LAMP_FLAT.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_FRAMED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.RED_LAMP_FLAT.get(),
                ModBlocks.RED_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_FLAT_FRAMED.get(),
                ModBlocks.RED_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_FLAT_BIG.get(),
                ModBlocks.RED_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.RED_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_FLAT_HUGE.get(),
                ModBlocks.RED_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.RED_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.RED_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.ORANGE_LAMP_FLAT.get(),
                ModBlocks.ORANGE_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_FRAMED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_BIG.get(),
                ModBlocks.ORANGE_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_HUGE.get(),
                ModBlocks.ORANGE_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.ORANGE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.YELLOW_LAMP_FLAT.get(),
                ModBlocks.YELLOW_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_FRAMED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_BIG.get(),
                ModBlocks.YELLOW_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_HUGE.get(),
                ModBlocks.YELLOW_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.YELLOW_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.PINK_LAMP_FLAT.get(),
                ModBlocks.PINK_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_FLAT_FRAMED.get(),
                ModBlocks.PINK_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_FLAT_BIG.get(),
                ModBlocks.PINK_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.PINK_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_FLAT_HUGE.get(),
                ModBlocks.PINK_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.PINK_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.PINK_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.MAGENTA_LAMP_FLAT.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_FRAMED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_BIG.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_HUGE.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.MAGENTA_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.PURPLE_LAMP_FLAT.get(),
                ModBlocks.PURPLE_LAMP_FLAT_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_FRAMED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_FRAMED_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_BIG.get(),
                ModBlocks.PURPLE_LAMP_FLAT_BIG_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_BIG_FRAMED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_HUGE.get(),
                ModBlocks.PURPLE_LAMP_FLAT_HUGE_ENLIGHTED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_HUGE_FRAMED.get(),
                ModBlocks.PURPLE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(),

                ModBlocks.WIRELESS_LAMP_CONTROLLER.get()
        );

        for (Block i : blockList) {
            items.add(index, new ItemStack(i));
            index++;
        }

        ArrayList<Item> itemList = new ArrayList<>();
        Collections.addAll(itemList, ModItems.LUMINOUS_DUST.get(), ModItems.LINKING_CARD.get());
        for (Item i : itemList) {
            items.add(index, new ItemStack(i));
            index++;
        }
    }
}
