
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
	public static final RegistryObject<SoundEvent> OVERTAKEN = REGISTRY.register("overtaken", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("one_piece", "overtaken")));
	public static final RegistryObject<SoundEvent> STRAWHATEQUIP = REGISTRY.register("strawhatequip", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("one_piece", "strawhatequip")));
	public static final RegistryObject<SoundEvent> DEN_DEN_MUSHI_RINGTONE = REGISTRY.register("den_den_mushi_ringtone", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("one_piece", "den_den_mushi_ringtone")));
	public static final RegistryObject<SoundEvent> PARRY = REGISTRY.register("parry", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("one_piece", "parry")));
}
