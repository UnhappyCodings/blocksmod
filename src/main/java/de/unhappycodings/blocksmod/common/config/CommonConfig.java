package de.unhappycodings.blocksmod.common.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class CommonConfig {

    public static ForgeConfigSpec COMMON_CONFIG;

    /* General */

    // FUTURE
    public static ForgeConfigSpec.ConfigValue<String> LINKING_TOOL_OVERLAY_COLOR;
    public static ForgeConfigSpec.IntValue LINKING_TOOL_MAX_BOUNDS;
    // public static ForgeConfigSpec.BooleanValue ENABLE_LAMP_BLOCKS;

    /* World */
    public static ForgeConfigSpec.BooleanValue GENERATE_ARAGONIT_SOURCES;
    public static ForgeConfigSpec.IntValue ARAGONIT_PER_CHUNK;
    public static ForgeConfigSpec.IntValue ARAGONIT_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_GARAT_SOURCES;
    public static ForgeConfigSpec.IntValue GARAT_PER_CHUNK;
    public static ForgeConfigSpec.IntValue GARAT_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_SLATE_SOURCES;
    public static ForgeConfigSpec.IntValue SLATE_PER_CHUNK;
    public static ForgeConfigSpec.IntValue SLATE_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_MONZONITE_SOURCES;
    public static ForgeConfigSpec.IntValue MONZONITE_PER_CHUNK;
    public static ForgeConfigSpec.IntValue MONZONITE_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_NEPHELINE_SYENITE_SOURCES;
    public static ForgeConfigSpec.IntValue NEPHELINE_SYENITE_PER_CHUNK;
    public static ForgeConfigSpec.IntValue NEPHELINE_SYENITE_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_WHITE_GABBRO_SOURCES;
    public static ForgeConfigSpec.IntValue WHITE_GABBRO_PER_CHUNK;
    public static ForgeConfigSpec.IntValue WHITE_GABBRO_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_GABBRO_SOURCES;
    public static ForgeConfigSpec.IntValue GABBRO_PER_CHUNK;
    public static ForgeConfigSpec.IntValue GABBRO_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_BIMSTONE_SOURCES;
    public static ForgeConfigSpec.IntValue BIMSTONE_PER_CHUNK;
    public static ForgeConfigSpec.IntValue BIMSTONE_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_GNEISS_SOURCES;
    public static ForgeConfigSpec.IntValue GNEISS_PER_CHUNK;
    public static ForgeConfigSpec.IntValue GNEISS_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_ANORTHOSITE_SOURCES;
    public static ForgeConfigSpec.IntValue ANORTHOSITE_PER_CHUNK;
    public static ForgeConfigSpec.IntValue ANORTHOSITE_SOURCES_PER_CHUNK;

    public static ForgeConfigSpec.BooleanValue GENERATE_LIMESTONE_SOURCES;
    public static ForgeConfigSpec.IntValue LIMESTONE_PER_CHUNK;
    public static ForgeConfigSpec.IntValue LIMESTONE_SOURCES_PER_CHUNK;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        init(COMMON_BUILDER);
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    private static void init(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.push("General");
        LINKING_TOOL_OVERLAY_COLOR = COMMON_BUILDER.comment("What Color should the Overlay be [Format: #RRGGBB]")
                .define("linking_tool_overlay_color", "#00b497");
        LINKING_TOOL_MAX_BOUNDS = COMMON_BUILDER.comment("How many Flat Lamps should be bound to one Linking Card?")
                .defineInRange("linking_tool_max_bounds", 32, 1, 256);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("World");
        COMMON_BUILDER.push("aragonit");
        GENERATE_ARAGONIT_SOURCES = COMMON_BUILDER.comment("Should aragonit blocks be generated")
                .define("generate_aragonit_sources", true);
        ARAGONIT_PER_CHUNK = COMMON_BUILDER.comment("Amount of aragonit blocks generated per vein (source)")
                .defineInRange("aragonit_blocks_per_vein", 32, 2, 64);
        ARAGONIT_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max aragonit sources generated per chunk")
                .defineInRange("aragonit_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("limestone");
        GENERATE_LIMESTONE_SOURCES = COMMON_BUILDER.comment("Should limestone blocks be generated")
                .define("generate_limestone_sources", true);
        LIMESTONE_PER_CHUNK = COMMON_BUILDER.comment("Amount of limestone blocks generated per vein (source)")
                .defineInRange("limestone_blocks_per_vein", 40, 1, 64);
        LIMESTONE_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max limestone sources generated per chunk")
                .defineInRange("limestone_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("garat");
        GENERATE_GARAT_SOURCES = COMMON_BUILDER.comment("Should garat blocks be generated")
                .define("generate_garat_sources", true);
        GARAT_PER_CHUNK = COMMON_BUILDER.comment("Amount of garat blocks generated per vein (source)")
                .defineInRange("garat_blocks_per_vein", 32, 1, 64);
        GARAT_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max garat sources generated per chunk")
                .defineInRange("garat_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("slate");
        GENERATE_SLATE_SOURCES = COMMON_BUILDER.comment("Should slate blocks be generated")
                .define("generate_slate_sources", true);
        SLATE_PER_CHUNK = COMMON_BUILDER.comment("Amount of slate blocks generated per vein (source)")
                .defineInRange("slate_blocks_per_vein", 32, 1, 64);
        SLATE_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max slate sources generated per chunk")
                .defineInRange("slate_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("monzonite");
        GENERATE_MONZONITE_SOURCES = COMMON_BUILDER.comment("Should monzonite blocks be generated")
                .define("generate_monzonite_sources", true);
        MONZONITE_PER_CHUNK = COMMON_BUILDER.comment("Amount of monzonite blocks generated per vein (source)")
                .defineInRange("monzonite_blocks_per_vein", 32, 1, 64);
        MONZONITE_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max monzonite sources generated per chunk")
                .defineInRange("monzonite_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("nepheline_syenite");
        GENERATE_NEPHELINE_SYENITE_SOURCES = COMMON_BUILDER.comment("Should nepheline syenite blocks be generated")
                .define("generate_nepheline_syenite_sources", true);
        NEPHELINE_SYENITE_PER_CHUNK = COMMON_BUILDER.comment("Amount of nepheline syenite blocks generated per vein (source)")
                .defineInRange("nepheline_syenite_blocks_per_vein", 32, 1, 64);
        NEPHELINE_SYENITE_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max nepheline syenite sources generated per chunk")
                .defineInRange("nepheline_syenite_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("gabbro");
        GENERATE_GABBRO_SOURCES = COMMON_BUILDER.comment("Should gabbro blocks be generated")
                .define("generate_gabbro_sources", true);
        GABBRO_PER_CHUNK = COMMON_BUILDER.comment("Amount of gabbro blocks generated per vein (source)")
                .defineInRange("gabbro_blocks_per_vein", 32, 1, 64);
        GABBRO_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max gabbro sources generated per chunk")
                .defineInRange("gabbro_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("white gabbro");
        GENERATE_WHITE_GABBRO_SOURCES = COMMON_BUILDER.comment("Should white gabbro blocks be generated")
                .define("generate_white_gabbro_sources", true);
        WHITE_GABBRO_PER_CHUNK = COMMON_BUILDER.comment("Amount of white gabbro blocks generated per vein (source)")
                .defineInRange("white_gabbro_blocks_per_vein", 32, 1, 64);
        WHITE_GABBRO_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max white gabbro sources generated per chunk")
                .defineInRange("white_gabbro_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("bimstone");
        GENERATE_BIMSTONE_SOURCES = COMMON_BUILDER.comment("Should bimstone blocks be generated")
                .define("generate_bimstone_sources", true);
        BIMSTONE_PER_CHUNK = COMMON_BUILDER.comment("Amount of bimstone blocks generated per vein (source)")
                .defineInRange("bimstone_blocks_per_vein", 32, 1, 64);
        BIMSTONE_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max bimstone sources generated per chunk")
                .defineInRange("bimstone_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("gneiss");
        GENERATE_GNEISS_SOURCES = COMMON_BUILDER.comment("Should gneiss blocks be generated")
                .define("generate_gneiss_sources", true);
        GNEISS_PER_CHUNK = COMMON_BUILDER.comment("Amount of gneiss blocks generated per vein (source)")
                .defineInRange("gneiss_blocks_per_vein", 32, 1, 64);
        GNEISS_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max gneiss sources generated per chunk")
                .defineInRange("gneiss_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.push("anorthosite");
        GENERATE_ANORTHOSITE_SOURCES = COMMON_BUILDER.comment("Should anorthosite blocks be generated")
                .define("generate_anorthosite_sources", true);
        ANORTHOSITE_PER_CHUNK = COMMON_BUILDER.comment("Amount of anorthosite blocks generated per vein (source)")
                .defineInRange("anorthosite_blocks_per_vein", 32, 1, 64);
        ANORTHOSITE_SOURCES_PER_CHUNK = COMMON_BUILDER.comment("Amount of max anorthosite sources generated per chunk")
                .defineInRange("anorthosite_sources_per_chunk", 2, 1, 64);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
    }

    public static void loadConfigFile(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                .sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }

}
