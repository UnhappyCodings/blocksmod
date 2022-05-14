package de.unhappycodings.blocksmod.common.event;

import de.unhappycodings.blocksmod.BlocksMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    // For Future Events

    @SubscribeEvent
    public static void registerItemModel(ModelRegistryEvent event) {
        ResourceLocation wardrobe = new ResourceLocation(BlocksMod.MOD_ID, "geo/models/big_sliding_door.geo");
        ForgeModelBakery.addSpecialModel(wardrobe);
    }

}