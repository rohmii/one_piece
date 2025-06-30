package net.mcreator.onepiece.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.onepiece.entity.DenDenMushiEntity;

import java.util.List;
import java.util.HashMap;
import java.util.Comparator;

public class SnailMenuThisGUIIsClosedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap guistate) {
		if (guistate == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(500 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof DenDenMushiEntity) {
					if ((entityiterator.getPersistentData().getString("number")).equals(guistate.containsKey("text:recievernumber") ? ((EditBox) guistate.get("text:recievernumber")).getValue() : "")) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 300, 1, false, false));
						entityiterator.getPersistentData().putDouble("type", 0);
						entityiterator.getPersistentData().putDouble("typecounter", 0);
						entityiterator.getPersistentData().putString("currentmessage", (guistate.containsKey("text:message") ? ((EditBox) guistate.get("text:message")).getValue() : ""));
						entityiterator.getPersistentData().putBoolean("storedmessage", true);
					}
				}
			}
		}
	}
}
