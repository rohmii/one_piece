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

public class SnailMenuThisGUIIsClosedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof DenDenMushiEntity) {
					if (!(entity.getPersistentData().getString("snailnumber")).equals(entityiterator.getPersistentData().getString("sendernumber"))) {
						if (entity.getPersistentData().getBoolean("callerfound") == true) {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("caller has been found"), false);
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((guistate.containsKey("text:message") ? ((EditBox) guistate.get("text:message")).getValue() : "")), false);
							entityiterator.getPersistentData().putDouble("type", 0);
							entityiterator.getPersistentData().putDouble("typecounter", 0);
							entityiterator.getPersistentData().putString("currentmessage", (guistate.containsKey("text:message") ? ((EditBox) guistate.get("text:message")).getValue() : ""));
						}
					}
				}
			}
		}
	}
}
