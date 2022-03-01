package de.unhappycodings.blocksmod.common.blockentity;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, BlocksMod.MOD_ID);

    private ModBlockEntities() {
    }

    public static final RegistryObject<BlockEntityType<WirelessLampControllerEntity>> WIRELESS_LAMP_CONTROLLER =
            BLOCK_ENTITIES.register("wireless_lamp_controller", () ->
                    BlockEntityType.Builder.of(WirelessLampControllerEntity::new, ModBlocks.WIRELESS_LAMP_CONTROLLER.get()).build(null));

}
