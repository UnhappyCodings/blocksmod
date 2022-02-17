package de.unhappycodings.blocksmod.common.block;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.util.Registration;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {

    //region Other
    public static final RegistryObject<Block> ARAGONIT_BLOCK =
            register("aragonit_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GNEISS_BLOCK =
            register("gneiss_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GABBRO_BLOCK =
            register("gabbro_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_GABBRO_BLOCK =
            register("white_gabbro_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MONZONITE_BLOCK =
            register("monzonite_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BIMSTONE_BLOCK =
            register("bimstone_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ANORTHOSITE_BLOCK =
            register("anorthosite_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NEPHELINE_SYENITE_BLOCK =
            register("nepheline_syenite_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GARAT_BLOCK =
            register("garat_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_BLOCK =
            register("slate_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));

    //endregion

    //region LAMP BUTTONS
    public static final RegistryObject<StoneButtonBlock> WHITE_LAMP_BUTTON =
            register("white_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> WHITE_LAMP_BUTTON_ENLIGHTED =
            register("white_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> WHITE_LAMP_BUTTON_TRIGGER =
            register("white_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> WHITE_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("white_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> WHITE_LAMP_BUTTON_TOGGLE =
            register("white_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> WHITE_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("white_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> LIGHT_GRAY_LAMP_BUTTON =
            register("light_gray_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> LIGHT_GRAY_LAMP_BUTTON_ENLIGHTED =
            register("light_gray_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> LIGHT_GRAY_LAMP_BUTTON_TRIGGER =
            register("light_gray_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> LIGHT_GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("light_gray_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> LIGHT_GRAY_LAMP_BUTTON_TOGGLE =
            register("light_gray_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> LIGHT_GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("light_gray_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> GRAY_LAMP_BUTTON =
            register("gray_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> GRAY_LAMP_BUTTON_ENLIGHTED =
            register("gray_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> GRAY_LAMP_BUTTON_TRIGGER =
            register("gray_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> GRAY_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("gray_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> GRAY_LAMP_BUTTON_TOGGLE =
            register("gray_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> GRAY_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("gray_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> BLACK_LAMP_BUTTON =
            register("black_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> BLACK_LAMP_BUTTON_ENLIGHTED =
            register("black_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> BLACK_LAMP_BUTTON_TRIGGER =
            register("black_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> BLACK_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("black_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> BLACK_LAMP_BUTTON_TOGGLE =
            register("black_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> BLACK_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("black_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> YELLOW_LAMP_BUTTON =
            register("yellow_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> YELLOW_LAMP_BUTTON_ENLIGHTED =
            register("yellow_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> YELLOW_LAMP_BUTTON_TRIGGER =
            register("yellow_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> YELLOW_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("yellow_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> YELLOW_LAMP_BUTTON_TOGGLE =
            register("yellow_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> YELLOW_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("yellow_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> ORANGE_LAMP_BUTTON =
            register("orange_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> ORANGE_LAMP_BUTTON_ENLIGHTED =
            register("orange_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> ORANGE_LAMP_BUTTON_TRIGGER =
            register("orange_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> ORANGE_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("orange_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> ORANGE_LAMP_BUTTON_TOGGLE =
            register("orange_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> ORANGE_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("orange_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> RED_LAMP_BUTTON =
            register("red_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> RED_LAMP_BUTTON_ENLIGHTED =
            register("red_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> RED_LAMP_BUTTON_TRIGGER =
            register("red_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> RED_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("red_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> RED_LAMP_BUTTON_TOGGLE =
            register("red_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> RED_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("red_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> GREEN_LAMP_BUTTON =
            register("green_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> GREEN_LAMP_BUTTON_ENLIGHTED =
            register("green_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> GREEN_LAMP_BUTTON_TRIGGER =
            register("green_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> GREEN_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("green_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> GREEN_LAMP_BUTTON_TOGGLE =
            register("green_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> GREEN_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("green_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> CYAN_LAMP_BUTTON =
            register("cyan_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> CYAN_LAMP_BUTTON_ENLIGHTED =
            register("cyan_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> CYAN_LAMP_BUTTON_TRIGGER =
            register("cyan_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> CYAN_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("cyan_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> CYAN_LAMP_BUTTON_TOGGLE =
            register("cyan_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> CYAN_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("cyan_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> BLUE_LAMP_BUTTON =
            register("blue_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> BLUE_LAMP_BUTTON_ENLIGHTED =
            register("blue_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> BLUE_LAMP_BUTTON_TRIGGER =
            register("blue_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("blue_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> BLUE_LAMP_BUTTON_TOGGLE =
            register("blue_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("blue_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> LIGHT_BLUE_LAMP_BUTTON =
            register("light_blue_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> LIGHT_BLUE_LAMP_BUTTON_ENLIGHTED =
            register("light_blue_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> LIGHT_BLUE_LAMP_BUTTON_TRIGGER =
            register("light_blue_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> LIGHT_BLUE_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("light_blue_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> LIGHT_BLUE_LAMP_BUTTON_TOGGLE =
            register("light_blue_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> LIGHT_BLUE_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("light_blue_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> PINK_LAMP_BUTTON =
            register("pink_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> PINK_LAMP_BUTTON_ENLIGHTED =
            register("pink_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> PINK_LAMP_BUTTON_TRIGGER =
            register("pink_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> PINK_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("pink_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> PINK_LAMP_BUTTON_TOGGLE =
            register("pink_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> PINK_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("pink_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> MAGENTA_LAMP_BUTTON =
            register("magenta_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> MAGENTA_LAMP_BUTTON_ENLIGHTED =
            register("magenta_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> MAGENTA_LAMP_BUTTON_TRIGGER =
            register("magenta_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> MAGENTA_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("magenta_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> MAGENTA_LAMP_BUTTON_TOGGLE =
            register("magenta_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> MAGENTA_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("magenta_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));

    public static final RegistryObject<StoneButtonBlock> PURPLE_LAMP_BUTTON =
            register("purple_lamp_button",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StoneButtonBlock> PURPLE_LAMP_BUTTON_ENLIGHTED =
            register("purple_lamp_button_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel((x) -> 15)));
    public static final RegistryObject<LampButtonTriggerBlock> PURPLE_LAMP_BUTTON_TRIGGER =
            register("purple_lamp_button_trigger", () -> new LampButtonTriggerBlock("normal", false));
    public static final RegistryObject<LampButtonTriggerBlock> PURPLE_LAMP_BUTTON_TRIGGER_ENLIGHTED =
            register("purple_lamp_button_trigger_enlighted", () -> new LampButtonTriggerBlock("normal", true));
    public static final RegistryObject<StoneButtonBlock> PURPLE_LAMP_BUTTON_TOGGLE =
            register("purple_lamp_button_toggle",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(false))));
    public static final RegistryObject<StoneButtonBlock> PURPLE_LAMP_BUTTON_TOGGLE_ENLIGHTED =
            register("purple_lamp_button_toggle_enlighted",
                    () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).lightLevel(poweredBlockEmission(true))));


    public static final RegistryObject<LampButtonTriggerBlock> LAMP_BUTTON_TRIGGER =
            register("lamp_button_trigger", () -> new LampButtonTriggerBlock("normal"));
    public static final RegistryObject<LampButtonTriggerBlock> LAMP_BUTTON_TRIGGER_BIG =
            register("lamp_button_trigger_big", () -> new LampButtonTriggerBlock("big"));
    public static final RegistryObject<LampButtonTriggerBlock> LAMP_BUTTON_TRIGGER_SMALL =
            register("lamp_button_trigger_small", () -> new LampButtonTriggerBlock("small"));
    //endregion

    //region LAMP BLOCKS

    public static final RegistryObject<LampStaticBlock> WHITE_LAMP_STATIC =
            register("white_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> WHITE_LAMP_STATIC_ENLIGHTED =
            register("white_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> WHITE_LAMP =
            register("white_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> WHITE_LAMP_ENLIGHTED =
            register("white_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> LIGHT_GRAY_LAMP_STATIC =
            register("light_gray_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> LIGHT_GRAY_LAMP_STATIC_ENLIGHTED =
            register("light_gray_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> LIGHT_GRAY_LAMP =
            register("light_gray_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> LIGHT_GRAY_LAMP_ENLIGHTED =
            register("light_gray_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> GRAY_LAMP_STATIC =
            register("gray_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> GRAY_LAMP_STATIC_ENLIGHTED =
            register("gray_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> GRAY_LAMP =
            register("gray_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> GRAY_LAMP_ENLIGHTED =
            register("gray_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> BLACK_LAMP_STATIC =
            register("black_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> BLACK_LAMP_STATIC_ENLIGHTED =
            register("black_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> BLACK_LAMP =
            register("black_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> BLACK_LAMP_ENLIGHTED =
            register("black_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> YELLOW_LAMP_STATIC =
            register("yellow_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> YELLOW_LAMP_STATIC_ENLIGHTED =
            register("yellow_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> YELLOW_LAMP =
            register("yellow_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> YELLOW_LAMP_ENLIGHTED =
            register("yellow_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> ORANGE_LAMP_STATIC =
            register("orange_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> ORANGE_LAMP_STATIC_ENLIGHTED =
            register("orange_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> ORANGE_LAMP =
            register("orange_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> ORANGE_LAMP_ENLIGHTED =
            register("orange_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> RED_LAMP_STATIC =
            register("red_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> RED_LAMP_STATIC_ENLIGHTED =
            register("red_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> RED_LAMP =
            register("red_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> RED_LAMP_ENLIGHTED =
            register("red_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> GREEN_LAMP_STATIC =
            register("green_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> GREEN_LAMP_STATIC_ENLIGHTED =
            register("green_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> GREEN_LAMP =
            register("green_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> GREEN_LAMP_ENLIGHTED =
            register("green_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> CYAN_LAMP_STATIC =
            register("cyan_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> CYAN_LAMP_STATIC_ENLIGHTED =
            register("cyan_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> CYAN_LAMP =
            register("cyan_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> CYAN_LAMP_ENLIGHTED =
            register("cyan_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> BLUE_LAMP_STATIC =
            register("blue_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> BLUE_LAMP_STATIC_ENLIGHTED =
            register("blue_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> BLUE_LAMP =
            register("blue_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> BLUE_LAMP_ENLIGHTED =
            register("blue_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> LIGHT_BLUE_LAMP_STATIC =
            register("light_blue_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> LIGHT_BLUE_LAMP_STATIC_ENLIGHTED =
            register("light_blue_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> LIGHT_BLUE_LAMP =
            register("light_blue_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> LIGHT_BLUE_LAMP_ENLIGHTED =
            register("light_blue_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> PINK_LAMP_STATIC =
            register("pink_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> PINK_LAMP_STATIC_ENLIGHTED =
            register("pink_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> PINK_LAMP =
            register("pink_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> PINK_LAMP_ENLIGHTED =
            register("pink_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> MAGENTA_LAMP_STATIC =
            register("magenta_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> MAGENTA_LAMP_STATIC_ENLIGHTED =
            register("magenta_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> MAGENTA_LAMP =
            register("magenta_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> MAGENTA_LAMP_ENLIGHTED =
            register("magenta_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    public static final RegistryObject<LampStaticBlock> PURPLE_LAMP_STATIC =
            register("purple_lamp_block_static",
                    () -> new LampStaticBlock(false));
    public static final RegistryObject<LampStaticBlock> PURPLE_LAMP_STATIC_ENLIGHTED =
            register("purple_lamp_block_static_enlighted",
                    () -> new LampStaticBlock(true));
    public static final RegistryObject<RedstoneLampBlock> PURPLE_LAMP =
            register("purple_lamp_block",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));
    public static final RegistryObject<RedstoneLampBlock> PURPLE_LAMP_ENLIGHTED =
            register("purple_lamp_block_enlighted",
                    () -> new RedstoneLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(litBlockEmission(true))));
    //endregion


    //region Limestone
    public static final RegistryObject<Block> LIMESTONE =
            register("limestone_block",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_LINED_BRICK =
            register("limestone_block_lined_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_LINED_BRICK_BUTTON =
            register("limestone_block_lined_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_LINED_BRICK_STAIRS =
            register("limestone_block_lined_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_LINED_BRICK_SLAB =
            register("limestone_block_lined_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_LINED_BRICK_WALL =
            register("limestone_block_lined_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_LINED_BRICK_PRESSURE_PLATE =
            register("limestone_block_lined_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_TILE_BRICK =
            register("limestone_block_tile_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_TILE_BRICK_BUTTON =
            register("limestone_block_tile_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_TILE_BRICK_STAIRS =
            register("limestone_block_tile_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_TILE_BRICK_SLAB =
            register("limestone_block_tile_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_TILE_BRICK_WALL =
            register("limestone_block_tile_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_TILE_BRICK_PRESSURE_PLATE =
            register("limestone_block_tile_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_BRICK =
            register("limestone_block_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_BRICK_BUTTON =
            register("limestone_block_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_BRICK_STAIRS =
            register("limestone_block_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_BRICK_SLAB =
            register("limestone_block_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_BRICK_WALL =
            register("limestone_block_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_BRICK_PRESSURE_PLATE =
            register("limestone_block_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_PILLAR =
            register("limestone_block_pillar",
                    () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<StairBlock> LIMESTONE_STAIRS =
            register("limestone_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SLAB =
            register("limestone_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_WALL =
            register("limestone_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_PRESSURE_PLATE =
            register("limestone_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_BUTTON =
            register("limestone_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<LeverBlock> LIMESTONE_LEVER =
            register("limestone_lever",
                    () -> new LeverBlock(Block.Properties.copy(Blocks.LEVER)));
    //endregion


    //region Slight Limestone
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_SLIGHT =
            register("limestone_block_smooth_slight",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK =
            register("limestone_block_smooth_slight_lined_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_BUTTON =
            register("limestone_block_smooth_slight_lined_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_STAIRS =
            register("limestone_block_smooth_slight_lined_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_SLAB =
            register("limestone_block_smooth_slight_lined_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_WALL =
            register("limestone_block_smooth_slight_lined_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_SLIGHT_LINED_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_slight_lined_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK =
            register("limestone_block_smooth_slight_tile_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_BUTTON =
            register("limestone_block_smooth_slight_tile_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_STAIRS =
            register("limestone_block_smooth_slight_tile_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_SLAB =
            register("limestone_block_smooth_slight_tile_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_WALL =
            register("limestone_block_smooth_slight_tile_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_SLIGHT_TILE_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_slight_tile_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_SLIGHT_BRICK =
            register("limestone_block_smooth_slight_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_SLIGHT_BRICK_BUTTON =
            register("limestone_block_smooth_slight_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_SLIGHT_BRICK_STAIRS =
            register("limestone_block_smooth_slight_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_SLIGHT_BRICK_SLAB =
            register("limestone_block_smooth_slight_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_SLIGHT_BRICK_WALL =
            register("limestone_block_smooth_slight_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_SLIGHT_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_slight_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_SLIGHT_PILLAR =
            register("limestone_block_smooth_slight_pillar",
                    () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_SLIGHT_STAIRS =
            register("limestone_block_smooth_slight_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_SLIGHT_SLAB =
            register("limestone_block_smooth_slight_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_SLIGHT_WALL =
            register("limestone_block_smooth_slight_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_SLIGHT_PRESSURE_PLATE =
            register("limestone_block_smooth_slight_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_SLIGHT_BUTTON =
            register("limestone_block_smooth_slight_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<LeverBlock> LIMESTONE_SMOOTH_SLIGHT_LEVER =
            register("limestone_block_smooth_slight_lever",
                    () -> new LeverBlock(Block.Properties.copy(Blocks.LEVER)));
    //endregion


    //region Fair Limestone
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FAIR =
            register("limestone_block_smooth_fair",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FAIR_LINED_BRICK =
            register("limestone_block_smooth_fair_lined_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FAIR_LINED_BRICK_BUTTON =
            register("limestone_block_smooth_fair_lined_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FAIR_LINED_BRICK_STAIRS =
            register("limestone_block_smooth_fair_lined_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FAIR_LINED_BRICK_SLAB =
            register("limestone_block_smooth_fair_lined_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FAIR_LINED_BRICK_WALL =
            register("limestone_block_smooth_fair_lined_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FAIR_LINED_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_fair_lined_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FAIR_TILE_BRICK =
            register("limestone_block_smooth_fair_tile_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FAIR_TILE_BRICK_BUTTON =
            register("limestone_block_smooth_fair_tile_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FAIR_TILE_BRICK_STAIRS =
            register("limestone_block_smooth_fair_tile_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FAIR_TILE_BRICK_SLAB =
            register("limestone_block_smooth_fair_tile_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FAIR_TILE_BRICK_WALL =
            register("limestone_block_smooth_fair_tile_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FAIR_TILE_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_fair_tile_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FAIR_BRICK =
            register("limestone_block_smooth_fair_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FAIR_BRICK_BUTTON =
            register("limestone_block_smooth_fair_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FAIR_BRICK_STAIRS =
            register("limestone_block_smooth_fair_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FAIR_BRICK_SLAB =
            register("limestone_block_smooth_fair_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FAIR_BRICK_WALL =
            register("limestone_block_smooth_fair_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FAIR_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_fair_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FAIR_PILLAR =
            register("limestone_block_smooth_fair_pillar",
                    () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FAIR_STAIRS =
            register("limestone_block_smooth_fair_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FAIR_SLAB =
            register("limestone_block_smooth_fair_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FAIR_WALL =
            register("limestone_block_smooth_fair_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FAIR_PRESSURE_PLATE =
            register("limestone_block_smooth_fair_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FAIR_BUTTON =
            register("limestone_block_smooth_fair_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<LeverBlock> LIMESTONE_SMOOTH_FAIR_LEVER =
            register("limestone_block_smooth_fair_lever",
                    () -> new LeverBlock(Block.Properties.copy(Blocks.LEVER)));
    //endregion


    //region Great Limestone
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_GREAT =
            register("limestone_block_smooth_great",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_GREAT_LINED_BRICK =
            register("limestone_block_smooth_great_lined_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_GREAT_LINED_BRICK_BUTTON =
            register("limestone_block_smooth_great_lined_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_GREAT_LINED_BRICK_STAIRS =
            register("limestone_block_smooth_great_lined_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_GREAT_LINED_BRICK_SLAB =
            register("limestone_block_smooth_great_lined_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_GREAT_LINED_BRICK_WALL =
            register("limestone_block_smooth_great_lined_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_GREAT_LINED_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_great_lined_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_GREAT_TILE_BRICK =
            register("limestone_block_smooth_great_tile_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_GREAT_TILE_BRICK_BUTTON =
            register("limestone_block_smooth_great_tile_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_GREAT_TILE_BRICK_STAIRS =
            register("limestone_block_smooth_great_tile_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_GREAT_TILE_BRICK_SLAB =
            register("limestone_block_smooth_great_tile_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_GREAT_TILE_BRICK_WALL =
            register("limestone_block_smooth_great_tile_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_GREAT_TILE_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_great_tile_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_GREAT_BRICK =
            register("limestone_block_smooth_great_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_GREAT_BRICK_BUTTON =
            register("limestone_block_smooth_great_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_GREAT_BRICK_STAIRS =
            register("limestone_block_smooth_great_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_GREAT_BRICK_SLAB =
            register("limestone_block_smooth_great_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_GREAT_BRICK_WALL =
            register("limestone_block_smooth_great_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_GREAT_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_great_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_GREAT_PILLAR =
            register("limestone_block_smooth_great_pillar",
                    () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_GREAT_STAIRS =
            register("limestone_block_smooth_great_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_GREAT_SLAB =
            register("limestone_block_smooth_great_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_GREAT_WALL =
            register("limestone_block_smooth_great_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_GREAT_PRESSURE_PLATE =
            register("limestone_block_smooth_great_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_GREAT_BUTTON =
            register("limestone_block_smooth_great_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<LeverBlock> LIMESTONE_SMOOTH_GREAT_LEVER =
            register("limestone_block_smooth_great_lever",
                    () -> new LeverBlock(Block.Properties.copy(Blocks.LEVER)));
    //endregion


    //region Heavy Limestone
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_HEAVY =
            register("limestone_block_smooth_heavy",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_HEAVY_LINED_BRICK =
            register("limestone_block_smooth_heavy_lined_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_BUTTON =
            register("limestone_block_smooth_heavy_lined_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_STAIRS =
            register("limestone_block_smooth_heavy_lined_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_SLAB =
            register("limestone_block_smooth_heavy_lined_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_WALL =
            register("limestone_block_smooth_heavy_lined_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_HEAVY_LINED_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_heavy_lined_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_HEAVY_TILE_BRICK =
            register("limestone_block_smooth_heavy_tile_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_BUTTON =
            register("limestone_block_smooth_heavy_tile_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_STAIRS =
            register("limestone_block_smooth_heavy_tile_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_SLAB =
            register("limestone_block_smooth_heavy_tile_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_WALL =
            register("limestone_block_smooth_heavy_tile_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_HEAVY_TILE_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_heavy_tile_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_HEAVY_BRICK =
            register("limestone_block_smooth_heavy_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_HEAVY_BRICK_BUTTON =
            register("limestone_block_smooth_heavy_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_HEAVY_BRICK_STAIRS =
            register("limestone_block_smooth_heavy_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_HEAVY_BRICK_SLAB =
            register("limestone_block_smooth_heavy_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_HEAVY_BRICK_WALL =
            register("limestone_block_smooth_heavy_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_HEAVY_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_heavy_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_HEAVY_PILLAR =
            register("limestone_block_smooth_heavy_pillar",
                    () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_HEAVY_STAIRS =
            register("limestone_block_smooth_heavy_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_HEAVY_SLAB =
            register("limestone_block_smooth_heavy_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_HEAVY_WALL =
            register("limestone_block_smooth_heavy_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_HEAVY_PRESSURE_PLATE =
            register("limestone_block_smooth_heavy_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_HEAVY_BUTTON =
            register("limestone_block_smooth_heavy_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<LeverBlock> LIMESTONE_SMOOTH_HEAVY_LEVER =
            register("limestone_block_smooth_heavy_lever",
                    () -> new LeverBlock(Block.Properties.copy(Blocks.LEVER)));
    //endregion


    //region Fine Limestone
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FINE =
            register("limestone_block_smooth_fine",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FINE_LINED_BRICK =
            register("limestone_block_smooth_fine_lined_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FINE_LINED_BRICK_BUTTON =
            register("limestone_block_smooth_fine_lined_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FINE_LINED_BRICK_STAIRS =
            register("limestone_block_smooth_fine_lined_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FINE_LINED_BRICK_SLAB =
            register("limestone_block_smooth_fine_lined_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FINE_LINED_BRICK_WALL =
            register("limestone_block_smooth_fine_lined_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FINE_LINED_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_fine_lined_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FINE_TILE_BRICK =
            register("limestone_block_smooth_fine_tile_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FINE_TILE_BRICK_BUTTON =
            register("limestone_block_smooth_fine_tile_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FINE_TILE_BRICK_STAIRS =
            register("limestone_block_smooth_fine_tile_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FINE_TILE_BRICK_SLAB =
            register("limestone_block_smooth_fine_tile_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FINE_TILE_BRICK_WALL =
            register("limestone_block_smooth_fine_tile_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FINE_TILE_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_fine_tile_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FINE_BRICK =
            register("limestone_block_smooth_fine_brick",
                    () -> new Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FINE_BRICK_BUTTON =
            register("limestone_block_smooth_fine_brick_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FINE_BRICK_STAIRS =
            register("limestone_block_smooth_fine_brick_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FINE_BRICK_SLAB =
            register("limestone_block_smooth_fine_brick_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FINE_BRICK_WALL =
            register("limestone_block_smooth_fine_brick_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FINE_BRICK_PRESSURE_PLATE =
            register("limestone_block_smooth_fine_brick_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LIMESTONE_SMOOTH_FINE_PILLAR =
            register("limestone_block_smooth_fine_pillar",
                    () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<StairBlock> LIMESTONE_SMOOTH_FINE_STAIRS =
            register("limestone_block_smooth_fine_stairs",
                    () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> LIMESTONE_SMOOTH_FINE_SLAB =
            register("limestone_block_smooth_fine_slab",
                    () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<WallBlock> LIMESTONE_SMOOTH_FINE_WALL =
            register("limestone_block_smooth_fine_wall",
                    () -> new WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<PressurePlateBlock> LIMESTONE_SMOOTH_FINE_PRESSURE_PLATE =
            register("limestone_block_smooth_fine_pressure_plate",
                    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final RegistryObject<ButtonBlock> LIMESTONE_SMOOTH_FINE_BUTTON =
            register("limestone_block_smooth_fine_button",
                    () -> new StoneButtonBlock(Block.Properties.copy(Blocks.STONE_BUTTON)));
    public static final RegistryObject<LeverBlock> LIMESTONE_SMOOTH_FINE_LEVER =
            register("limestone_block_smooth_fine_lever",
                    () -> new LeverBlock(Block.Properties.copy(Blocks.LEVER)));
    //endregion


    //region Glowstone & Shroomlight Limestone
    public static final RegistryObject<GlowstoneBlock> LIMESTONE_GLOWSTONE =
            register("limestone_block_glowstone", () -> new GlowstoneBlock("limestone_block_glowstone"));
    public static final RegistryObject<GlowstoneBlock> LIMESTONE_SMOOTH_SLIGHT_GLOWSTONE =
            register("limestone_block_smooth_slight_glowstone", () -> new GlowstoneBlock("limestone_block_smooth_slight_glowstone"));
    public static final RegistryObject<GlowstoneBlock> LIMESTONE_SMOOTH_FAIR_GLOWSTONE =
            register("limestone_block_smooth_fair_glowstone", () -> new GlowstoneBlock("limestone_block_smooth_fair_glowstone"));
    public static final RegistryObject<GlowstoneBlock> LIMESTONE_SMOOTH_GREAT_GLOWSTONE =
            register("limestone_block_smooth_great_glowstone", () -> new GlowstoneBlock("limestone_block_smooth_great_glowstone"));
    public static final RegistryObject<GlowstoneBlock> LIMESTONE_SMOOTH_FINE_GLOWSTONE =
            register("limestone_block_smooth_fine_glowstone", () -> new GlowstoneBlock("limestone_block_smooth_fine_glowstone"));
    public static final RegistryObject<GlowstoneBlock> LIMESTONE_SMOOTH_HEAVY_GLOWSTONE =
            register("limestone_block_smooth_heavy_glowstone", () -> new GlowstoneBlock("limestone_block_smooth_heavy_glowstone"));

    public static final RegistryObject<ShroomlightBlock> LIMESTONE_SHROOMLIGHT =
            register("limestone_block_shroomlight", () -> new ShroomlightBlock("limestone_block_shroomlight"));
    public static final RegistryObject<ShroomlightBlock> LIMESTONE_SMOOTH_SLIGHT_SHROOMLIGHT =
            register("limestone_block_smooth_slight_shroomlight", () -> new ShroomlightBlock("limestone_block_smooth_slight_shroomlight"));
    public static final RegistryObject<ShroomlightBlock> LIMESTONE_SMOOTH_FAIR_SHROOMLIGHT =
            register("limestone_block_smooth_fair_shroomlight", () -> new ShroomlightBlock("limestone_block_smooth_fair_shroomlight"));
    public static final RegistryObject<ShroomlightBlock> LIMESTONE_SMOOTH_GREAT_SHROOMLIGHT =
            register("limestone_block_smooth_great_shroomlight", () -> new ShroomlightBlock("limestone_block_smooth_great_shroomlight"));
    public static final RegistryObject<ShroomlightBlock> LIMESTONE_SMOOTH_FINE_SHROOMLIGHT =
            register("limestone_block_smooth_fine_shroomlight", () -> new ShroomlightBlock("limestone_block_smooth_fine_shroomlight"));
    public static final RegistryObject<ShroomlightBlock> LIMESTONE_SMOOTH_HEAVY_SHROOMLIGHT =
            register("limestone_block_smooth_heavy_shroomlight", () -> new ShroomlightBlock("limestone_block_smooth_heavy_shroomlight"));
    //endregion

    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT =
            register("white_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_ENLIGHTED =
            register("white_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_FRAMED =
            register("white_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("white_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_BIG =
            register("white_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_BIG_ENLIGHTED =
            register("white_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_BIG_FRAMED =
            register("white_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("white_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_HUGE =
            register("white_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_HUGE_ENLIGHTED =
            register("white_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_HUGE_FRAMED =
            register("white_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> WHITE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("white_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT =
            register("light_gray_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_ENLIGHTED =
            register("light_gray_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_FRAMED =
            register("light_gray_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("light_gray_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_BIG =
            register("light_gray_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_BIG_ENLIGHTED =
            register("light_gray_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_BIG_FRAMED =
            register("light_gray_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("light_gray_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_HUGE =
            register("light_gray_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_HUGE_ENLIGHTED =
            register("light_gray_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_HUGE_FRAMED =
            register("light_gray_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> LIGHT_GRAY_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("light_gray_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));


    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT =
            register("gray_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_ENLIGHTED =
            register("gray_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_FRAMED =
            register("gray_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("gray_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_BIG =
            register("gray_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_BIG_ENLIGHTED =
            register("gray_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_BIG_FRAMED =
            register("gray_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("gray_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_HUGE =
            register("gray_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_HUGE_ENLIGHTED =
            register("gray_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_HUGE_FRAMED =
            register("gray_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> GRAY_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("gray_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT =
            register("black_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_ENLIGHTED =
            register("black_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_FRAMED =
            register("black_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("black_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_BIG =
            register("black_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_BIG_ENLIGHTED =
            register("black_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_BIG_FRAMED =
            register("black_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("black_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_HUGE =
            register("black_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_HUGE_ENLIGHTED =
            register("black_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_HUGE_FRAMED =
            register("black_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> BLACK_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("black_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT =
            register("green_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_ENLIGHTED =
            register("green_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_FRAMED =
            register("green_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("green_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_BIG =
            register("green_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_BIG_ENLIGHTED =
            register("green_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_BIG_FRAMED =
            register("green_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("green_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_HUGE =
            register("green_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_HUGE_ENLIGHTED =
            register("green_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_HUGE_FRAMED =
            register("green_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> GREEN_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("green_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT =
            register("cyan_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_ENLIGHTED =
            register("cyan_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_FRAMED =
            register("cyan_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("cyan_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_BIG =
            register("cyan_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_BIG_ENLIGHTED =
            register("cyan_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_BIG_FRAMED =
            register("cyan_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("cyan_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_HUGE =
            register("cyan_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_HUGE_ENLIGHTED =
            register("cyan_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_HUGE_FRAMED =
            register("cyan_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> CYAN_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("cyan_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT =
            register("blue_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_ENLIGHTED =
            register("blue_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_FRAMED =
            register("blue_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("blue_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_BIG =
            register("blue_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_BIG_ENLIGHTED =
            register("blue_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_BIG_FRAMED =
            register("blue_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("blue_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_HUGE =
            register("blue_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_HUGE_ENLIGHTED =
            register("blue_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_HUGE_FRAMED =
            register("blue_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> BLUE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("blue_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT =
            register("light_blue_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_ENLIGHTED =
            register("light_blue_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_FRAMED =
            register("light_blue_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("light_blue_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_BIG =
            register("light_blue_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_BIG_ENLIGHTED =
            register("light_blue_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_BIG_FRAMED =
            register("light_blue_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("light_blue_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_HUGE =
            register("light_blue_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_HUGE_ENLIGHTED =
            register("light_blue_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_HUGE_FRAMED =
            register("light_blue_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> LIGHT_BLUE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("light_blue_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT =
            register("red_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_ENLIGHTED =
            register("red_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_FRAMED =
            register("red_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("red_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_BIG =
            register("red_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_BIG_ENLIGHTED =
            register("red_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_BIG_FRAMED =
            register("red_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("red_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_HUGE =
            register("red_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_HUGE_ENLIGHTED =
            register("red_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_HUGE_FRAMED =
            register("red_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> RED_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("red_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT =
            register("orange_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_ENLIGHTED =
            register("orange_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_FRAMED =
            register("orange_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("orange_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_BIG =
            register("orange_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_BIG_ENLIGHTED =
            register("orange_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_BIG_FRAMED =
            register("orange_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("orange_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_HUGE =
            register("orange_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_HUGE_ENLIGHTED =
            register("orange_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_HUGE_FRAMED =
            register("orange_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> ORANGE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("orange_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT =
            register("yellow_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_ENLIGHTED =
            register("yellow_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_FRAMED =
            register("yellow_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("yellow_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_BIG =
            register("yellow_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_BIG_ENLIGHTED =
            register("yellow_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_BIG_FRAMED =
            register("yellow_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("yellow_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_HUGE =
            register("yellow_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_HUGE_ENLIGHTED =
            register("yellow_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_HUGE_FRAMED =
            register("yellow_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> YELLOW_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("yellow_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT =
            register("pink_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_ENLIGHTED =
            register("pink_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_FRAMED =
            register("pink_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("pink_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_BIG =
            register("pink_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_BIG_ENLIGHTED =
            register("pink_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_BIG_FRAMED =
            register("pink_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("pink_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_HUGE =
            register("pink_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_HUGE_ENLIGHTED =
            register("pink_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_HUGE_FRAMED =
            register("pink_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> PINK_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("pink_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT =
            register("purple_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_ENLIGHTED =
            register("purple_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_FRAMED =
            register("purple_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("purple_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_BIG =
            register("purple_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_BIG_ENLIGHTED =
            register("purple_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_BIG_FRAMED =
            register("purple_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("purple_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_HUGE =
            register("purple_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_HUGE_ENLIGHTED =
            register("purple_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_HUGE_FRAMED =
            register("purple_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> PURPLE_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("purple_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT =
            register("magenta_lamp_block_flat",
                    () -> new LampFlatBlock(true, false, "normal"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_ENLIGHTED =
            register("magenta_lamp_block_flat_enlighted",
                    () -> new LampFlatBlock(true, true, "normal"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_FRAMED =
            register("magenta_lamp_block_flat_framed",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_FRAMED_ENLIGHTED =
            register("magenta_lamp_block_flat_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_BIG =
            register("magenta_lamp_block_flat_big",
                    () -> new LampFlatBlock(true, false, "framed"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_BIG_ENLIGHTED =
            register("magenta_lamp_block_flat_big_enlighted",
                    () -> new LampFlatBlock(true, true, "framed"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_BIG_FRAMED =
            register("magenta_lamp_block_flat_big_framed",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_BIG_FRAMED_ENLIGHTED =
            register("magenta_lamp_block_flat_big_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_HUGE =
            register("magenta_lamp_block_flat_huge",
                    () -> new LampFlatBlock(true, false, "big"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_HUGE_ENLIGHTED =
            register("magenta_lamp_block_flat_huge_enlighted",
                    () -> new LampFlatBlock(true, true, "big"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_HUGE_FRAMED =
            register("magenta_lamp_block_flat_huge_framed",
                    () -> new LampFlatBlock(true, false, "huge"));
    public static final RegistryObject<LampFlatBlock> MAGENTA_LAMP_FLAT_HUGE_FRAMED_ENLIGHTED =
            register("magenta_lamp_block_flat_huge_framed_enlighted",
                    () -> new LampFlatBlock(true, true, "huge"));

    public static final RegistryObject<WirelessLampControllerBlock> WIRELESS_LAMP_CONTROLLER =
            register("wireless_lamp_controller", WirelessLampControllerBlock::new);

    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP =
            register("white_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE =
            register("white_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_LEFT_OPEN =
            register("white_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("white_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_RIGHT_OPEN =
            register("white_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("white_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("white_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("white_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_ENLIGHTED =
            register("white_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE_ENLIGHTED =
            register("white_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("white_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("white_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("white_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("white_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("white_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> WHITE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("white_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP =
            register("light_gray_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE =
            register("light_gray_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN =
            register("light_gray_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("light_gray_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN =
            register("light_gray_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("light_gray_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("light_gray_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("light_gray_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_ENLIGHTED =
            register("light_gray_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE_ENLIGHTED =
            register("light_gray_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("light_gray_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("light_gray_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("light_gray_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("light_gray_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("light_gray_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("light_gray_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP =
            register("gray_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE =
            register("gray_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_LEFT_OPEN =
            register("gray_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("gray_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_RIGHT_OPEN =
            register("gray_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("gray_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("gray_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("gray_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_ENLIGHTED =
            register("gray_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE_ENLIGHTED =
            register("gray_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("gray_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("gray_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("gray_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("gray_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("gray_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GRAY_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("gray_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP =
            register("black_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE =
            register("black_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_LEFT_OPEN =
            register("black_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("black_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_RIGHT_OPEN =
            register("black_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("black_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("black_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("black_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_ENLIGHTED =
            register("black_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE_ENLIGHTED =
            register("black_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("black_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("black_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("black_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("black_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("black_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLACK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("black_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP =
            register("green_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE =
            register("green_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_LEFT_OPEN =
            register("green_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("green_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_RIGHT_OPEN =
            register("green_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("green_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("green_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("green_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_ENLIGHTED =
            register("green_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE_ENLIGHTED =
            register("green_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("green_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("green_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("green_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("green_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("green_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> GREEN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("green_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP =
            register("cyan_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE =
            register("cyan_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_LEFT_OPEN =
            register("cyan_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("cyan_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_RIGHT_OPEN =
            register("cyan_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("cyan_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("cyan_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("cyan_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_ENLIGHTED =
            register("cyan_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE_ENLIGHTED =
            register("cyan_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("cyan_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("cyan_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("cyan_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("cyan_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("cyan_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> CYAN_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("cyan_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP =
            register("blue_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE =
            register("blue_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_LEFT_OPEN =
            register("blue_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("blue_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_RIGHT_OPEN =
            register("blue_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("blue_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("blue_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("blue_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_ENLIGHTED =
            register("blue_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE_ENLIGHTED =
            register("blue_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("blue_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("blue_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("blue_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("blue_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("blue_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("blue_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP =
            register("light_blue_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE =
            register("light_blue_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN =
            register("light_blue_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("light_blue_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN =
            register("light_blue_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("light_blue_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("light_blue_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("light_blue_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_ENLIGHTED =
            register("light_blue_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE_ENLIGHTED =
            register("light_blue_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("light_blue_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("light_blue_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("light_blue_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("light_blue_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("light_blue_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> LIGHT_BLUE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("light_blue_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP =
            register("yellow_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE =
            register("yellow_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_LEFT_OPEN =
            register("yellow_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("yellow_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_RIGHT_OPEN =
            register("yellow_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("yellow_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("yellow_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("yellow_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_ENLIGHTED =
            register("yellow_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE_ENLIGHTED =
            register("yellow_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("yellow_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("yellow_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("yellow_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("yellow_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("yellow_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> YELLOW_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("yellow_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP =
            register("orange_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE =
            register("orange_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_LEFT_OPEN =
            register("orange_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("orange_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_RIGHT_OPEN =
            register("orange_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("orange_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("orange_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("orange_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_ENLIGHTED =
            register("orange_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE_ENLIGHTED =
            register("orange_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("orange_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("orange_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("orange_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("orange_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("orange_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> ORANGE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("orange_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP =
            register("red_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE =
            register("red_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_LEFT_OPEN =
            register("red_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("red_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_RIGHT_OPEN =
            register("red_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("red_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("red_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("red_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_ENLIGHTED =
            register("red_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE_ENLIGHTED =
            register("red_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("red_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("red_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("red_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("red_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("red_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> RED_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("red_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP =
            register("pink_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE =
            register("pink_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_LEFT_OPEN =
            register("pink_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("pink_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_RIGHT_OPEN =
            register("pink_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("pink_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("pink_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("pink_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_ENLIGHTED =
            register("pink_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE_ENLIGHTED =
            register("pink_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("pink_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("pink_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("pink_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("pink_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("pink_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PINK_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("pink_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP =
            register("magenta_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE =
            register("magenta_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_LEFT_OPEN =
            register("magenta_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("magenta_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_RIGHT_OPEN =
            register("magenta_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("magenta_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("magenta_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("magenta_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_ENLIGHTED =
            register("magenta_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE_ENLIGHTED =
            register("magenta_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("magenta_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("magenta_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("magenta_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("magenta_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("magenta_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> MAGENTA_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("magenta_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP =
            register("purple_tube_lamp", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE =
            register("purple_tube_lamp_edge", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_LEFT_OPEN =
            register("purple_tube_lamp_left_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN =
            register("purple_tube_lamp_edge_left_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_RIGHT_OPEN =
            register("purple_tube_lamp_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN =
            register("purple_tube_lamp_edge_right_open", () -> new TubeLampEdgeBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN =
            register("purple_tube_lamp_left_right_open", () -> new TubeLampBlock(true, false));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN =
            register("purple_tube_lamp_edge_left_right_open", () -> new TubeLampEdgeBlock(true, false));

    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_ENLIGHTED =
            register("purple_tube_lamp_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE_ENLIGHTED =
            register("purple_tube_lamp_edge_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_LEFT_OPEN_ENLIGHTED =
            register("purple_tube_lamp_left_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE_LEFT_OPEN_ENLIGHTED =
            register("purple_tube_lamp_edge_left_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_RIGHT_OPEN_ENLIGHTED =
            register("purple_tube_lamp_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE_RIGHT_OPEN_ENLIGHTED =
            register("purple_tube_lamp_edge_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("purple_tube_lamp_left_right_open_enlighted", () -> new TubeLampBlock(true, true));
    public static final RegistryObject<TubeLampBlock> PURPLE_TUBE_LAMP_EDGE_LEFT_RIGHT_OPEN_ENLIGHTED =
            register("purple_tube_lamp_edge_left_right_open_enlighted", () -> new TubeLampEdgeBlock(true, true));

    public static void register() {
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(BlocksMod.ItemTab)));
        return toReturn;
    }

    private static ToIntFunction<BlockState> poweredBlockEmission(boolean inverted) {
        if (inverted)
            return (p_50763_) -> !p_50763_.getValue(BlockStateProperties.POWERED) ? 15 : 0;
        return (p_50763_) -> p_50763_.getValue(BlockStateProperties.POWERED) ? 15 : 0;
    }

    private static ToIntFunction<BlockState> litBlockEmission(boolean inverted) {
        if (inverted)
            return (p_50763_) -> !p_50763_.getValue(BlockStateProperties.LIT) ? 15 : 0;
        return (p_50763_) -> p_50763_.getValue(BlockStateProperties.LIT) ? 15 : 0;
    }

}

