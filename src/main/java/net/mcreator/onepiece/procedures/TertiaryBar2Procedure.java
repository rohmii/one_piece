package net.mcreator.onepiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TertiaryBar2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("tertiarycounter") >= 14 && entity.getPersistentData().getDouble("tertiarycounter") < 28) {
			return true;
		}
		return false;
	}
}
