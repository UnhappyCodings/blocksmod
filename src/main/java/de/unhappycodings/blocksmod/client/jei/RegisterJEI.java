package de.unhappycodings.blocksmod.client.jei;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.client.jer.RegisterJER;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@JeiPlugin
public class RegisterJEI implements IModPlugin {

    @NotNull
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(BlocksMod.MOD_ID, "jei");
    }

    @Override
    public void registerCategories(@NotNull IRecipeCategoryRegistration registration) {
        new RegisterJER().init(true);
    }
}
