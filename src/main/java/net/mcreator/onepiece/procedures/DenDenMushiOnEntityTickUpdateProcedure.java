package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class DenDenMushiOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("type", (entity.getPersistentData().getDouble("type") + 1));
		entity.setCustomName(Component.literal(((entity.getPersistentData().getString("currentmessage")).substring(0, (int) entity.getPersistentData().getDouble("type")))));
	}
}
