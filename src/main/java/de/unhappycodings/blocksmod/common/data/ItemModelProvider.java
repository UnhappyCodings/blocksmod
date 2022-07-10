package de.unhappycodings.blocksmod.common.data;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

    public ItemModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BlocksMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerModels() {

        //region Slate
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BLOCK_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_pillar"));

        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine"));

        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.SLATE_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/slate_block_smooth_fine_tile_brick"));
        //endregion

        //region Bimstone
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BLOCK_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_pillar"));

        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine"));

        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.BIMSTONE_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/bimstone_block_smooth_fine_tile_brick"));
        //endregion

        //region Gabbro
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_pillar"));

        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine"));

        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.GABBRO_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block_smooth_fine_tile_brick"));
        //endregion

        //region White Gabbro
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BLOCK_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_pillar"));

        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine"));

        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.WHITE_GABBRO_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_gabbro_block_smooth_fine_tile_brick"));
        //endregion

        //region Nepheline Syenite
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_pillar"));

        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine"));

        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block_smooth_fine_tile_brick"));
        //endregion

        //region Anorthosite

        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_pillar"));

        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine"));

        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        wallInventory(Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/anorthosite_block_smooth_fine_tile_brick"));
        //endregion

        //region Lamp Blocks
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.WHITE_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/white_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_gray_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.GRAY_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GRAY_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GRAY_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GRAY_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gray_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.BLACK_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BLACK_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BLACK_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BLACK_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/black_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.YELLOW_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/yellow_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.ORANGE_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/orange_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.RED_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.RED_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.RED_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.RED_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/red_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.GREEN_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GREEN_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GREEN_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GREEN_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/green_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.CYAN_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.CYAN_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.CYAN_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.CYAN_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/cyan_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.BLUE_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BLUE_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BLUE_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.BLUE_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/blue_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/light_blue_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.PINK_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.PINK_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.PINK_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.PINK_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/pink_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/magenta_lamp_block_on"));

        withExistingParent(Objects.requireNonNull(ModBlocks.PURPLE_LAMP.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block_enlighted"));
        withExistingParent(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_STATIC.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_STATIC_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block_enlighted"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block_on"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block"));
        buttonInventory(Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/purple_lamp_block_on"));
        //endregion

        //region Limestone
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SHROOMLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowshroom/limestone_block/limestone_block_shroomlight_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_GLOWSTONE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowstone/limestone_block/limestone_block_glowstone_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_tile_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_tile_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowshroom/limestone_block_smooth/slight/limestone_block_shroomlight_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowstone/limestone_block_smooth/slight/limestone_block_glowstone_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_slight"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_tile_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowshroom/limestone_block_smooth/fair/limestone_block_shroomlight_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_GLOWSTONE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowstone/limestone_block_smooth/fair/limestone_block_glowstone_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_tile_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_great_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_SHROOMLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowshroom/limestone_block_smooth/great/limestone_block_shroomlight_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_GLOWSTONE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowstone/limestone_block_smooth/great/limestone_block_glowstone_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fair"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_tile_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowshroom/limestone_block_smooth/heavy/limestone_block_shroomlight_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_GLOWSTONE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowstone/limestone_block_smooth/heavy/limestone_block_glowstone_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_heavy"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_lined_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_tile_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick_slab"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_brick"));

        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_PILLAR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_pillar"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_SHROOMLIGHT.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowshroom/limestone_block_smooth/fine/limestone_block_shroomlight_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_GLOWSTONE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_glowstone/limestone_block_smooth/fine/limestone_block_glowstone_c0"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_STAIRS.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_stairs"));
        withExistingParent(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_SLAB.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine_slab"));
        buttonInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BUTTON.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        pressurePlate(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        wallInventory(Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/limestone_block_smooth_fine"));
        //endregion

        //region Other
        withExistingParent(Objects.requireNonNull(ModBlocks.ARAGONIT_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/aragonit_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GNEISS_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gneiss_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GARAT_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/garat_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.GABBRO_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/gabbro_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.MONZONITE_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/monzonite_block"));
        withExistingParent(Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/nepheline_syenite_block"));

        withExistingParent(Objects.requireNonNull(ModBlocks.WIRELESS_LAMP_CONTROLLER.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/wireless_lamp_controller"));
        withExistingParent(Objects.requireNonNull(ModBlocks.PLAYER_SENSOR.get().getRegistryName()).toString(),
                new ResourceLocation(BlocksMod.MOD_ID, "block/player_sensor_off"));

        simpleItem(ModItems.LUMINOUS_DUST.get());
        simpleItem(ModItems.SANDING_PAPER.get());
        simpleItem(ModItems.LINKING_CARD.get());
        //endregion

    }

    private void simpleItem(Item item) {
        withExistingParent(Objects.requireNonNull(item.getRegistryName()).toString(), "item/generated").texture("layer0",
                new ResourceLocation(this.modid, "item/" + item.getRegistryName().getPath()));
    }
}
