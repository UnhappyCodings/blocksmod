package de.unhappycodings.blocksmod.common.item;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.util.Registration;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> LUMINOUS_DUST =
            Registration.ITEMS.register("luminous_dust",
                    () -> new Item(new Item.Properties().tab(BlocksMod.ItemTab)));

    public static final RegistryObject<SandingPaperItem> SANDING_PAPER =
            Registration.ITEMS.register("sanding_paper", SandingPaperItem::new);

    public static final RegistryObject<LinkingCardItem> LINKING_CARD =
            Registration.ITEMS.register("linking_card", LinkingCardItem::new);

    public static void register() {
    }

}