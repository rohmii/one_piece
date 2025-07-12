package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class MakamiAbilityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("makami") == true) {
			entity.getPersistentData().putBoolean("makami", false);
		} else {
			entity.getPersistentData().putBoolean("makami", true);
		}
	}
}
