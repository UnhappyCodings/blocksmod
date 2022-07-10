package de.unhappycodings.blocksmod.common.blockentity;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, BlocksMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<BigSlidingDoorEntity>> ANORTHOSITE_BIG_SLIDING_DOOR =
            BLOCK_ENTITIES.register("anorthosite_big_sliding_door", () -> BlockEntityType.Builder.of((pos, state) -> new BigSlidingDoorEntity(
                    pos, state, new ResourceLocation(BlocksMod.MOD_ID, "textures/geo/textures/anorthosite_big_sliding_door.png"),
                    ModBlockEntities.ANORTHOSITE_BIG_SLIDING_DOOR), ModBlocks.ANORTHOSITE_BIG_SLIDING_DOOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<BigSlidingDoorEntity>> LIMESTONE_BIG_SLIDING_DOOR =
            BLOCK_ENTITIES.register("limestone_big_sliding_door", () -> BlockEntityType.Builder.of((pos, state) -> new BigSlidingDoorEntity(
                    pos, state, new ResourceLocation(BlocksMod.MOD_ID, "textures/geo/textures/limestone_big_sliding_door.png"),
                    ModBlockEntities.LIMESTONE_BIG_SLIDING_DOOR), ModBlocks.LIMESTONE_BIG_SLIDING_DOOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<PlayerSensorEntity>> PLAYER_SENSOR =
            BLOCK_ENTITIES.register("player_sensor", () ->
                    BlockEntityType.Builder.of(PlayerSensorEntity::new, ModBlocks.PLAYER_SENSOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<BoundingBlockEntity>> BOUNDING_BLOCK =
            BLOCK_ENTITIES.register("bounding", () ->
                    BlockEntityType.Builder.of(BoundingBlockEntity::new, ModBlocks.BOUNDING.get()).build(null));

    public static final RegistryObject<BlockEntityType<WirelessLampControllerEntity>> WIRELESS_LAMP_CONTROLLER =
            BLOCK_ENTITIES.register("wireless_lamp_controller", () ->
                    BlockEntityType.Builder.of(WirelessLampControllerEntity::new, ModBlocks.WIRELESS_LAMP_CONTROLLER.get()).build(null));

    private ModBlockEntities() {
    }

}
