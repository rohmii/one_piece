package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.onepiece.network.OnePieceModVariables;

public class SecondaryOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OnePieceModVariables.PlayerVariables())).ChopChopUser == true) {
			if (entity.getPersistentData().getDouble("secondarycounter") <= 0) {
				entity.getPersistentData().putBoolean("secondaryactive", true);
			}
		}
	}
}
