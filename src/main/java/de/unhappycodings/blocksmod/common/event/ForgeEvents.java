package de.unhappycodings.blocksmod.common.event;

import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Matrix4f;
import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import de.unhappycodings.blocksmod.common.item.LinkingCardItem;
import de.unhappycodings.blocksmod.common.util.NbtUtil;
import de.unhappycodings.blocksmod.common.world.Generation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.OutlineBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.client.event.RenderLevelLastEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event) {
        final List<Supplier<PlacedFeature>> features = event.getGeneration()
                .getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        switch (event.getCategory()) {
            case NETHER, THEEND -> {
            }
            default -> Generation.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
        }
    }

    /*
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onLevelLastEvent(RenderLevelLastEvent event) {
        Player player = Minecraft.getInstance().player;
        ItemStack item = player.getItemInHand(InteractionHand.MAIN_HAND);
        if (item.isEmpty()) return;
        if (item.getItem() instanceof LinkingCardItem) {
            CompoundTag nbt = item.getOrCreateTag();
            if (!nbt.contains("positions")) return;
            for (Tag tag : nbt.getList("positions", Tag.TAG_COMPOUND)) {
                CompoundTag positionTag = (CompoundTag) tag;
                BlockPos pos = NbtUtil.getPos(positionTag);

                PoseStack matrixEntry = event.getPoseStack();
                matrixEntry.translate(pos.getX(), pos.getY(), pos.getZ());
                Matrix4f posMatrix = matrixEntry.last().pose();
                Tesselator tesselator = Tesselator.getInstance();
                BufferBuilder buffer = tesselator.getBuilder();

                buffer.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);

                //LevelRenderer.renderLineBox(matrixEntry, buffer, pX, pY, pZ, pX +1, pY+1, pZ+1, 1.0f, 1.0f, 1.0f, 1.0f);
                buffer.vertex(posMatrix,  -1, 1, -1).color(0f, 0.705f, 0.592f, 0.313f).endVertex();
                buffer.vertex(posMatrix, 1, 1, -1).color(0f, 0.705f, 0.592f, 0.313f).endVertex();
                buffer.vertex(posMatrix, 1, 1, 1).color(0f, 0.705f, 0.592f, 0.313f).endVertex();
                buffer.vertex(posMatrix, -1, 1, 1).color(0f, 0.705f, 0.592f, 0.313f).endVertex();

                matrixEntry.pushPose();
                tesselator.end();

            }
        }
    }
    */

}