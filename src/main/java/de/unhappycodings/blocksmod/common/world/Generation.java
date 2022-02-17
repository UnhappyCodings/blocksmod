package de.unhappycodings.blocksmod.common.world;

import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.ArrayList;
import java.util.List;

public class Generation {
    public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();

    public static void registerOres() {
        /*
                final ConfiguredFeature<SimpleBlockConfiguration, ?> MOSS_VEGETATION = FeatureUtils.register("moss_vegetation",
                        Feature.SIMPLE_BLOCK.configured(new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList
                                .<BlockState>builder().add(Blocks.FLOWERING_AZALEA.defaultBlockState(), 4)
                                .add(Blocks.AZALEA.defaultBlockState(), 7)
                                .add(Blocks.MOSS_CARPET.defaultBlockState(), 25)
                                .add(Blocks.GRASS.defaultBlockState(), 50)
                                .add(Blocks.TALL_GRASS.defaultBlockState(), 10)))));

                final ConfiguredFeature<VegetationPatchConfiguration, ?> MOSS_PATCH = FeatureUtils.register("moss_patch",
                        Feature.VEGETATION_PATCH.configured(new VegetationPatchConfiguration(BlockTags.MOSS_REPLACEABLE.getName(),
                                BlockStateProvider.simple(Blocks.MOSS_BLOCK), MOSS_VEGETATION::placed, CaveSurface.FLOOR,
                                ConstantInt.of(1), 0.0F, 5, 0.8F, UniformInt.of(4, 7), 0.3F)));
         */

        final ConfiguredFeature<?, ?> aragonitBlock = FeatureUtils.register("aragonit_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.ARAGONIT_BLOCK.get().defaultBlockState())), CommonConfig.ARAGONIT_PER_CHUNK.get())));
        final PlacedFeature placedAragonitBlock = PlacementUtils.register("aragonit_block",
                aragonitBlock.placed(OrePlacements.commonOrePlacement(CommonConfig.ARAGONIT_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(20)))));

        final ConfiguredFeature<?, ?> limestoneBlock = FeatureUtils.register("limestone_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.LIMESTONE.get().defaultBlockState())), CommonConfig.LIMESTONE_PER_CHUNK.get())));
        final PlacedFeature placedLimestoneBlock = PlacementUtils.register("limestone_block",
                limestoneBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.LIMESTONE_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));

        final ConfiguredFeature<?, ?> garatBlock = FeatureUtils.register("garat_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GARAT_BLOCK.get().defaultBlockState())), CommonConfig.GARAT_PER_CHUNK.get())));
        final PlacedFeature placedGaratBlock = PlacementUtils.register("garat_block",
                garatBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.GARAT_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-10)))));

        final ConfiguredFeature<?, ?> slateBlock = FeatureUtils.register("slate_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.SLATE_BLOCK.get().defaultBlockState())), CommonConfig.SLATE_PER_CHUNK.get())));
        final PlacedFeature placedSlateBlock = PlacementUtils.register("slate_block",
                slateBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.SLATE_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-10)))));

        final ConfiguredFeature<?, ?> monzoniteBlock = FeatureUtils.register("monzonite_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.MONZONITE_BLOCK.get().defaultBlockState())), CommonConfig.MONZONITE_PER_CHUNK.get())));
        final PlacedFeature placedMonzoniteBlock = PlacementUtils.register("monzonite_block",
                monzoniteBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.MONZONITE_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-10)))));

        final ConfiguredFeature<?, ?> nephelineSyeniteBlock = FeatureUtils.register("nepheline_syenite_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.NEPHELINE_SYENITE_BLOCK.get().defaultBlockState())), CommonConfig.NEPHELINE_SYENITE_PER_CHUNK.get())));
        final PlacedFeature placedNephelineSyeniteBlock = PlacementUtils.register("nepheline_syenite_block",
                nephelineSyeniteBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.NEPHELINE_SYENITE_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-20)))));

        final ConfiguredFeature<?, ?> gabbroBlock = FeatureUtils.register("gabbro_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GABBRO_BLOCK.get().defaultBlockState())), CommonConfig.GABBRO_PER_CHUNK.get())));
        final PlacedFeature placedGabbroBlock = PlacementUtils.register("gabbro_block",
                gabbroBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.GABBRO_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-15)))));

        final ConfiguredFeature<?, ?> whiteGabbroBlock = FeatureUtils.register("white_gabbro_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.WHITE_GABBRO_BLOCK.get().defaultBlockState())), CommonConfig.WHITE_GABBRO_PER_CHUNK.get())));
        final PlacedFeature placedWhiteGabbroBlock = PlacementUtils.register("white_gabbro_block",
                whiteGabbroBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.WHITE_GABBRO_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.absolute(5), VerticalAnchor.absolute(120)))));

        final ConfiguredFeature<?, ?> bimstoneBlock = FeatureUtils.register("bimstone_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.BIMSTONE_BLOCK.get().defaultBlockState())), CommonConfig.BIMSTONE_PER_CHUNK.get())));
        final PlacedFeature placedBimstoneBlock = PlacementUtils.register("bimstone_block",
                bimstoneBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.BIMSTONE_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-15)))));

        final ConfiguredFeature<?, ?> gneissBlock = FeatureUtils.register("gneiss_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.GNEISS_BLOCK.get().defaultBlockState())), CommonConfig.GNEISS_PER_CHUNK.get())));
        final PlacedFeature placedGneissBlock = PlacementUtils.register("gneiss_block",
                gneissBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.GNEISS_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(-30)))));

        final ConfiguredFeature<?, ?> anorthositeBlock = FeatureUtils.register("anorthosite_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.ANORTHOSITE_BLOCK.get().defaultBlockState())), CommonConfig.ANORTHOSITE_PER_CHUNK.get())));
        final PlacedFeature placedAnorthositeBlock = PlacementUtils.register("anorthosite_block",
                anorthositeBlock.placed(OrePlacements.rareOrePlacement(CommonConfig.ANORTHOSITE_SOURCES_PER_CHUNK.get(), HeightRangePlacement
                        .uniform(VerticalAnchor.absolute(45), VerticalAnchor.absolute(120)))));

        if (CommonConfig.GENERATE_ARAGONIT_SOURCES.get())
            OVERWORLD_ORES.add(placedAragonitBlock);
        if (CommonConfig.GENERATE_LIMESTONE_SOURCES.get())
            OVERWORLD_ORES.add(placedLimestoneBlock);
        if (CommonConfig.GENERATE_GARAT_SOURCES.get())
            OVERWORLD_ORES.add(placedGaratBlock);
        if (CommonConfig.GENERATE_SLATE_SOURCES.get())
            OVERWORLD_ORES.add(placedSlateBlock);
        if (CommonConfig.GENERATE_MONZONITE_SOURCES.get())
            OVERWORLD_ORES.add(placedMonzoniteBlock);
        if (CommonConfig.GENERATE_NEPHELINE_SYENITE_SOURCES.get())
            OVERWORLD_ORES.add(placedNephelineSyeniteBlock);
        if (CommonConfig.GENERATE_GABBRO_SOURCES.get())
            OVERWORLD_ORES.add(placedGabbroBlock);
        if (CommonConfig.GENERATE_WHITE_GABBRO_SOURCES.get())
            OVERWORLD_ORES.add(placedWhiteGabbroBlock);
        if (CommonConfig.GENERATE_BIMSTONE_SOURCES.get())
            OVERWORLD_ORES.add(placedBimstoneBlock);
        if (CommonConfig.GENERATE_GNEISS_SOURCES.get())
            OVERWORLD_ORES.add(placedGneissBlock);
        if (CommonConfig.GENERATE_ANORTHOSITE_SOURCES.get())
            OVERWORLD_ORES.add(placedAnorthositeBlock);

    }
}