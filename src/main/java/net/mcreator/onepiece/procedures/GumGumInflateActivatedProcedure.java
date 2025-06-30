package net.mcreator.onepiece.procedures;

import net.minecraftforge.network.NetworkDirection;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;

import net.mcreator.onepiece.OnePieceMod;

import java.util.List;
import java.util.Iterator;

public class GumGumInflateActivatedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("inflate", true);
		if (world.isClientSide()) {
			SetupAnimationsProcedure.setAnimationClientside((Player) entity, "gum.inflate", false);
		}
		if (!world.isClientSide()) {
			if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
				List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
				synchronized (connections) {
					Iterator<Connection> iterator = connections.iterator();
					while (iterator.hasNext()) {
						Connection connection = iterator.next();
						if (!connection.isConnecting() && connection.isConnected())
							OnePieceMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.OnePieceModAnimationMessage(Component.literal("gum.inflate"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
					}
				}
			}
		}
	}
}
