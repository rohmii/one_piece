
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.onepiece.item.OvertakenItem;
import net.mcreator.onepiece.item.ChopChopFruitItem;
import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OnePieceMod.MODID);
	public static final RegistryObject<Item> CHOP_CHOP_FRUIT = REGISTRY.register("chop_chop_fruit", () -> new ChopChopFruitItem());
	public static final RegistryObject<Item> OVERTAKEN = REGISTRY.register("overtaken", () -> new OvertakenItem());
}
