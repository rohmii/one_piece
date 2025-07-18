package net.mcreator.onepiece.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.onepiece.world.inventory.SnailMenuMenu;

import io.netty.buffer.Unpooled;

public class DenDenRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getPersistentData().getBoolean("storedmessage") == false) {
			sourceentity.getPersistentData().putString("number", (entity.getPersistentData().getString("number")));
			if (sourceentity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("SnailMenu");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new SnailMenuMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		} else {
			if (entity.getPersistentData().getBoolean("messageplaying") == true) {
				entity.getPersistentData().putBoolean("messageplaying", false);
				entity.getPersistentData().putBoolean("storedmessage", false);
				entity.setCustomName(Component.literal(""));
			} else {
				entity.getPersistentData().putBoolean("messageplaying", true);
			}
		}
	}
}
