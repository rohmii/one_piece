package net.mcreator.onepiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
