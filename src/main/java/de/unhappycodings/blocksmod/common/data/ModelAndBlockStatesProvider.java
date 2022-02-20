package de.unhappycodings.blocksmod.common.data;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModelAndBlockStatesProvider extends BlockStateProvider {

    public ModelAndBlockStatesProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BlocksMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.LIMESTONE.get());
        stairsBlock(ModBlocks.LIMESTONE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));
        slabBlock(ModBlocks.LIMESTONE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));
        buttonBlock(ModBlocks.LIMESTONE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));
        pressurePlateBlock(ModBlocks.LIMESTONE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));
        wallBlock(ModBlocks.LIMESTONE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));

        //region Nepheline Syenite
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_BLOCK.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));

        simpleBlock(ModBlocks.NEPHELINE_SYENITE_BRICK.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));

        simpleBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));

        simpleBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        simpleBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        slabBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        buttonBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        pressurePlateBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        wallBlock(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        //endregion


        //region Anorthosite
        simpleBlock(ModBlocks.ANORTHOSITE_BLOCK.get());
        stairsBlock(ModBlocks.ANORTHOSITE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        slabBlock(ModBlocks.ANORTHOSITE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        buttonBlock(ModBlocks.ANORTHOSITE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        wallBlock(ModBlocks.ANORTHOSITE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        simpleBlock(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        slabBlock(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        buttonBlock(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        wallBlock(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        simpleBlock(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        slabBlock(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        buttonBlock(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        wallBlock(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        simpleBlock(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        slabBlock(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        buttonBlock(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        wallBlock(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        simpleBlock(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        slabBlock(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        buttonBlock(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        wallBlock(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        simpleBlock(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.ANORTHOSITE_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));
        slabBlock(ModBlocks.ANORTHOSITE_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));
        buttonBlock(ModBlocks.ANORTHOSITE_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));
        wallBlock(ModBlocks.ANORTHOSITE_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));

        simpleBlock(ModBlocks.ANORTHOSITE_BRICK.get());
        stairsBlock(ModBlocks.ANORTHOSITE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));

        simpleBlock(ModBlocks.ANORTHOSITE_LINED_BRICK.get());
        stairsBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));

        simpleBlock(ModBlocks.ANORTHOSITE_TILE_BRICK.get());
        stairsBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get());
        stairsBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get());
        stairsBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get());
        stairsBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        simpleBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get());
        stairsBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        slabBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        buttonBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        pressurePlateBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        wallBlock(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        //endregion


        //region Other
        simpleBlock(ModBlocks.ARAGONIT_BLOCK.get());
        simpleBlock(ModBlocks.GNEISS_BLOCK.get());
        simpleBlock(ModBlocks.GABBRO_BLOCK.get());
        simpleBlock(ModBlocks.WHITE_GABBRO_BLOCK.get());
        simpleBlock(ModBlocks.MONZONITE_BLOCK.get());
        simpleBlock(ModBlocks.BIMSTONE_BLOCK.get());
        simpleBlock(ModBlocks.GARAT_BLOCK.get());
        simpleBlock(ModBlocks.SLATE_BLOCK.get());

        simpleBlock(ModBlocks.WIRELESS_LAMP_CONTROLLER.get());
        //endregion


        //region Bricks Limestone
        simpleBlock(ModBlocks.LIMESTONE_LINED_BRICK.get());
        buttonBlock(ModBlocks.LIMESTONE_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));
        stairsBlock(ModBlocks.LIMESTONE_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));
        slabBlock(ModBlocks.LIMESTONE_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));
        wallBlock(ModBlocks.LIMESTONE_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));

        simpleBlock(ModBlocks.LIMESTONE_TILE_BRICK.get());
        buttonBlock(ModBlocks.LIMESTONE_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));
        stairsBlock(ModBlocks.LIMESTONE_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));
        slabBlock(ModBlocks.LIMESTONE_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));
        wallBlock(ModBlocks.LIMESTONE_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));

        simpleBlock(ModBlocks.LIMESTONE_BRICK.get());
        buttonBlock(ModBlocks.LIMESTONE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        stairsBlock(ModBlocks.LIMESTONE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        slabBlock(ModBlocks.LIMESTONE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        wallBlock(ModBlocks.LIMESTONE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        //endregion


        //region Slight Limestone
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get());
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));

        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        //endregion


        //region Fair Limestone
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR.get());
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));

        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        //endregion


        //region Great Limestone
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT.get());
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));

        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great"));
        //endregion


        //region Heavy Limestone
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get());
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));

        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        //endregion


        //region Fine Limestone
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FINE.get());
        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));

        simpleBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get());
        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));

        stairsBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_STAIRS.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        slabBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_SLAB.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        buttonBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_BUTTON.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        pressurePlateBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        wallBlock(ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get(), new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        //endregion


    }
}