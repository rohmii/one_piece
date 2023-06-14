package net.mcreator.onepiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.onepiece.entity.DenDenMushiEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;

public class SnailMenuWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.get("text:sendernumber") instanceof EditBox _tf)
			_tf.setValue(("Number - " + ((Entity) world.getEntitiesOfClass(DenDenMushiEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("sendernumber")));
		if (!(guistate.containsKey("text:receievernumber") ? ((EditBox) guistate.get("text:receievernumber")).getValue() : "").equals("")) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof DenDenMushiEntity) {
						if (!(guistate.containsKey("text:receievernumber") ? ((EditBox) guistate.get("text:receievernumber")).getValue() : "")
								.equals(guistate.containsKey("text:sendernumber") ? ((EditBox) guistate.get("text:sendernumber")).getValue() : "")) {
							if ((guistate.containsKey("text:receievernumber") ? ((EditBox) guistate.get("text:receievernumber")).getValue() : "").equals(entityiterator.getPersistentData().getString("sendernumber"))) {
								entity.getPersistentData().putBoolean("callerfound", true);
								entity.getPersistentData().putDouble("recieverx", (entityiterator.getX()));
								entity.getPersistentData().putDouble("recieverx", (entityiterator.getY()));
								entity.getPersistentData().putDouble("recieverz", (entityiterator.getZ()));
							} else {
								entity.getPersistentData().putBoolean("callerfound", false);
							}
						}
					}
				}
			}
		}
	}
}
