package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class TertiaryBar3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("tertiarycounter") >= 28 && entity.getPersistentData().getDouble("tertiarycounter") < 42) {
			return true;
		}
		return false;
	}
}
