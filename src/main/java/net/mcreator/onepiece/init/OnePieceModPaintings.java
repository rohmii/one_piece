
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, OnePieceMod.MODID);
	public static final RegistryObject<PaintingVariant> WANTED_1 = REGISTRY.register("wanted_1", () -> new PaintingVariant(16, 32));
}
