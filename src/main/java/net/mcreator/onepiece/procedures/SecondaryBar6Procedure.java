package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class SecondaryBar6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("secondarycounter") >= 70 && entity.getPersistentData().getDouble("secondarycounter") < 84) {
			return true;
		}
		return false;
	}
}
