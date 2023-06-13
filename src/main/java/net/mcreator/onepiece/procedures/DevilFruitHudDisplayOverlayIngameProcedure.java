package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.onepiece.network.OnePieceModVariables;

public class DevilFruitHudDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OnePieceModVariables.PlayerVariables())).DevilFruitUser == true) {
			return true;
		}
		return false;
	}
}
