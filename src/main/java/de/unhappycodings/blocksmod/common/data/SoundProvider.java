package de.unhappycodings.blocksmod.common.data;

import de.unhappycodings.blocksmod.common.registration.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class SoundProvider extends SoundDefinitionsProvider {

    protected SoundProvider(DataGenerator generator, String modId, ExistingFileHelper helper) {
        super(generator, modId, helper);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.BIG_SLIDING_DOOR_CLOSE.getId(), SoundDefinition.definition()
                .with(sound(ModSounds.BIG_SLIDING_DOOR_CLOSE.getId()).attenuationDistance(6)));
        add(ModSounds.BIG_SLIDING_DOOR_OPEN.getId(), SoundDefinition.definition()
                .with(sound(ModSounds.BIG_SLIDING_DOOR_OPEN.getId()).attenuationDistance(6)));
    }

}