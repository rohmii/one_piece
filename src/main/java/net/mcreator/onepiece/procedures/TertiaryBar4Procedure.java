package net.mcreator.onepiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TertiaryBar4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("tertiarycounter") >= 42 && entity.getPersistentData().getDouble("tertiarycounter") < 56) {
			return true;
		}
		return false;
	}
}
