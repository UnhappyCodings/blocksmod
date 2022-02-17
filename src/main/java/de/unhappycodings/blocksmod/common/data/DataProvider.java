package de.unhappycodings.blocksmod.common.data;

import de.unhappycodings.blocksmod.BlocksMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataProvider {

    @SubscribeEvent
    public static void onDataGen(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ModelAndBlockStatesProvider(generator, existingFileHelper));
        generator.addProvider(new ItemModelProvider(generator, existingFileHelper));
        generator.addProvider(new TagsProvider(generator, existingFileHelper));
        generator.addProvider(new RecipeProvider(generator));
        generator.addProvider(new LootTableProvider(generator));

    }
}
