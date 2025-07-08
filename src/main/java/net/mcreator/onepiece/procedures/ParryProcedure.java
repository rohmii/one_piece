package net.mcreator.onepiece.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class ParryProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("parry: " + entity.getPersistentData().getDouble("parry_counter"))), false);
		if (entity.getPersistentData().getBoolean("parry") == true) {
			entity.getPersistentData().putDouble("parry_counter", (entity.getPersistentData().getDouble("parry_counter") + 1));
			if (entity.getPersistentData().getDouble("parry_counter") >= 9) {
				entity.getPersistentData().putBoolean("parry", false);
			}
		} else {
			if (entity.getPersistentData().getDouble("parry_counter") > 0) {
				entity.getPersistentData().putDouble("parry_counter", (entity.getPersistentData().getDouble("parry_counter") - 0.5));
			}
		}
	}
}
