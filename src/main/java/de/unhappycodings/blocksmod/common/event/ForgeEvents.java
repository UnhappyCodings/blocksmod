package de.unhappycodings.blocksmod.common.event;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.math.Matrix4f;
import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.BigSlidingDoorBlock;
import de.unhappycodings.blocksmod.common.block.BoundingBlock;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.blockentity.BoundingBlockEntity;
import de.unhappycodings.blocksmod.common.blockentity.WirelessLampControllerEntity;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import de.unhappycodings.blocksmod.common.item.LinkingCardItem;
import de.unhappycodings.blocksmod.common.item.ModItems;
import de.unhappycodings.blocksmod.common.util.NbtUtil;
import de.unhappycodings.blocksmod.common.world.Generation;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderLevelLastEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import observable.shadow.imgui.Dir;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event) {
        final List<Holder<PlacedFeature>> features = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        switch (event.getCategory()) {
            case NETHER, THEEND -> {}
            default -> Generation.OVERWORLD_ORES.forEach(x -> features.add(new Holder.Direct<>(x)));
        }
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void renderSquareAboveWorldCentre(RenderLevelLastEvent event) {
        Player player = Minecraft.getInstance().player;
        ItemStack item = player.getItemInHand(InteractionHand.MAIN_HAND);
        if (item.isEmpty()) return;
        if (item.getItem() instanceof LinkingCardItem) {
            CompoundTag nbt = item.getOrCreateTag();
            if (!nbt.contains("positions")) return;
            for (Tag tag : nbt.getList("positions", Tag.TAG_COMPOUND)) {
                CompoundTag positionTag = (CompoundTag) tag;
                BlockPos posToRenderSquareAt = NbtUtil.getPos(positionTag);
                Minecraft minecraft = Minecraft.getInstance();
                Vec3 cameraPos = minecraft.gameRenderer.getMainCamera().getPosition();

                RenderSystem.disableDepthTest();
                RenderSystem.enableBlend();
                RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);

                Matrix4f matrix = event.getPoseStack().last().pose();
                RenderSystem.setTextureMatrix(matrix);
                Tesselator tes = Tesselator.getInstance();
                BufferBuilder buffer = tes.getBuilder();
                buffer.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);

                // Translate the positions back to the point of the block.
                float x = (float) (-cameraPos.x + posToRenderSquareAt.getX());
                float y = (float) (-cameraPos.y + posToRenderSquareAt.getY());
                float z = (float) (-cameraPos.z + posToRenderSquareAt.getZ());

                Color color = Color.decode(CommonConfig.LINKING_TOOL_OVERLAY_COLOR.get());
                float r = color.getRed() / 255f;
                float g = color.getGreen() / 255f;
                float b = color.getBlue() / 255f;
                float a = 0.5f;
                float offset = 0;

                // Down
                buffer.vertex(matrix, x + 0, y + 0 - offset, z + 0).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 0 - offset, z + 0).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 0 - offset, z + 1).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 0, y + 0 - offset, z + 1).color(r, g, b, a).endVertex();

                // Up
                buffer.vertex(matrix, x + 0, y + 1 + offset, z + 0).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 0, y + 1 + offset, z + 1).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 1 + offset, z + 1).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 1 + offset, z + 0).color(r, g, b, a).endVertex();

                // North
                buffer.vertex(matrix, x + 0, y + 1, z + 0 - offset).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 1, z + 0 - offset).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 0, z + 0 - offset).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 0, y + 0, z + 0 - offset).color(r, g, b, a).endVertex();

                // South
                buffer.vertex(matrix, x + 0, y + 1, z + 1 + offset).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 0, y + 0, z + 1 + offset).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 0, z + 1 + offset).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1, y + 1, z + 1 + offset).color(r, g, b, a).endVertex();

                // East
                buffer.vertex(matrix, x + 0 - offset, y + 1, z + 0).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 0 - offset, y + 0, z + 0).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 0 - offset, y + 0, z + 1).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 0 - offset, y + 1, z + 1).color(r, g, b, a).endVertex();

                // West
                buffer.vertex(matrix, x + 1 + offset, y + 1, z + 0).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1 + offset, y + 1, z + 1).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1 + offset, y + 0, z + 1).color(r, g, b, a).endVertex();
                buffer.vertex(matrix, x + 1 + offset, y + 0, z + 0).color(r, g, b, a).endVertex();

                tes.end();
                RenderSystem.enableDepthTest();
                RenderSystem.depthFunc(0x207);
            }
        }
    }

    @SubscribeEvent
    public static void onSlidingDoorPlaced(BlockEvent.EntityPlaceEvent event) {
        if (event.getPlacedBlock().getBlock() instanceof BigSlidingDoorBlock) {
            BlockPos blockPos = event.getPos();
            LevelAccessor level = event.getWorld();
            BlockState blockState = level.getBlockState(blockPos);
            Direction facing = blockState.getValue(BigSlidingDoorBlock.FACING);
            BlockPos above; BlockPos left; BlockPos leftAbove; BlockPos right; BlockPos rightAbove;

            if (facing == Direction.NORTH || facing == Direction.SOUTH) {
                left = blockPos.offset(-1, 0, 0);
                leftAbove = blockPos.offset(-1, 1, 0);
                above = blockPos.offset(0, 1, 0);
                rightAbove = blockPos.offset(1, 1, 0);
                right = blockPos.offset(1, 0, 0);

                if (facing == Direction.NORTH) {
                    setNbt(level, left, blockPos, facing, (byte) 5);
                    setNbt(level, leftAbove, blockPos, facing, (byte) 4);
                    setNbt(level, above, blockPos, facing, (byte) 3);
                    setNbt(level, rightAbove, blockPos, facing, (byte) 2);
                    setNbt(level, right, blockPos, facing, (byte) 1);
                } else {
                    setNbt(level, left, blockPos, facing, (byte) 1);
                    setNbt(level, leftAbove, blockPos, facing, (byte) 2);
                    setNbt(level, above, blockPos, facing, (byte) 3);
                    setNbt(level, rightAbove, blockPos, facing, (byte) 4);
                    setNbt(level, right, blockPos, facing, (byte) 5);
                }
            }
            if (facing == Direction.EAST || facing == Direction.WEST) {
                left = blockPos.offset(0, 0, -1);
                leftAbove = blockPos.offset(0, 1, -1);
                above = blockPos.offset(0, 1, 0);
                rightAbove = blockPos.offset(0, 1, 1);
                right = blockPos.offset(0, 0, 1);
                
                if (facing == Direction.EAST) {
                    setNbt(level, left, blockPos, facing, (byte) 5);
                    setNbt(level, leftAbove, blockPos, facing, (byte) 4);
                    setNbt(level, above, blockPos, facing, (byte) 3);
                    setNbt(level, rightAbove, blockPos, facing, (byte) 2);
                    setNbt(level, right, blockPos, facing, (byte) 1);
                } else {
                    setNbt(level, left, blockPos, facing, (byte) 1);
                    setNbt(level, leftAbove, blockPos, facing, (byte) 2);
                    setNbt(level, above, blockPos, facing, (byte) 3);
                    setNbt(level, rightAbove, blockPos, facing, (byte) 4);
                    setNbt(level, right, blockPos, facing, (byte) 5);
                }
            }
        }
    }

    public static void setNbt(LevelAccessor level, BlockPos blockPos, BlockPos originBlockPos, Direction facing, Byte pos) {
        level.setBlock(blockPos, ModBlocks.BOUNDING.get().defaultBlockState().setValue(BoundingBlock.FACING, facing), 3);
        BlockEntity blockEntity = level.getBlockEntity(blockPos);
        if (!(blockEntity instanceof BoundingBlockEntity curBlockEntity)) return;
        CompoundTag tag = new CompoundTag();
        curBlockEntity.saveAdditional(tag);
        tag.putByte("state", (byte) 1);
        tag.putByte("pos", pos);
        tag.putInt("origin-x", originBlockPos.getX());
        tag.putInt("origin-y", originBlockPos.getY());
        tag.putInt("origin-z", originBlockPos.getZ());
        curBlockEntity.load(tag);
        curBlockEntity.setChanged();
    }

    @SubscribeEvent
    public static void onSlidingDoorPlace(final PlayerInteractEvent.RightClickBlock event) {
        if (event.getEntityLiving().getItemInHand(InteractionHand.MAIN_HAND).getItem() == ModBlocks.BIG_SLIDING_DOOR.get().asItem()) {
            LevelAccessor level = event.getWorld();
            BlockPos pos;
            BlockState above; BlockState left; BlockState leftAbove; BlockState right; BlockState rightAbove;
            pos = switch (event.getFace()) {
                case UP -> event.getPos().above();
                case DOWN -> event.getPos().below();
                case NORTH -> event.getPos().north();
                case EAST -> event.getPos().east();
                case SOUTH -> event.getPos().south();
                default -> event.getPos().west();
            };
            if (event.getEntityLiving().getDirection().getOpposite() == Direction.NORTH || event.getEntityLiving().getDirection().getOpposite() == Direction.SOUTH) {
                above = level.getBlockState(pos.offset(0, 1, 0));
                left = level.getBlockState(pos.offset(-1, 0, 0));
                leftAbove = level.getBlockState(pos.offset(-1, 1, 0));
                right = level.getBlockState(pos.offset(1, 0, 0));
                rightAbove = level.getBlockState(pos.offset(1, 1, 0));
            } else {
                above = level.getBlockState(pos.offset(0, 1, 0));
                left = level.getBlockState(pos.offset(0, 0, -1));
                leftAbove = level.getBlockState(pos.offset(0, 1, -1));
                right = level.getBlockState(pos.offset(0, 0, 1));
                rightAbove = level.getBlockState(pos.offset(0, 1, 1));
            }

            if (!isPlacable(above, left, right, leftAbove, rightAbove)) {
                event.setCanceled(true);
                return;
            }
            System.out.println("final 1");
        }
    }

    public static boolean isPlacable(BlockState above, BlockState right, BlockState left, BlockState rightAbove, BlockState leftAbove) {
        return above.getBlock() == Blocks.AIR && left.getBlock() == Blocks.AIR && right.getBlock() == Blocks.AIR
                && leftAbove.getBlock() == Blocks.AIR && rightAbove.getBlock() == Blocks.AIR;
    }

}