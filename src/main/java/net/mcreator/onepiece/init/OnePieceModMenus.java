
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.onepiece.world.inventory.SnailMenuMenu;
import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OnePieceMod.MODID);
	public static final RegistryObject<MenuType<SnailMenuMenu>> SNAIL_MENU = REGISTRY.register("snail_menu", () -> IForgeMenuType.create(SnailMenuMenu::new));
}
