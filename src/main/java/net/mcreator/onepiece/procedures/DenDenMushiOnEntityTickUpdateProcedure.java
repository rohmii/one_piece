package net.mcreator.onepiece.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class DenDenMushiOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("storedmessage") == true) {
			if (entity.getPersistentData().getBoolean("messageplaying") == true) {
				if (entity.getPersistentData().getDouble("typecounter") == 3) {
					if (entity.getPersistentData().getDouble("type") != (entity.getPersistentData().getString("currentmessage")).length()) {
						entity.getPersistentData().putDouble("type", (entity.getPersistentData().getDouble("type") + 1));
						entity.setCustomName(Component.literal(((entity.getPersistentData().getString("currentmessage")).substring(0, (int) entity.getPersistentData().getDouble("type")))));
					} else {
						entity.getPersistentData().putDouble("type", 0);
					}
					entity.getPersistentData().putDouble("typecounter", 0);
				} else {
					entity.getPersistentData().putDouble("typecounter", (entity.getPersistentData().getDouble("typecounter") + 1));
				}
			}
		}
		if (entity.getPersistentData().getDouble("ringtone") >= 46) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("one_piece:den_den_mushi_ringtone")), SoundSource.MASTER, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("one_piece:den_den_mushi_ringtone")), SoundSource.MASTER, 1, 1, false);
				}
			}
			entity.getPersistentData().putDouble("ringtone", 0);
		} else {
			entity.getPersistentData().putDouble("ringtone", (entity.getPersistentData().getDouble("ringtone") + 1));
		}
	}
}
