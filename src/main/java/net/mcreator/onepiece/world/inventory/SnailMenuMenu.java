
package net.mcreator.onepiece.world.inventory;

import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.onepiece.procedures.SnailMenuWhileThisGUIIsOpenTickProcedure;
import net.mcreator.onepiece.init.OnePieceModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber
public class SnailMenuMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public SnailMenuMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(OnePieceModMenus.SNAIL_MENU.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(0);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		return ItemStack.EMPTY;
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}

	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		Player entity = event.player;
		if (event.phase == TickEvent.Phase.END && entity.containerMenu instanceof SnailMenuMenu) {
			Level world = entity.level;
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			SnailMenuWhileThisGUIIsOpenTickProcedure.execute(world, x, y, z, guistate);
		}
	}
}
