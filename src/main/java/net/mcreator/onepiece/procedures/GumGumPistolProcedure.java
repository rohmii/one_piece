package net.mcreator.onepiece.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.onepiece.OnePieceMod;

import java.util.List;
import java.util.Comparator;

public class GumGumPistolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("pistol", true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, (float) 1.5);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, (float) 1.5, false);
			}
		}
		entity.getPersistentData().putDouble("pistol_damage", 0);
		for (int index0 = 0; index0 < 9; index0++) {
			OnePieceMod.queueServerWork(1, () -> {
				entity.getPersistentData().putDouble("pistol_damage", (entity.getPersistentData().getDouble("pistol_damage") + 1));
				{
					final Vec3 _center = new Vec3(
							(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("pistol_damage")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity))
									.getBlockPos().getX()),
							(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("pistol_damage")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity))
									.getBlockPos().getY()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("pistol_damage")))), ClipContext.Block.OUTLINE,
									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, (float) 1.25);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, (float) 1.25, false);
								}
							}
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 3);
							entityiterator.setDeltaMovement(new Vec3(Math.cbrt(entityiterator.getX() - entity.getX()), 0.5, Math.cbrt(entityiterator.getZ() - entity.getZ())));
						}
					}
				}
				if (entity.getPersistentData().getDouble("pistol_timer") >= 17) {
					entity.getPersistentData().putDouble("pistol_timer", 0);
					entity.getPersistentData().putBoolean("pistol", false);
				}
			});
		}
	}
}
