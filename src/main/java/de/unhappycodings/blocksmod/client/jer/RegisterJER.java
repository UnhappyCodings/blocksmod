package de.unhappycodings.blocksmod.client.jer;

import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import jeresources.api.distributions.DistributionSquare;
import jeresources.api.drop.LootDrop;
import jeresources.api.restrictions.DimensionRestriction;
import jeresources.api.restrictions.Restriction;
import jeresources.compatibility.CompatBase;
import jeresources.entry.WorldGenEntry;
import net.minecraft.world.item.ItemStack;

public class RegisterJER extends CompatBase {

    @Override
    public void init(boolean worldGen) {
        registerOres();
    }

    private void registerOres() {
        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.ARAGONIT_BLOCK.get()), new DistributionSquare(CommonConfig.ARAGONIT_SOURCES_PER_CHUNK.get(), CommonConfig.ARAGONIT_PER_CHUNK.get(), -64, 20),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.ARAGONIT_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.LIMESTONE.get()), new DistributionSquare(CommonConfig.LIMESTONE_SOURCES_PER_CHUNK.get(), CommonConfig.LIMESTONE_PER_CHUNK.get(), 0, 60),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.LIMESTONE.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.GARAT_BLOCK.get()), new DistributionSquare(CommonConfig.GARAT_SOURCES_PER_CHUNK.get(), CommonConfig.GARAT_PER_CHUNK.get(), -64, -10),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.GARAT_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.SLATE_BLOCK.get()), new DistributionSquare(CommonConfig.SLATE_SOURCES_PER_CHUNK.get(), CommonConfig.SLATE_PER_CHUNK.get(), -64, -10),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.SLATE_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.MONZONITE_BLOCK.get()), new DistributionSquare(CommonConfig.MONZONITE_SOURCES_PER_CHUNK.get(), CommonConfig.MONZONITE_PER_CHUNK.get(), -64, -10),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.MONZONITE_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.NEPHELINE_SYENITE_BLOCK.get()), new DistributionSquare(CommonConfig.NEPHELINE_SYENITE_SOURCES_PER_CHUNK.get(), CommonConfig.NEPHELINE_SYENITE_PER_CHUNK.get(), -64, -20),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.NEPHELINE_SYENITE_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.GABBRO_BLOCK.get()), new DistributionSquare(CommonConfig.GABBRO_SOURCES_PER_CHUNK.get(), CommonConfig.GABBRO_PER_CHUNK.get(), -64, -15),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.GABBRO_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.WHITE_GABBRO_BLOCK.get()), new DistributionSquare(CommonConfig.WHITE_GABBRO_SOURCES_PER_CHUNK.get(), CommonConfig.WHITE_GABBRO_PER_CHUNK.get(), 5, 120),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.WHITE_GABBRO_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.BIMSTONE_BLOCK.get()), new DistributionSquare(CommonConfig.BIMSTONE_SOURCES_PER_CHUNK.get(), CommonConfig.BIMSTONE_PER_CHUNK.get(), -64, -15),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.BIMSTONE_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.GNEISS_BLOCK.get()), new DistributionSquare(CommonConfig.GNEISS_SOURCES_PER_CHUNK.get(), CommonConfig.GNEISS_PER_CHUNK.get(), -60, -30),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.GNEISS_BLOCK.get().asItem()))));

        registerWorldGen(new WorldGenEntry(new ItemStack(ModBlocks.ANORTHOSITE_BLOCK.get()), new DistributionSquare(CommonConfig.ANORTHOSITE_SOURCES_PER_CHUNK.get(), CommonConfig.ANORTHOSITE_PER_CHUNK.get(), 45, 120),
                new Restriction(DimensionRestriction.OVERWORLD), false, new LootDrop(new ItemStack(ModBlocks.ANORTHOSITE_BLOCK.get().asItem()))));
    }

}
