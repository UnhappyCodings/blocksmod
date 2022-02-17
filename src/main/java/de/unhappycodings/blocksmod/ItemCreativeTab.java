package de.unhappycodings.blocksmod;

import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.item.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class ItemCreativeTab extends CreativeModeTab {

    public ItemCreativeTab() {
        super(BlocksMod.MOD_ID + ".items");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(ModBlocks.LIMESTONE.get());
    }

    @Override
    public void fillItemList(@NotNull NonNullList<ItemStack> items) {
        int index = 0;

        ArrayList<Block> blockList = new ArrayList<>();
        Collections.addAll(blockList,
                ModBlocks.LIMESTONE_SHROOMLIGHT.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_SHROOMLIGHT.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_SHROOMLIGHT.get(),
                ModBlocks.LIMESTONE_GLOWSTONE.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_GLOWSTONE.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_GLOWSTONE.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_GLOWSTONE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_GLOWSTONE.get(),

                ModBlocks.LIMESTONE.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE.get(),
                ModBlocks.LIMESTONE_LINED_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get(),
                ModBlocks.LIMESTONE_TILE_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get(),
                ModBlocks.LIMESTONE_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get(),

                ModBlocks.LIMESTONE_PILLAR.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PILLAR.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_PILLAR.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_PILLAR.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_PILLAR.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_PILLAR.get(),

                ModBlocks.LIMESTONE_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_STAIRS.get(),
                ModBlocks.LIMESTONE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_TILE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_LINED_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS.get(),

                ModBlocks.LIMESTONE_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_SLAB.get(),
                ModBlocks.LIMESTONE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_TILE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_LINED_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB.get(),

                ModBlocks.LIMESTONE_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get(),
                ModBlocks.LIMESTONE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_TILE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_LINED_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get(),

                ModBlocks.LIMESTONE_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_TILE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_LINED_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE.get(),

                ModBlocks.LIMESTONE_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_BUTTON.get(),
                ModBlocks.LIMESTONE_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_LINED_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_TILE_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON.get(),

                ModBlocks.LIMESTONE_LEVER.get(),
                ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LEVER.get(),
                ModBlocks.LIMESTONE_SMOOTH_FAIR_LEVER.get(),
                ModBlocks.LIMESTONE_SMOOTH_GREAT_LEVER.get(),
                ModBlocks.LIMESTONE_SMOOTH_HEAVY_LEVER.get(),
                ModBlocks.LIMESTONE_SMOOTH_FINE_LEVER.get(),

                ModBlocks.GARAT_BLOCK.get(),
                ModBlocks.SLATE_BLOCK.get(),
                ModBlocks.MONZONITE_BLOCK.get(),
                ModBlocks.NEPHELINE_SYENITE_BLOCK.get(),
                ModBlocks.GABBRO_BLOCK.get(),
                ModBlocks.BIMSTONE_BLOCK.get(),
                ModBlocks.GNEISS_BLOCK.get(),
                ModBlocks.WHITE_GABBRO_BLOCK.get(),
                ModBlocks.ANORTHOSITE_BLOCK.get()
        );

        for (Block i : blockList) {
            items.add(index, new ItemStack(i));
            index++;
        }

        ArrayList<Item> itemList = new ArrayList<>();
        Collections.addAll(itemList, ModItems.SANDING_PAPER.get());
        for (Item i : itemList) {
            items.add(index, new ItemStack(i));
            index++;
        }
    }

}
