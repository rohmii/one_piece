package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class PrimaryBar5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("primarycounter") >= 56 && entity.getPersistentData().getDouble("primarycounter") < 70) {
			return true;
		}
		return false;
	}
}
