package net.mcreator.onepiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.onepiece.entity.DenDenMushiEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SnailMenuThisGUIIsClosedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("first"), false);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof DenDenMushiEntity) {
					if (!(entityiterator.getPersistentData().getString("sendernumber")).equals(entity.getPersistentData().getString("receievernumber"))) {
						if (!(entity.getPersistentData().getString("sendernumber")).equals(entity.getPersistentData().getString("sendernumber"))) {
							if (entity.getPersistentData().getBoolean("callerfound") == true) {
								entityiterator.getPersistentData().putString("currentmessage", (entity.getPersistentData().getString("message")));
							}
						}
					}
				}
			}
		}
	}
}
