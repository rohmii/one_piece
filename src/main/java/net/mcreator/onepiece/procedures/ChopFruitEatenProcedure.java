package net.mcreator.onepiece.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ChopFruitEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ChopChopUser = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
