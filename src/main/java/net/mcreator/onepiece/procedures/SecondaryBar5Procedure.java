package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class SecondaryBar5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("secondarycounter") >= 56 && entity.getPersistentData().getDouble("secondarycounter") < 70) {
			return true;
		}
		return false;
	}
}
