package net.mcreator.onepiece.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.onepiece.world.inventory.SnailMenuMenu;
import net.mcreator.onepiece.procedures.RenderSnailProcedure;
import net.mcreator.onepiece.procedures.RenderRecieverProcedure;
import net.mcreator.onepiece.network.SnailMenuButtonMessage;
import net.mcreator.onepiece.OnePieceMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SnailMenuScreen extends AbstractContainerScreen<SnailMenuMenu> {
	private final static HashMap<String, Object> guistate = SnailMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox recievernumber;
	EditBox sendernumber;
	EditBox message;
	Button button_send_message;

	public SnailMenuScreen(SnailMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 263;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("one_piece:textures/screens/snail_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		recievernumber.render(guiGraphics, mouseX, mouseY, partialTicks);
		sendernumber.render(guiGraphics, mouseX, mouseY, partialTicks);
		message.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (RenderSnailProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 55, this.topPos + 88, 100, 0f + (float) Math.atan((this.leftPos + 55 - mouseX) / 40.0), (float) Math.atan((this.topPos + 39 - mouseY) / 40.0), livingEntity);
		}
		if (RenderRecieverProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 196, this.topPos + 90, 100, 1.1f + (float) Math.atan((this.leftPos + 196 - mouseX) / 40.0), (float) Math.atan((this.topPos + 41 - mouseY) / 40.0),
					livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (recievernumber.isFocused())
			return recievernumber.keyPressed(key, b, c);
		if (sendernumber.isFocused())
			return sendernumber.keyPressed(key, b, c);
		if (message.isFocused())
			return message.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		recievernumber.tick();
		sendernumber.tick();
		message.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String recievernumberValue = recievernumber.getValue();
		String sendernumberValue = sendernumber.getValue();
		String messageValue = message.getValue();
		super.resize(minecraft, width, height);
		recievernumber.setValue(recievernumberValue);
		sendernumber.setValue(sendernumberValue);
		message.setValue(messageValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		recievernumber = new EditBox(this.font, this.leftPos + 7, this.topPos + 130, 118, 18, Component.translatable("gui.one_piece.snail_menu.recievernumber")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.one_piece.snail_menu.recievernumber").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.one_piece.snail_menu.recievernumber").getString());
				else
					setSuggestion(null);
			}
		};
		recievernumber.setSuggestion(Component.translatable("gui.one_piece.snail_menu.recievernumber").getString());
		recievernumber.setMaxLength(32767);
		guistate.put("text:recievernumber", recievernumber);
		this.addWidget(this.recievernumber);
		sendernumber = new EditBox(this.font, this.leftPos + 8, this.topPos + 7, 118, 18, Component.translatable("gui.one_piece.snail_menu.sendernumber"));
		sendernumber.setMaxLength(32767);
		guistate.put("text:sendernumber", sendernumber);
		this.addWidget(this.sendernumber);
		message = new EditBox(this.font, this.leftPos + 134, this.topPos + 129, 118, 18, Component.translatable("gui.one_piece.snail_menu.message")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.one_piece.snail_menu.message").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.one_piece.snail_menu.message").getString());
				else
					setSuggestion(null);
			}
		};
		message.setSuggestion(Component.translatable("gui.one_piece.snail_menu.message").getString());
		message.setMaxLength(32767);
		guistate.put("text:message", message);
		this.addWidget(this.message);
		button_send_message = Button.builder(Component.translatable("gui.one_piece.snail_menu.button_send_message"), e -> {
			if (true) {
				OnePieceMod.PACKET_HANDLER.sendToServer(new SnailMenuButtonMessage(0, x, y, z));
				SnailMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 164, this.topPos + 6, 88, 20).build();
		guistate.put("button:button_send_message", button_send_message);
		this.addRenderableWidget(button_send_message);
	}
}
