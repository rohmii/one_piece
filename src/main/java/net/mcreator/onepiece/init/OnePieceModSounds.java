
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OnePieceMod.MODID);
	public static final RegistryObject<SoundEvent> OVERTAKEN = REGISTRY.register("overtaken", () -> new SoundEvent(new ResourceLocation("one_piece", "overtaken")));
}
