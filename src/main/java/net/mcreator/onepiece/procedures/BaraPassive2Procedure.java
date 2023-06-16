package net.mcreator.onepiece.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.onepiece.network.OnePieceModVariables;

import javax.annotation.Nullable;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class BaraPassive2Procedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OnePieceModVariables.PlayerVariables())).ChopChopUser == true) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount));
				entity.getPersistentData().putDouble("randodge", Math.random());
				if (entity.getPersistentData().getDouble("randodge") > 0.6) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("dodge"), false);
					if (world.isClientSide()) {
						if (sourceentity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("one_piece", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("one_piece", "bara.dodge_1"))));
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("randodge") < 0.4) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("dodge"), false);
					if (world.isClientSide()) {
						if (sourceentity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("one_piece", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("one_piece", "bara.dodge_3"))));
							}
						}
					}
				} else {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("dodge"), false);
					if (world.isClientSide()) {
						if (sourceentity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("one_piece", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("one_piece", "bara.dodge_2"))));
							}
						}
					}
				}
			}
		}
	}
}
