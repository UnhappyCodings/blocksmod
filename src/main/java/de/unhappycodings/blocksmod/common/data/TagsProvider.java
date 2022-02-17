package de.unhappycodings.blocksmod.common.data;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.util.Registration;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.Objects;

public class TagsProvider extends net.minecraft.data.tags.TagsProvider<Block> {

    @SuppressWarnings("deprecation")
    protected TagsProvider(DataGenerator p_126546_, ExistingFileHelper existingFileHelper) {
        super(p_126546_, Registry.BLOCK, BlocksMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FAIR_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_GREAT_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_HEAVY_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FINE_WALL.get());

        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FAIR_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_GREAT_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_HEAVY_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FINE_BRICK_WALL.get());

        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_TILE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL.get());

        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_LINED_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL.get());

        for (RegistryObject<Block> block : Registration.BLOCKS.getEntries()) {
            String curBlock = Objects.requireNonNull(block.get().getRegistryName()).getPath();
            if (!curBlock.contains("lamp") || !curBlock.contains("button") || !curBlock.contains("lever")) {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get());
            }
        }

    }

    @NotNull
    @Override
    protected Path getPath(ResourceLocation p_126561_) {
        return this.generator.getOutputFolder().resolve("data/" + p_126561_.getNamespace() + "/tags/blocks/" + p_126561_.getPath() + ".json");
    }

    @NotNull
    @Override
    public String getName() {
        return "Block tags";
    }
}