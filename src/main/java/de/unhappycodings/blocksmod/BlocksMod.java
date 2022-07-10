package de.unhappycodings.blocksmod;

import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.blockentity.ModBlockEntities;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import de.unhappycodings.blocksmod.common.item.ModItems;
import de.unhappycodings.blocksmod.common.registration.ModSounds;
import de.unhappycodings.blocksmod.common.registration.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(BlocksMod.MOD_ID)
public class BlocksMod {

    public static final String MOD_ID = "blocksmod";
    public static final int MOD_COLOR = 0x00b497;
    public static final int MOD_COLOR_SUB = 0x13C6A6;

    public static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab ItemTab = new ItemCreativeTab();
    public static final CreativeModeTab LampTab = new LampCreativeTab();

    public BlocksMod() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        LOGGER.info("[" + MOD_ID + "] Initialization");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.COMMON_CONFIG);

        GeckoLib.initialize();

        Registration.register();
        ModItems.register();
        ModSounds.register();
        ModBlocks.register();
        ModBlockEntities.BLOCK_ENTITIES.register(bus);

        CommonConfig.loadConfigFile(CommonConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("blocksmod-common.toml").toString());
        MinecraftForge.EVENT_BUS.register(this);
    }
}