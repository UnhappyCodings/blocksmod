package de.unhappycodings.blocksmod.common.event;

import com.mojang.blaze3d.vertex.PoseStack;
import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.world.Generation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.client.event.RenderLevelLastEvent;
import net.minecraftforge.client.gui.OverlayRegistry;
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