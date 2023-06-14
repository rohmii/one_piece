package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class DenDenMushiOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("currentmessage")).isEmpty()) {
			if (entity.getPersistentData().getBoolean("start_call") == true) {
				if (entity.getPersistentData().getDouble("typecounter") == 3) {
					if (entity.getPersistentData().getDouble("type") != (entity.getPersistentData().getString("currentmessage")).length()) {
						entity.getPersistentData().putDouble("type", (entity.getPersistentData().getDouble("type") + 1));
						entity.setCustomName(Component.literal(((entity.getPersistentData().getString("currentmessage")).substring(0, (int) entity.getPersistentData().getDouble("type")))));
						entity.getPersistentData().putDouble("typecounter", 0);
					} else {
						entity.getPersistentData().putBoolean("start_call", false);
					}
				} else {
					entity.getPersistentData().putDouble("typecounter", (entity.getPersistentData().getDouble("typecounter") + 1));
				}
			}
		}
	}
}
