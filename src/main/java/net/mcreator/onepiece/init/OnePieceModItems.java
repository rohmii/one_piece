
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.onepiece.item.StrawHatItem;
import net.mcreator.onepiece.item.OvertakenItem;
import net.mcreator.onepiece.item.ChopChopFruitItem;
import net.mcreator.onepiece.item.BawsItem;
import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OnePieceMod.MODID);
	public static final RegistryObject<Item> CHOP_CHOP_FRUIT = REGISTRY.register("chop_chop_fruit", () -> new ChopChopFruitItem());
	public static final RegistryObject<Item> OVERTAKEN = REGISTRY.register("overtaken", () -> new OvertakenItem());
	public static final RegistryObject<Item> DEN_DEN_MUSHI_SPAWN_EGG = REGISTRY.register("den_den_mushi_spawn_egg",
			() -> new ForgeSpawnEggItem(OnePieceModEntities.DEN_DEN_MUSHI, -331793, -3356246, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<StrawHatItem> STRAW_HAT_HELMET = REGISTRY.register("straw_hat_helmet", () -> new StrawHatItem(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

	public static final RegistryObject<Item> BAWS = REGISTRY.register("baws", () -> new BawsItem());
}
