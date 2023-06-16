package net.mcreator.onepiece.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.onepiece.network.OnePieceModVariables;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class BaraTickUpdateProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OnePieceModVariables.PlayerVariables())).ChopChopUser == true) {
			if (entity.getPersistentData().getDouble("primarycounter") > 0) {
				entity.getPersistentData().putDouble("primarycounter", (entity.getPersistentData().getDouble("primarycounter") - 2.5));
			}
			if (entity.getPersistentData().getBoolean("secondaryactive") == true) {
				if (entity.getPersistentData().getDouble("secondarycounter") < 100) {
					entity.getPersistentData().putDouble("secondarycounter", (entity.getPersistentData().getDouble("secondarycounter") + 1.5));
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("one_piece", "player_animation"));
							if (animation != null && !animation.isActive()) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("one_piece", "bara.spin"))));
							}
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if ((entityiterator.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OnePieceModVariables.PlayerVariables())).ChopChopUser == false) {
								entityiterator.hurt(DamageSource.GENERIC, 1);
							}
						}
					}
				} else {
					entity.getPersistentData().putBoolean("secondaryactive", false);
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("one_piece", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("one_piece", "still"))));
							}
						}
					}
				}
			} else {
				if (entity.getPersistentData().getDouble("secondarycounter") > 0) {
					entity.getPersistentData().putDouble("secondarycounter", (entity.getPersistentData().getDouble("secondarycounter") - 1.5));
				}
			}
			if (entity.getPersistentData().getBoolean("tertiaryactive") == true) {
				if (entity.getPersistentData().getDouble("tertiarycounter") < 100) {
					entity.getPersistentData().putDouble("tertiarycounter", (entity.getPersistentData().getDouble("tertiarycounter") + 0.75));
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("one_piece", "player_animation"));
							if (animation != null && !animation.isActive()) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("one_piece", "bara.float"))));
							}
						}
					}
					if (entity instanceof Player _player) {
						_player.getAbilities().mayfly = true;
						_player.onUpdateAbilities();
					}
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = true;
						_player.onUpdateAbilities();
					}
				} else {
					entity.getPersistentData().putBoolean("tertiaryactive", false);
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("one_piece", "player_animation"));
							if (animation != null) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("one_piece", "still"))));
							}
						}
					}
					if (entity instanceof Player _player) {
						_player.getAbilities().mayfly = false;
						_player.onUpdateAbilities();
					}
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = false;
						_player.onUpdateAbilities();
					}
				}
			} else {
				if (entity.getPersistentData().getDouble("tertiarycounter") > 0) {
					entity.getPersistentData().putDouble("tertiarycounter", (entity.getPersistentData().getDouble("tertiarycounter") - 1.5));
					if (entity instanceof Player _player) {
						_player.getAbilities().mayfly = false;
						_player.onUpdateAbilities();
					}
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = false;
						_player.onUpdateAbilities();
					}
				}
			}
		}
	}
}
