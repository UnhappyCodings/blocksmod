package de.unhappycodings.blocksmod.common.item;

import de.unhappycodings.blocksmod.BlocksMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Random;

public class SandingPaperItem extends Item {

    public SandingPaperItem() {
        super(new Item.Properties().tab(BlocksMod.ItemTab).defaultDurability(4500).setNoRepair());
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack itemStack1 = itemStack.copy();
        if (!itemStack1.hurt(1, new Random(), null))
            return itemStack1;
        return ItemStack.EMPTY;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}
