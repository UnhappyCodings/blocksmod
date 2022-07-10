package de.unhappycodings.blocksmod.common.world;

import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.ArrayList;
import java.util.List;

public class Generation {
    public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();

    public static void registerOres() {

        final Holder<PlacedFeature> placedAragonitBlock = PlacementUtils.register("aragonit_block", FeatureUtils.register("aragonit_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.ARAGONIT_BLOCK.get().defaultBlockState())), CommonConfig.ARAGONIT_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.ARAGONIT_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedLimestoneBlock = PlacementUtils.register("limestone_block", FeatureUtils.register("limestone_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.LIMESTONE.get().defaultBlockState())), CommonConfig.LIMESTONE_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.LIMESTONE_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedGaratBlock = PlacementUtils.register("garat_block", FeatureUtils.register("garat_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GARAT_BLOCK.get().defaultBlockState())), CommonConfig.GARAT_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.GARAT_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedSlateBlock = PlacementUtils.register("slate_block", FeatureUtils.register("slate_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.SLATE_BLOCK.get().defaultBlockState())), CommonConfig.SLATE_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.SLATE_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedMonzoniteBlock = PlacementUtils.register("monzonite_block", FeatureUtils.register("monzonite_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.MONZONITE_BLOCK.get().defaultBlockState())), CommonConfig.MONZONITE_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.MONZONITE_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedNephelineSyeniteBlock = PlacementUtils.register("nepheline_syenite_block", FeatureUtils.register("nepheline_syenite_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.NEPHELINE_SYENITE_BLOCK.get().defaultBlockState())), CommonConfig.NEPHELINE_SYENITE_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.NEPHELINE_SYENITE_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedGabbroBlock = PlacementUtils.register("gabbro_block", FeatureUtils.register("gabbro_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GABBRO_BLOCK.get().defaultBlockState())), CommonConfig.GABBRO_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.GABBRO_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedWhiteGabbroBlock = PlacementUtils.register("white_gabbro_block", FeatureUtils.register("white_gabbro_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.WHITE_GABBRO_BLOCK.get().defaultBlockState())), CommonConfig.WHITE_GABBRO_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.WHITE_GABBRO_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedBimstoneBlock = PlacementUtils.register("bimstone_block", FeatureUtils.register("bimstone_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BIMSTONE_BLOCK.get().defaultBlockState())), CommonConfig.BIMSTONE_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.BIMSTONE_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedGneissBlock = PlacementUtils.register("gneiss_block", FeatureUtils.register("gneiss_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GNEISS_BLOCK.get().defaultBlockState())), CommonConfig.GNEISS_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.GNEISS_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        final Holder<PlacedFeature> placedAnorthositeBlock = PlacementUtils.register("anorthosite_block", FeatureUtils.register("anorthosite_block", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.ANORTHOSITE_BLOCK.get().defaultBlockState())), CommonConfig.ANORTHOSITE_PER_CHUNK.get())),
                OrePlacements.commonOrePlacement(CommonConfig.ANORTHOSITE_SOURCES_PER_CHUNK.get(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20))));

        if (CommonConfig.GENERATE_ARAGONIT_SOURCES.get())
            OVERWORLD_ORES.add(placedAragonitBlock.value());
        if (CommonConfig.GENERATE_LIMESTONE_SOURCES.get())
            OVERWORLD_ORES.add(placedLimestoneBlock.value());
        if (CommonConfig.GENERATE_GARAT_SOURCES.get())
            OVERWORLD_ORES.add(placedGaratBlock.value());
        if (CommonConfig.GENERATE_SLATE_SOURCES.get())
            OVERWORLD_ORES.add(placedSlateBlock.value());
        if (CommonConfig.GENERATE_MONZONITE_SOURCES.get())
            OVERWORLD_ORES.add(placedMonzoniteBlock.value());
        if (CommonConfig.GENERATE_NEPHELINE_SYENITE_SOURCES.get())
            OVERWORLD_ORES.add(placedNephelineSyeniteBlock.value());
        if (CommonConfig.GENERATE_GABBRO_SOURCES.get())
            OVERWORLD_ORES.add(placedGabbroBlock.value());
        if (CommonConfig.GENERATE_WHITE_GABBRO_SOURCES.get())
            OVERWORLD_ORES.add(placedWhiteGabbroBlock.value());
        if (CommonConfig.GENERATE_BIMSTONE_SOURCES.get())
            OVERWORLD_ORES.add(placedBimstoneBlock.value());
        if (CommonConfig.GENERATE_GNEISS_SOURCES.get())
            OVERWORLD_ORES.add(placedGneissBlock.value());
        if (CommonConfig.GENERATE_ANORTHOSITE_SOURCES.get())
            OVERWORLD_ORES.add(placedAnorthositeBlock.value());

    }
}