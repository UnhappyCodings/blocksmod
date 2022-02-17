package de.unhappycodings.blocksmod.common.event;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.world.Generation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    @SubscribeEvent
    public static void onStartupEvent(FMLCommonSetupEvent event) {
        Generation.registerOres();
    }

}