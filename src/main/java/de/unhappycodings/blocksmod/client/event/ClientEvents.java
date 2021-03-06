package de.unhappycodings.blocksmod.client.event;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onStartupEvent(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_STATIC.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_STATIC_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_BUTTON.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAMP_BUTTON_TRIGGER.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAMP_BUTTON_TRIGGER_SMALL.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAMP_BUTTON_TRIGGER_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_BIG.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_BIG_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_BIG_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_HUGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_HUGE_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_HUGE_FRAMED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP_LEFT_OPEN.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP_RIGHT_OPEN.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP_EDGE.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_OPEN.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get(), (renderType) -> renderType == RenderType.translucent() || renderType == RenderType.cutoutMipped());


    }

}