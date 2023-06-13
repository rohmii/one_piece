package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class PrimaryBar1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("primarycounter") > 0 && entity.getPersistentData().getDouble("primarycounter") < 14) {
			return true;
		}
		return false;
	}
}
