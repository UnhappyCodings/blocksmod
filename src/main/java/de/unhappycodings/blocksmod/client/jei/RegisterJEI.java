package de.unhappycodings.blocksmod.client.jei;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.client.jer.RegisterJER;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

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

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM, Collections.singletonList(new ItemStack(ModBlocks.BOUNDING.get())));
        IModPlugin.super.registerRecipes(registration);
    }
}
