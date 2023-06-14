package net.mcreator.onepiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.onepiece.entity.DenDenMushiEntity;

public class RenderRecieverConditionProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (!world.getEntitiesOfClass(DenDenMushiEntity.class,
				AABB.ofSize(new Vec3((entity.getPersistentData().getDouble("recieverx")), (entity.getPersistentData().getDouble("recievery")), (entity.getPersistentData().getDouble("recieverz"))), 4, 4, 4), e -> true).isEmpty()) {
			return true;
		}
		return false;
	}
}
