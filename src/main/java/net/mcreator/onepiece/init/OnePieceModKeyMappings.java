
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.onepiece.network.TertiaryMessage;
import net.mcreator.onepiece.network.SecondaryMessage;
import net.mcreator.onepiece.network.PrimaryMessage;
import net.mcreator.onepiece.OnePieceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OnePieceModKeyMappings {
	public static final KeyMapping SECONDARY = new KeyMapping("key.one_piece.secondary", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				OnePieceMod.PACKET_HANDLER.sendToServer(new SecondaryMessage(0, 0));
				SecondaryMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SECONDARY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SECONDARY_LASTPRESS);
				OnePieceMod.PACKET_HANDLER.sendToServer(new SecondaryMessage(1, dt));
				SecondaryMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PRIMARY = new KeyMapping("key.one_piece.primary", GLFW.GLFW_KEY_G, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				OnePieceMod.PACKET_HANDLER.sendToServer(new PrimaryMessage(0, 0));
				PrimaryMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TERTIARY = new KeyMapping("key.one_piece.tertiary", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				OnePieceMod.PACKET_HANDLER.sendToServer(new TertiaryMessage(0, 0));
				TertiaryMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				TERTIARY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - TERTIARY_LASTPRESS);
				OnePieceMod.PACKET_HANDLER.sendToServer(new TertiaryMessage(1, dt));
				TertiaryMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long SECONDARY_LASTPRESS = 0;
	private static long TERTIARY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SECONDARY);
		event.register(PRIMARY);
		event.register(TERTIARY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SECONDARY.consumeClick();
				PRIMARY.consumeClick();
				TERTIARY.consumeClick();
			}
		}
	}
}
