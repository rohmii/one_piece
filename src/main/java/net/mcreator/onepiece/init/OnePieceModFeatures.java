
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.onepiece.world.features.RedLineFeature;
import net.mcreator.onepiece.world.features.RedLine2Feature;
import net.mcreator.onepiece.OnePieceMod;

@Mod.EventBusSubscriber
public class OnePieceModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, OnePieceMod.MODID);
	public static final RegistryObject<Feature<?>> RED_LINE = REGISTRY.register("red_line", RedLineFeature::new);
	public static final RegistryObject<Feature<?>> RED_LINE_2 = REGISTRY.register("red_line_2", RedLine2Feature::new);
}
