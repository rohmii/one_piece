package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class PrimaryBar7Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("primarycounter") >= 84 && entity.getPersistentData().getDouble("primarycounter") <= 100) {
			return true;
		}
		return false;
	}
}
