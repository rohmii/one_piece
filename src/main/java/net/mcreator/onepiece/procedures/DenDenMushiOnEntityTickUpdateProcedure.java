package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class DenDenMushiOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("type") != (entity.getPersistentData().getString("currentmessage")).length()) {
			entity.getPersistentData().putDouble("type", (entity.getPersistentData().getDouble("type") + 1));
			entity.setCustomName(Component.literal(((entity.getPersistentData().getString("currentmessage")).substring((int) entity.getPersistentData().getDouble("type"), (int) (entity.getPersistentData().getDouble("type") + 8)))));
		}
	}
}
