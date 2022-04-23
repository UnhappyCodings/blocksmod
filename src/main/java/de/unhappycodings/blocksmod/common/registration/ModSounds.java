package de.unhappycodings.blocksmod.common.registration;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.data.SoundProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final RegistryObject<SoundEvent> BIG_SLIDING_DOOR_CLOSE =
            Registration.SOUND_EVENTS.register("tile.door.big_sliding_door.close",
                    () -> new SoundEvent(new ResourceLocation(BlocksMod.MOD_ID, "tile.door.big_sliding_door.close")));

    public static final RegistryObject<SoundEvent> BIG_SLIDING_DOOR_OPEN =
            Registration.SOUND_EVENTS.register("tile.door.big_sliding_door.open",
                    () -> new SoundEvent(new ResourceLocation(BlocksMod.MOD_ID, "tile.door.big_sliding_door.open")));

    public static void register() {
    }

}
