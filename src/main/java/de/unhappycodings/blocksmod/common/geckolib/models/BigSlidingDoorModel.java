package de.unhappycodings.blocksmod.common.geckolib.models;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.blockentity.BigSlidingDoorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BigSlidingDoorModel extends AnimatedGeoModel<BigSlidingDoorEntity>
{
    @Override
    public ResourceLocation getModelLocation(BigSlidingDoorEntity object)
    {
        return new ResourceLocation(BlocksMod.MOD_ID, "geo/models/big_sliding_door.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BigSlidingDoorEntity object)
    {
        return new ResourceLocation(BlocksMod.MOD_ID, "geo/textures/big_sliding_door.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BigSlidingDoorEntity object)
    {
        return new ResourceLocation(BlocksMod.MOD_ID, "animations/models/big_sliding_door.animation.json");
    }
}