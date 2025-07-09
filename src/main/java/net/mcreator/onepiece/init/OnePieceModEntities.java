
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.onepiece.entity.SouthBirdEntity;
import net.mcreator.onepiece.entity.SeaKing1Entity;
import net.mcreator.onepiece.entity.NewsCooEntity;
import net.mcreator.onepiece.entity.DenDenMushiEntity;
import net.mcreator.onepiece.OnePieceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OnePieceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, OnePieceMod.MODID);
	public static final RegistryObject<EntityType<DenDenMushiEntity>> DEN_DEN_MUSHI = register("den_den_mushi",
			EntityType.Builder.<DenDenMushiEntity>of(DenDenMushiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DenDenMushiEntity::new)

					.sized(0.4f, 0.5f));
	public static final RegistryObject<EntityType<SeaKing1Entity>> SEA_KING_1 = register("sea_king_1",
			EntityType.Builder.<SeaKing1Entity>of(SeaKing1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeaKing1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SouthBirdEntity>> SOUTH_BIRD = register("south_bird",
			EntityType.Builder.<SouthBirdEntity>of(SouthBirdEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SouthBirdEntity::new)

					.sized(1f, 1.2f));
	public static final RegistryObject<EntityType<NewsCooEntity>> NEWS_COO = register("news_coo",
			EntityType.Builder.<NewsCooEntity>of(NewsCooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NewsCooEntity::new)

					.sized(1f, 1.2f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DenDenMushiEntity.init();
			SeaKing1Entity.init();
			SouthBirdEntity.init();
			NewsCooEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DEN_DEN_MUSHI.get(), DenDenMushiEntity.createAttributes().build());
		event.put(SEA_KING_1.get(), SeaKing1Entity.createAttributes().build());
		event.put(SOUTH_BIRD.get(), SouthBirdEntity.createAttributes().build());
		event.put(NEWS_COO.get(), NewsCooEntity.createAttributes().build());
	}
}
