package net.mcreator.onepiece.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.onepiece.network.OnePieceModVariables;

public class SecondaryOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OnePieceModVariables.PlayerVariables())).GumGumUser == true) {
			GumGumSecondaryPressedProcedure.execute(world, x, y, z, entity);
		}
	}
}
