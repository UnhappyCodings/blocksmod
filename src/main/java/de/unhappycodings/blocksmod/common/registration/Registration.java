package de.unhappycodings.blocksmod.common.registration;

import de.unhappycodings.blocksmod.BlocksMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);

    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, BlocksMod.MOD_ID);

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BlocksMod.MOD_ID);

    public static void register() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
        SOUND_EVENTS.register(eventBus);
    }

}