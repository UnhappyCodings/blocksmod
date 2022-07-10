package de.unhappycodings.blocksmod.common.geckolib;

import de.unhappycodings.blocksmod.BlocksMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BigSlidingDoorModel<T extends IAnimatable> extends AnimatedGeoModel<T> {

    @Override
    public ResourceLocation getModelLocation(T object) {
        return new ResourceLocation(BlocksMod.MOD_ID, "geo/models/big_sliding_door.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(T object) {
        return new ResourceLocation(BlocksMod.MOD_ID, "geo/textures/big_sliding_door");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(T object) {
        return new ResourceLocation(BlocksMod.MOD_ID, "animations/models/big_sliding_door.animation.json");
    }
}