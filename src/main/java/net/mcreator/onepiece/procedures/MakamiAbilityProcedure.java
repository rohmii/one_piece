package net.mcreator.onepiece.procedures;

import net.minecraftforge.eventbus.api.Event;

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
