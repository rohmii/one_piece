package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class TertiaryBar1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("tertiarycounter") > 0 && entity.getPersistentData().getDouble("tertiarycounter") < 14) {
			return true;
		}
		return false;
	}
}
