package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class SecondaryBar3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("secondarycounter") >= 28 && entity.getPersistentData().getDouble("secondarycounter") < 42) {
			return true;
		}
		return false;
	}
}
