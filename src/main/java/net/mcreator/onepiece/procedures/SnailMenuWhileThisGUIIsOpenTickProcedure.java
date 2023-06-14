package net.mcreator.onepiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
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
			_tf.setValue(("Number - " + entity.getPersistentData().getString("sendernumber")));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity instanceof DenDenMushiEntity) {
					if ((guistate.containsKey("text:receievernumber") ? ((EditBox) guistate.get("text:receievernumber")).getValue() : "")
							.equals(entityiterator.getPersistentData().getString((guistate.containsKey("text:sendernumber") ? ((EditBox) guistate.get("text:sendernumber")).getValue() : "")))) {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("SNAIL FOUND"), false);
					}
				}
			}
		}
	}
}
