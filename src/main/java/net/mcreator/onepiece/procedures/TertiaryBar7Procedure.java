package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class TertiaryBar7Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("tertiarycounter") >= 84 && entity.getPersistentData().getDouble("tertiarycounter") <= 100) {
			return true;
		}
		return false;
	}
}
