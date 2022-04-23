package de.unhappycodings.blocksmod.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.blockentity.BigSlidingDoorEntity;
import de.unhappycodings.blocksmod.common.geckolib.BigSlidingDoorModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class BigSlidingDoorRenderer extends GeoBlockRenderer<BigSlidingDoorEntity> {

    public BigSlidingDoorRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
        super(rendererDispatcherIn, new BigSlidingDoorModel());
    }

    @Override
    public boolean shouldRenderOffScreen(BlockEntity p_112306_) {
        return true;
    }

    @Override
    public boolean shouldRender(BlockEntity p_173568_, Vec3 p_173569_) {
        return true;
    }

    @Override
    public RenderType getRenderType(BigSlidingDoorEntity animatable, float partialTicks, PoseStack stack, @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(new ResourceLocation(BlocksMod.MOD_ID,"geo/textures/big_sliding_door.png"));
    }
}
