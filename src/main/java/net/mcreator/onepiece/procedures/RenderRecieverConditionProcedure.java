package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

public class RenderRecieverConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("callerfound") == true) {
			return true;
		}
		return false;
	}
}
