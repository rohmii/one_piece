package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.onepiece.network.OnePieceModVariables;

public class GumGumFruitPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.GumGumUser = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
