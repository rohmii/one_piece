package net.mcreator.onepiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.onepiece.entity.DenDenMushiEntity;

import java.util.HashMap;
import java.util.Comparator;

public class SnailMenuThisGUIIsOpenedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:message") instanceof EditBox _tf)
			_tf.setValue("");
		if (guistate.get("text:recievernumber") instanceof EditBox _tf)
			_tf.setValue("");
		if (guistate.get("text:sendernumber") instanceof EditBox _tf)
			_tf.setValue((((Entity) world.getEntitiesOfClass(DenDenMushiEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("number")));
	}
}
