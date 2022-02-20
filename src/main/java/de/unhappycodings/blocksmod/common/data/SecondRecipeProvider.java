package de.unhappycodings.blocksmod.common.data;

import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

import java.util.Objects;
import java.util.function.Consumer;

public class SecondRecipeProvider extends RecipeProvider {

    public SecondRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        //region Nepheline Syenite Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_PILLAR.get(), 2)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get(), 2)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FAIR_PILLAR.get(), 2)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_GREAT_PILLAR.get(), 2)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_HEAVY_PILLAR.get(), 2)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FINE_PILLAR.get(), 2)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FAIR_PILLAR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_GREAT_PILLAR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FAIR_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FAIR_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_HEAVY_PILLAR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_GREAT_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_HEAVY_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FINE_PILLAR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_HEAVY_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FINE_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get());

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get());

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_BRICK_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get(), 4)
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BLOCK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");


        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.NEPHELINE_SYENITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");
        //endregion

        //region Anorthosite Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_PILLAR.get(), 2)
                .define('a', ModBlocks.ANORTHOSITE_BLOCK.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get(), 2)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FAIR_PILLAR.get(), 2)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_GREAT_PILLAR.get(), 2)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_HEAVY_PILLAR.get(), 2)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FINE_PILLAR.get(), 2)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get())
                .define('a', ModBlocks.ANORTHOSITE_BLOCK_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FAIR_PILLAR.get())
                .define('a', ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_SLIGHT_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FAIR_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_GREAT_PILLAR.get())
                .define('a', ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FAIR_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FAIR_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_GREAT_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_HEAVY_PILLAR.get())
                .define('a', ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_GREAT_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_HEAVY_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_HEAVY_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FINE_PILLAR.get())
                .define('a', ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_HEAVY_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FINE_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BLOCK_SMOOTH_FINE_PILLAR.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BLOCK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BLOCK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BLOCK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BLOCK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_BLOCK.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get());

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get());

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_BRICK_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_LINED_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_TILE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);


        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BLOCK.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get(), 4)
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.ANORTHOSITE_BLOCK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BLOCK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");


        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_TILE_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");

        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ANORTHOSITE_LINED_BRICK_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");
        //endregion

    }
}
