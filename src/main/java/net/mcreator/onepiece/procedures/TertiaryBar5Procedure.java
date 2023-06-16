package net.mcreator.onepiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TertiaryBar5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("tertiarycounter") >= 56 && entity.getPersistentData().getDouble("tertiarycounter") < 70) {
			return true;
		}
		return false;
	}
}
