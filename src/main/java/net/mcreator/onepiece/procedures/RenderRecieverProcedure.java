package net.mcreator.onepiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.onepiece.entity.DenDenMushiEntity;

import java.util.Comparator;

public class RenderRecieverProcedure {
	public static Entity execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return null;
		return (Entity) world
				.getEntitiesOfClass(DenDenMushiEntity.class,
						AABB.ofSize(new Vec3((entity.getPersistentData().getDouble("recieverx")), (entity.getPersistentData().getDouble("recievery")), (entity.getPersistentData().getDouble("recieverz"))), 4, 4, 4), e -> true)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf((entity.getPersistentData().getDouble("recieverx")), (entity.getPersistentData().getDouble("recievery")), (entity.getPersistentData().getDouble("recieverz")))).findFirst().orElse(null);
	}
}
