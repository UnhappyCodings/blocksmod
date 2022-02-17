package de.unhappycodings.blocksmod.client;

import com.mojang.blaze3d.platform.InputConstants;
import de.unhappycodings.blocksmod.BlocksMod;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {

    public static KeyMapping DESCRIPTION_KEYBINDING = new KeyMapping("CTRL", KeyConflictContext.UNIVERSAL, KeyModifier.NONE, InputConstants.Type.KEYSYM.getOrCreate(GLFW.GLFW_KEY_LEFT_CONTROL),
            "keybind." + BlocksMod.MOD_ID + ".category");

    public static void register() {
        ClientRegistry.registerKeyBinding(DESCRIPTION_KEYBINDING);
    }

}
