package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class DenDenMushiOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("sendernumber", (new java.text.DecimalFormat("#########").format(Math.round(Math.random() * 1000000000))));
	}
}
