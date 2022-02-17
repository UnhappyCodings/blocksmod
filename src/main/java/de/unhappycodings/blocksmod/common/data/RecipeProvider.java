package de.unhappycodings.blocksmod.common.data;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.item.ModItems;
import de.unhappycodings.blocksmod.common.util.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider {

    public RecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        HashMap<ItemLike, ItemLike> items = new HashMap<>();
        items.put(ModBlocks.WHITE_LAMP.get(), Items.WHITE_DYE);
        items.put(ModBlocks.LIGHT_GRAY_LAMP.get(), Items.LIGHT_GRAY_DYE);
        items.put(ModBlocks.GRAY_LAMP.get(), Items.GRAY_DYE);
        items.put(ModBlocks.BLACK_LAMP.get(), Items.BLACK_DYE);
        items.put(ModBlocks.GREEN_LAMP.get(), Items.GREEN_DYE);
        items.put(ModBlocks.CYAN_LAMP.get(), Items.CYAN_DYE);
        items.put(ModBlocks.BLUE_LAMP.get(), Items.BLUE_DYE);
        items.put(ModBlocks.LIGHT_BLUE_LAMP.get(), Items.LIGHT_BLUE_DYE);
        items.put(ModBlocks.YELLOW_LAMP.get(), Items.YELLOW_DYE);
        items.put(ModBlocks.ORANGE_LAMP.get(), Items.ORANGE_DYE);
        items.put(ModBlocks.RED_LAMP.get(), Items.RED_DYE);
        items.put(ModBlocks.PINK_LAMP.get(), Items.PINK_DYE);
        items.put(ModBlocks.MAGENTA_LAMP.get(), Items.MAGENTA_DYE);
        items.put(ModBlocks.PURPLE_LAMP.get(), Items.PURPLE_DYE);

        HashMap<ItemLike, ItemLike> enlighted = new HashMap<>();
        enlighted.put(ModBlocks.WHITE_LAMP.get(), ModBlocks.WHITE_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.LIGHT_GRAY_LAMP.get(), ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.GRAY_LAMP.get(), ModBlocks.GRAY_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.BLACK_LAMP.get(), ModBlocks.BLACK_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.GREEN_LAMP.get(), ModBlocks.GREEN_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.CYAN_LAMP.get(), ModBlocks.CYAN_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.BLUE_LAMP.get(), ModBlocks.BLUE_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.LIGHT_BLUE_LAMP.get(), ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.YELLOW_LAMP.get(), ModBlocks.YELLOW_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.ORANGE_LAMP.get(), ModBlocks.ORANGE_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.RED_LAMP.get(), ModBlocks.RED_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.PINK_LAMP.get(), ModBlocks.PINK_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.MAGENTA_LAMP.get(), ModBlocks.MAGENTA_LAMP_ENLIGHTED.get());
        enlighted.put(ModBlocks.PURPLE_LAMP.get(), ModBlocks.PURPLE_LAMP_ENLIGHTED.get());

        Registration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .forEach((block) -> {
                    if (block.getRegistryName().getPath().contains("flat")) {
                        for (Map.Entry<ItemLike, ItemLike> item : enlighted.entrySet()) {
                            if (block.getRegistryName().getPath().contains(item.getKey().asItem().getRegistryName().getPath())) {
                                if (block.getRegistryName().getPath().contains("big")) {
                                    if (block.getRegistryName().getPath().contains("enlighted")) { // value=enlighted key=normal
                                        if (block.getRegistryName().getPath().contains("framed")) {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getValue())
                                                        .define('c', Items.IRON_NUGGET)
                                                        .pattern(" ac").pattern("aba").pattern("ca ")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }
                                        } else {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getValue())
                                                        .pattern(" a ").pattern("aba").pattern(" a ")
                                                        .unlockedBy("has_item", has(Items.IRON_NUGGET)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }

                                        }
                                    } else {
                                        if (block.getRegistryName().getPath().contains("framed")) {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getKey())
                                                        .define('c', Items.IRON_NUGGET)
                                                        .pattern(" ac").pattern("aba").pattern("ca ")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }
                                        } else {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getKey())
                                                        .pattern(" a ").pattern("aba").pattern(" a ")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }

                                        }
                                    }
                                } else if (block.getRegistryName().getPath().contains("huge")) {
                                    if (block.getRegistryName().getPath().contains("enlighted")) { // value=enlighted key=normal
                                        if (block.getRegistryName().getPath().contains("framed")) {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getValue())
                                                        .define('c', Items.IRON_NUGGET)
                                                        .pattern("caa").pattern("aba").pattern("aac")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }
                                        } else {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getValue())
                                                        .pattern(" aa").pattern("aba").pattern("aa ")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }

                                        }
                                    } else {
                                        if (block.getRegistryName().getPath().contains("framed")) {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getKey())
                                                        .define('c', Items.IRON_NUGGET)
                                                        .pattern("caa").pattern("aba").pattern("aac")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }
                                        } else {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getKey())
                                                        .pattern(" aa").pattern("aba").pattern("aa ")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }

                                        }
                                    }
                                } else {
                                    if (block.getRegistryName().getPath().contains("enlighted")) { // value=enlighted key=normal
                                        if (block.getRegistryName().getPath().contains("framed")) {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getValue())
                                                        .define('c', Items.IRON_NUGGET)
                                                        .pattern(" c ").pattern("aba").pattern(" c ")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }
                                        } else {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getValue())
                                                        .pattern("aba")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }

                                        }
                                    } else {
                                        if (block.getRegistryName().getPath().contains("framed")) {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getKey())
                                                        .define('c', Items.IRON_NUGGET)
                                                        .pattern(" c ").pattern("aba").pattern(" c ")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }
                                        } else {
                                            boolean usable = block.getRegistryName().getPath().contains("light_") && item.getValue().asItem().getRegistryName().getPath().contains("light_");
                                            if (!block.getRegistryName().getPath().contains("light_") && !item.getValue().asItem().getRegistryName().getPath().contains("light_"))
                                                usable = true;
                                            if (usable) {
                                                ShapedRecipeBuilder.shaped(block, 12)
                                                        .define('a', Items.IRON_INGOT)
                                                        .define('b', item.getKey())
                                                        .pattern("aba")
                                                        .unlockedBy("has_item", has(Items.IRON_INGOT)).save(consumer,
                                                                block.getRegistryName().getPath() + "_crafted");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                });

        for (Map.Entry<ItemLike, ItemLike> recipeItems : enlighted.entrySet()) {
            ShapelessRecipeBuilder.shapeless(recipeItems.getValue())
                    .requires(recipeItems.getKey())
                    .unlockedBy("has_x", has(recipeItems.getValue())).save(consumer,
                            Objects.requireNonNull(recipeItems.getKey().asItem().getRegistryName()).getPath() + "_enlighted");
            ShapelessRecipeBuilder.shapeless(recipeItems.getKey())
                    .requires(recipeItems.getValue())
                    .unlockedBy("has_x", has(recipeItems.getKey())).save(consumer,
                            Objects.requireNonNull(recipeItems.getValue().asItem().getRegistryName()).getPath() + "_enlighted_back");
        }

        for (Map.Entry<ItemLike, ItemLike> recipeItems : items.entrySet()) {
            ShapedRecipeBuilder.shaped(recipeItems.getKey())
                    .define('a', Items.GLASS_PANE)
                    .define('b', recipeItems.getValue())
                    .define('c', Items.REDSTONE_LAMP)
                    .define('d', ModItems.LUMINOUS_DUST.get())
                    .pattern("aba").pattern("aca").pattern("ada").unlockedBy("has_item", has(Items.GLASS_PANE)).save(consumer);

            for (Map.Entry<ItemLike, ItemLike> shapelessRecipeItems : items.entrySet()) {
                if (shapelessRecipeItems != recipeItems) {
                    ShapelessRecipeBuilder.shapeless(recipeItems.getKey())
                            .requires(shapelessRecipeItems.getKey())
                            .requires(recipeItems.getValue())
                            .unlockedBy("has_x", has(recipeItems.getKey())).save(consumer,
                                    Objects.requireNonNull(recipeItems.getKey().asItem().getRegistryName()).getPath() + "_dyed_" + Objects.requireNonNull(shapelessRecipeItems.getKey().asItem().getRegistryName()).getPath());
                }
            }
        }
        ShapelessRecipeBuilder.shapeless(ModItems.LUMINOUS_DUST.get())
                .requires(Items.REDSTONE)
                .requires(Items.GLOWSTONE_DUST)
                .unlockedBy("has_redstone", has(Items.REDSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.SANDING_PAPER.get(), 3)
                .define('a', Items.PAPER)
                .define('b', Items.SAND)
                .pattern("aaa").pattern("bbb").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.LINKING_CARD.get())
                .define('a', ModItems.LUMINOUS_DUST.get())
                .define('b', Items.IRON_INGOT)
                .define('c', Items.IRON_NUGGET)
                .pattern(" a ").pattern("cbc").pattern("cbc").unlockedBy("has_item", has(Items.REDSTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.LINKING_CARD.get())
                .requires(ModItems.LINKING_CARD.get())
                .unlockedBy("has_x", has(ModItems.LINKING_CARD.get())).save(consumer, ModItems.LINKING_CARD.get().getRegistryName().getPath() + "_from_self");
        ShapedRecipeBuilder.shaped(ModBlocks.WIRELESS_LAMP_CONTROLLER.get())
                .define('a', Items.REDSTONE_BLOCK)
                .define('b', Items.IRON_INGOT)
                .define('c', Items.IRON_NUGGET)
                .pattern("cbc").pattern("bab").pattern("cbc").unlockedBy("has_item", has(Items.REDSTONE_BLOCK)).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.WHITE_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.WHITE_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.WHITE_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.WHITE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP.get())
                .requires(ModBlocks.WHITE_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.WHITE_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP.get())
                .requires(ModBlocks.WHITE_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.WHITE_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.LIGHT_GRAY_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.LIGHT_GRAY_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.LIGHT_GRAY_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.GRAY_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.GRAY_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.GRAY_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP.get())
                .requires(ModBlocks.GRAY_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.GRAY_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP.get())
                .requires(ModBlocks.GRAY_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.GRAY_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.BLACK_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.BLACK_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.BLACK_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.BLACK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP.get())
                .requires(ModBlocks.BLACK_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.BLACK_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP.get())
                .requires(ModBlocks.BLACK_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.BLACK_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.GREEN_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.GREEN_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.GREEN_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.GREEN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP.get())
                .requires(ModBlocks.GREEN_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.GREEN_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP.get())
                .requires(ModBlocks.GREEN_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.GREEN_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.CYAN_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.CYAN_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.CYAN_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.CYAN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP.get())
                .requires(ModBlocks.CYAN_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.CYAN_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP.get())
                .requires(ModBlocks.CYAN_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.CYAN_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.BLUE_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.BLUE_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.BLUE_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.BLUE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP.get())
                .requires(ModBlocks.BLUE_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.BLUE_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP.get())
                .requires(ModBlocks.BLUE_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.BLUE_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.YELLOW_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.YELLOW_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.YELLOW_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.YELLOW_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP.get())
                .requires(ModBlocks.YELLOW_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.YELLOW_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP.get())
                .requires(ModBlocks.YELLOW_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.YELLOW_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.ORANGE_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ORANGE_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.ORANGE_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.ORANGE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP.get())
                .requires(ModBlocks.ORANGE_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.ORANGE_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP.get())
                .requires(ModBlocks.ORANGE_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.ORANGE_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.RED_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.RED_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.RED_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.RED_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.RED_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.RED_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP.get())
                .requires(ModBlocks.RED_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.RED_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP.get())
                .requires(ModBlocks.RED_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.RED_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");


        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.PINK_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.PINK_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PINK_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.PINK_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.PINK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP.get())
                .requires(ModBlocks.PINK_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.PINK_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP.get())
                .requires(ModBlocks.PINK_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.PINK_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.MAGENTA_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.MAGENTA_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP.get())
                .requires(ModBlocks.MAGENTA_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.MAGENTA_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP.get())
                .requires(ModBlocks.MAGENTA_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.MAGENTA_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_LAMP_STATIC.get(), 1)
                .define('a', ModBlocks.PURPLE_LAMP.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.PURPLE_LAMP.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_LAMP_STATIC_ENLIGHTED.get(), 1)
                .define('a', ModBlocks.PURPLE_LAMP_ENLIGHTED.get())
                .define('b', Items.REDSTONE_TORCH)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.PURPLE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP.get())
                .requires(ModBlocks.PURPLE_LAMP_STATIC.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_STATIC.get()))
                .save(consumer, ModBlocks.PURPLE_LAMP.get().getRegistryName().getPath() + "_from_static");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP.get())
                .requires(ModBlocks.PURPLE_LAMP_STATIC_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_STATIC_ENLIGHTED.get()))
                .save(consumer, ModBlocks.PURPLE_LAMP.get().getRegistryName().getPath() + "_from_static_enlighted");

        //region Tube Lamps
        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.WHITE_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.WHITE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.WHITE_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.WHITE_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.WHITE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.WHITE_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.WHITE_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.WHITE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.WHITE_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.WHITE_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.WHITE_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.WHITE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.WHITE_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.LIGHT_GRAY_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.LIGHT_GRAY_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.LIGHT_GRAY_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.LIGHT_GRAY_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.LIGHT_GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.GRAY_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.GRAY_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.GRAY_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.GRAY_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.GRAY_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.GRAY_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.GRAY_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.GRAY_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.GRAY_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.GRAY_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.BLACK_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.BLACK_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.BLACK_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.BLACK_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.BLACK_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.BLACK_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.BLACK_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.BLACK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.BLACK_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLACK_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.BLACK_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.BLACK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.BLACK_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.GREEN_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.GREEN_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.GREEN_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.GREEN_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.GREEN_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.GREEN_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.GREEN_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.GREEN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.GREEN_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.GREEN_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.GREEN_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.GREEN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.GREEN_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.CYAN_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.CYAN_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.CYAN_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.CYAN_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.CYAN_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.CYAN_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.CYAN_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.CYAN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.CYAN_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.CYAN_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.CYAN_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.CYAN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.CYAN_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.BLUE_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.BLUE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.BLUE_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.BLUE_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.BLUE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.BLUE_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.BLUE_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.BLUE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.BLUE_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.BLUE_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.BLUE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.LIGHT_BLUE_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.LIGHT_BLUE_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.LIGHT_BLUE_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.LIGHT_BLUE_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.LIGHT_BLUE_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.YELLOW_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.YELLOW_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.YELLOW_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.YELLOW_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.YELLOW_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.YELLOW_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.YELLOW_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.YELLOW_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.YELLOW_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.YELLOW_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.YELLOW_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.YELLOW_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.YELLOW_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.ORANGE_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ORANGE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.ORANGE_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.ORANGE_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.ORANGE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.ORANGE_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.ORANGE_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.ORANGE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.ORANGE_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.ORANGE_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.ORANGE_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.ORANGE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.ORANGE_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.RED_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.RED_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.RED_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.RED_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.RED_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.RED_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP.get())
                .requires(ModBlocks.RED_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.RED_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.RED_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.RED_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.RED_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.RED_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.RED_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.RED_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.RED_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.RED_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.RED_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.RED_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.RED_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.RED_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.PINK_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.PINK_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.PINK_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.PINK_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.PINK_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.PINK_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.PINK_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.PINK_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.PINK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.PINK_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PINK_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.PINK_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.PINK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.PINK_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.MAGENTA_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.MAGENTA_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.MAGENTA_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.MAGENTA_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.MAGENTA_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.MAGENTA_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.MAGENTA_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.MAGENTA_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_TUBE_LAMP.get(), 16)
                .define('a', ModBlocks.PURPLE_LAMP.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.PURPLE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_LEFT_OPEN.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_RIGHT_OPEN.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.PURPLE_TUBE_LAMP.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_TUBE_LAMP_EDGE.get(), 16)
                .define('a', ModBlocks.PURPLE_LAMP.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.PURPLE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN.get()))
                .save(consumer, ModBlocks.PURPLE_TUBE_LAMP_EDGE.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_TUBE_LAMP_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.PURPLE_LAMP_ENLIGHTED.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.PURPLE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.PURPLE_TUBE_LAMP_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");

        ShapedRecipeBuilder.shaped(ModBlocks.PURPLE_TUBE_LAMP_EDGE_ENLIGHTED.get(), 16)
                .define('a', ModBlocks.PURPLE_LAMP_ENLIGHTED.get())
                .pattern("   ").pattern("aa ").pattern("a  ").unlockedBy("has_item", has(ModBlocks.PURPLE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_TUBE_LAMP_EDGE_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED.get()))
                .save(consumer, ModBlocks.PURPLE_TUBE_LAMP_EDGE_ENLIGHTED.get().getRegistryName().getPath() + "_from_self");
        //endregion

        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON.get())
                .requires(ModBlocks.WHITE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON.get())
                .requires(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.WHITE_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.WHITE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.WHITE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);


        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON.get())
                .requires(ModBlocks.GRAY_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON.get())
                .requires(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.GRAY_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON.get())
                .requires(ModBlocks.BLACK_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON.get())
                .requires(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.BLACK_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLACK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLACK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON.get())
                .requires(ModBlocks.YELLOW_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON.get())
                .requires(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.YELLOW_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.YELLOW_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.YELLOW_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON.get())
                .requires(ModBlocks.ORANGE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON.get())
                .requires(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.ORANGE_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ORANGE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.ORANGE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON.get())
                .requires(ModBlocks.RED_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.RED_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON.get())
                .requires(ModBlocks.RED_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.RED_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.RED_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.RED_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.RED_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.RED_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.RED_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON.get())
                .requires(ModBlocks.GREEN_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON.get())
                .requires(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.GREEN_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.GREEN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.GREEN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON.get())
                .requires(ModBlocks.CYAN_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON.get())
                .requires(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.CYAN_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.CYAN_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.CYAN_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON.get())
                .requires(ModBlocks.BLUE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON.get())
                .requires(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.BLUE_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.LIGHT_BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON.get())
                .requires(ModBlocks.PINK_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.PINK_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON.get())
                .requires(ModBlocks.PINK_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.PINK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.PINK_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.PINK_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PINK_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.PINK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PINK_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON.get())
                .requires(ModBlocks.MAGENTA_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON.get())
                .requires(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.MAGENTA_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.MAGENTA_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.MAGENTA_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON.get())
                .requires(ModBlocks.PURPLE_LAMP.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_LAMP_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON.get())
                .requires(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_ENLIGHTED.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get().getRegistryName()) + "_back");
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE.get())
                .requires(ModBlocks.PURPLE_LAMP_BUTTON.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_BUTTON_ENLIGHTED.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.PURPLE_LAMP_BUTTON_TRIGGER_ENLIGHTED.get())
                .requires(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())
                .unlockedBy("has_x", has(ModBlocks.PURPLE_LAMP_BUTTON_TOGGLE_ENLIGHTED.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LAMP_BUTTON_TRIGGER.get())
                .define('a', ModBlocks.GREEN_LAMP_BUTTON.get())
                .define('b', ModBlocks.RED_LAMP_BUTTON.get())
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.GREEN_LAMP_BUTTON.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LAMP_BUTTON_TRIGGER_SMALL.get())
                .requires(ModBlocks.LAMP_BUTTON_TRIGGER.get())
                .unlockedBy("has_x", has(ModBlocks.LAMP_BUTTON_TRIGGER.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LAMP_BUTTON_TRIGGER_BIG.get())
                .requires(ModBlocks.LAMP_BUTTON_TRIGGER_SMALL.get())
                .unlockedBy("has_x", has(ModBlocks.LAMP_BUTTON_TRIGGER_SMALL.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LAMP_BUTTON_TRIGGER.get())
                .requires(ModBlocks.LAMP_BUTTON_TRIGGER_BIG.get())
                .unlockedBy("has_x", has(ModBlocks.LAMP_BUTTON_TRIGGER_BIG.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LAMP_BUTTON_TRIGGER_BIG.get().getRegistryName()) + "_back");

        //region Limestone Block Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_BUTTON.get())
                .requires(ModBlocks.LIMESTONE.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_LEVER.get())
                .define('a', ModBlocks.LIMESTONE.get())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_GLOWSTONE.get(), 2)
                .define('a', ModBlocks.LIMESTONE.get())
                .define('b', Blocks.GLOWSTONE)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SHROOMLIGHT.get(), 2)
                .define('a', ModBlocks.LIMESTONE.get())
                .define('b', Blocks.SHROOMLIGHT)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_PILLAR.get(), 2)
                .define('a', ModBlocks.LIMESTONE.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .define('b', Blocks.GLOWSTONE)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .define('b', Blocks.SHROOMLIGHT)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PILLAR.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_GLOWSTONE.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .define('b', Blocks.GLOWSTONE)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .define('b', Blocks.SHROOMLIGHT)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_PILLAR.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_GREAT_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_GLOWSTONE.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .define('b', Blocks.GLOWSTONE)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_SHROOMLIGHT.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .define('b', Blocks.SHROOMLIGHT)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_PILLAR.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_GLOWSTONE.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .define('b', Blocks.GLOWSTONE)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .define('b', Blocks.SHROOMLIGHT)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PILLAR.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FINE_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_GLOWSTONE.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .define('b', Blocks.GLOWSTONE)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_SHROOMLIGHT.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .define('b', Blocks.SHROOMLIGHT)
                .pattern("ab").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_PILLAR.get(), 2)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .pattern("a").pattern("a").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);

        // bricks
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())).save(consumer);

        // lined bricks
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_LINED_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())).save(consumer);

        // tile bricks
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_TILE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())
                .pattern("a  ").pattern("aa ").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())
                .pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get(), 6)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())
                .pattern("aaa").pattern("aaa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())
                .pattern("aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON.get())
                .requires(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())
                .unlockedBy("has_x", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())).save(consumer);

        //endregion

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .pattern("aa ").pattern("aa ").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())
                .pattern(" aa").pattern(" aa").pattern("   ").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())).save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get(), 4)
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())
                .pattern("   ").pattern(" aa").pattern(" aa").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())).save(consumer);

        //region Sanding Limestone Recipes
        //limestone block
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .define('a', ModBlocks.LIMESTONE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())).save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE.get())).save(consumer);

        // brick
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK.get().getRegistryName()) + "_sanding");

        // lined brick
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK.get().getRegistryName()) + "_sanding");

        // tile brick
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK.get().getRegistryName()) + "_sanding");

        // pillar
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PILLAR.get())
                .define('a', ModBlocks.LIMESTONE_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_PILLAR.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_PILLAR.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PILLAR.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PILLAR.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_PILLAR.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_PILLAR.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_PILLAR.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_PILLAR.get().getRegistryName()) + "_sanding");

        // stairs
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_STAIRS.get().getRegistryName()) + "_sanding");

        // brick stairs
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_STAIRS.get().getRegistryName()) + "_sanding");

        // tile stairs
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS.get().getRegistryName()) + "_sanding");

        // lined stairs
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS.get().getRegistryName()) + "_sanding");

        // slab
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_SLAB.get().getRegistryName()) + "_sanding");

        // brick slab
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_SLAB.get().getRegistryName()) + "_sanding");

        // tile slab
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB.get().getRegistryName()) + "_sanding");

        // lined slab
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB.get().getRegistryName()) + "_sanding");


        // WALL
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get())
                .define('a', ModBlocks.LIMESTONE_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get().getRegistryName()) + "_sanding");

        // brick WALL
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get().getRegistryName()) + "_sanding");

        // tile WALL
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get().getRegistryName()) + "_sanding");

        // lined WALL
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get().getRegistryName()) + "_sanding");


        // PRESSURE_PLATE
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        // brick PRESSURE_PLATE
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        // tile PRESSURE_PLATE
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");

        // lined PRESSURE_PLATE
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE.get().getRegistryName()) + "_sanding");


        // BUTTON
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BUTTON.get().getRegistryName()) + "_sanding");

        // brick BUTTON
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_BUTTON.get().getRegistryName()) + "_sanding");

        // tile BUTTON
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_TILE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_TILE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON.get().getRegistryName()) + "_sanding");

        // lined BUTTON
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_LINED_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LINED_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON.get().getRegistryName()) + "_sanding");


        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_LEVER.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_LEVER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LEVER.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LEVER.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LEVER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_LEVER.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_LEVER.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_LEVER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_LEVER.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_LEVER.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LEVER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LEVER.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_LEVER.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_LEVER.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_LEVER.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_LEVER.get().getRegistryName()) + "_sanding");

        // glowstone limestone
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE.get())
                .define('a', ModBlocks.LIMESTONE_GLOWSTONE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_GLOWSTONE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_GLOWSTONE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_GLOWSTONE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_GLOWSTONE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_GLOWSTONE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_GLOWSTONE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_GLOWSTONE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_GLOWSTONE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_GLOWSTONE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_GLOWSTONE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_GLOWSTONE.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_GLOWSTONE.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_GLOWSTONE.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_GLOWSTONE.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_GLOWSTONE.get().getRegistryName()) + "_sanding");


        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT.get())
                .define('a', ModBlocks.LIMESTONE_SHROOMLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SHROOMLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_GREAT_SHROOMLIGHT.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_GREAT_SHROOMLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_GREAT_SHROOMLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT.get().getRegistryName()) + "_sanding");
        ShapedRecipeBuilder.shaped(ModBlocks.LIMESTONE_SMOOTH_FINE_SHROOMLIGHT.get())
                .define('a', ModBlocks.LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT.get())
                .define('b', ModItems.SANDING_PAPER.get())
                .pattern("a").pattern("b").unlockedBy("has_item", has(ModBlocks.LIMESTONE_SMOOTH_FINE_SHROOMLIGHT.get())).save(consumer,
                        Objects.requireNonNull(ModBlocks.LIMESTONE_SMOOTH_FINE_SHROOMLIGHT.get().getRegistryName()) + "_sanding");
        //endregion
    }
}
