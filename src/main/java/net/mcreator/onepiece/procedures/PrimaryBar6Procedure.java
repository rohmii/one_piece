package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class PrimaryBar6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("primarycounter") >= 70 && entity.getPersistentData().getDouble("primarycounter") < 84) {
			return true;
		}
		return false;
	}
}
