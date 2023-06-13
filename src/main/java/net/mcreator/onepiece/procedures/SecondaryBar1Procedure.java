package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class SecondaryBar1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("secondarycounter") > 0 && entity.getPersistentData().getDouble("secondarycounter") < 14) {
			return true;
		}
		return false;
	}
}
