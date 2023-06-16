package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class DenDenMushiOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("number", (Math.round(Math.random() * 100000) + ""));
	}
}
