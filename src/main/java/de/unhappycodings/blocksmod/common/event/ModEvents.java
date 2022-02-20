package de.unhappycodings.blocksmod.common.event;

import de.unhappycodings.blocksmod.BlocksMod;
import de.unhappycodings.blocksmod.common.block.ModBlocks;
import de.unhappycodings.blocksmod.common.config.CommonConfig;
import de.unhappycodings.blocksmod.common.item.LinkingCardItem;
import de.unhappycodings.blocksmod.common.util.NbtUtil;
import de.unhappycodings.blocksmod.common.util.TextComponentUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.UUID;

public class ModEvents {

    private static boolean lastSneaking;
    int runs = 0;

    @SubscribeEvent
    public void onPlayerTick(LivingEvent event) {
        if (event.getEntityLiving() == null) return;
        LivingEntity player = event.getEntityLiving();
        if (player.getUsedItemHand() == InteractionHand.MAIN_HAND) {
            if (!(player instanceof Player)) return;
            ItemStack item = player.getItemInHand(InteractionHand.MAIN_HAND);
            if (item.getItem() instanceof LinkingCardItem) {
                CompoundTag nbt = item.getOrCreateTag();
                if (!nbt.contains("positions")) return;
                if (runs >= 5) {
                    runs = 0;
                    for (Tag tag : nbt.getList("positions", Tag.TAG_COMPOUND)) {
                        CompoundTag positionTag = (CompoundTag) tag;
                        BlockPos pos = NbtUtil.getPos(positionTag);

                        switch (CommonConfig.LINKING_TOOL_PARTICLE_COLOR.get()) {
                            case 0 -> player.getLevel().addParticle(DustParticleOptions.REDSTONE, true, pos.getX() + 0.5D,
                                    pos.getY() + 0.5D, pos.getZ() + 0.5D, 0, 0, 0);
                            case 1 -> player.getLevel().addParticle(ParticleTypes.REVERSE_PORTAL, true, pos.getX() + 0.5D,
                                    pos.getY() + 0.5D, pos.getZ() + 0.5D, 0, 0, 0);
                            case 2 -> player.getLevel().addParticle(ParticleTypes.ELECTRIC_SPARK, true, pos.getX() + 0.5D,
                                    pos.getY() + 0.5D, pos.getZ() + 0.5D, 0, 0, 0);
                        }
                    }
                }
            }
            runs++;
        }
    }

}

