
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;

import net.mcreator.onepiece.item.StrawHatItem;
import net.mcreator.onepiece.item.OvertakenItem;
import net.mcreator.onepiece.item.IronKatanaItem;
import net.mcreator.onepiece.item.GumGumFruitItem;
import net.mcreator.onepiece.item.FlareFlareFruitItem;
import net.mcreator.onepiece.OnePieceMod;

public class OnePieceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OnePieceMod.MODID);
	public static final RegistryObject<Item> DEN_DEN_MUSHI_SPAWN_EGG = REGISTRY.register("den_den_mushi_spawn_egg", () -> new ForgeSpawnEggItem(OnePieceModEntities.DEN_DEN_MUSHI, -331793, -3356246, new Item.Properties()));
	public static final RegistryObject<StrawHatItem> STRAW_HAT_HELMET = REGISTRY.register("straw_hat_helmet", () -> new StrawHatItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<Item> OVERTAKEN = REGISTRY.register("overtaken", () -> new OvertakenItem());
	public static final RegistryObject<Item> GUM_GUM_FRUIT = REGISTRY.register("gum_gum_fruit", () -> new GumGumFruitItem());
	public static final RegistryObject<Item> FLARE_FLARE_FRUIT = REGISTRY.register("flare_flare_fruit", () -> new FlareFlareFruitItem());
	public static final RegistryObject<Item> SEA_KING_1_SPAWN_EGG = REGISTRY.register("sea_king_1_spawn_egg", () -> new ForgeSpawnEggItem(OnePieceModEntities.SEA_KING_1, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> IRON_KATANA = REGISTRY.register("iron_katana", () -> new IronKatanaItem());
	public static final RegistryObject<Item> SOUTH_BIRD_SPAWN_EGG = REGISTRY.register("south_bird_spawn_egg", () -> new ForgeSpawnEggItem(OnePieceModEntities.SOUTH_BIRD, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> NEWS_COO_SPAWN_EGG = REGISTRY.register("news_coo_spawn_egg", () -> new ForgeSpawnEggItem(OnePieceModEntities.NEWS_COO, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
