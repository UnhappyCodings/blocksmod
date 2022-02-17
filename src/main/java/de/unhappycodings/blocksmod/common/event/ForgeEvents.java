package de.unhappycodings.blocksmod.common.event;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.world.Generation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event) {
        final List<Supplier<PlacedFeature>> features = event.getGeneration()
                .getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        switch (event.getCategory()) {
            case NETHER, THEEND -> {
            }
            default -> Generation.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
        }

    }
}