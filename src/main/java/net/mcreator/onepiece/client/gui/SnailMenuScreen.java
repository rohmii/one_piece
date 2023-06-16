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
import net.minecraft.client.Minecraft;

import net.mcreator.onepiece.world.inventory.SnailMenuMenu;
import net.mcreator.onepiece.procedures.RenderSnailProcedure;
import net.mcreator.onepiece.procedures.RenderRecieverProcedure;
import net.mcreator.onepiece.network.SnailMenuButtonMessage;
import net.mcreator.onepiece.OnePieceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SnailMenuScreen extends AbstractContainerScreen<SnailMenuMenu> {
	private final static HashMap<String, Object> guistate = SnailMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox receievernumber;
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
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		receievernumber.render(ms, mouseX, mouseY, partialTicks);
		sendernumber.render(ms, mouseX, mouseY, partialTicks);
		message.render(ms, mouseX, mouseY, partialTicks);
		if (RenderSnailProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 56, this.topPos + 89, 100, 0f + (float) Math.atan((this.leftPos + 56 - mouseX) / 40.0), (float) Math.atan((this.topPos + 39 - mouseY) / 40.0), livingEntity);
		}
		if (RenderRecieverProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 197, this.topPos + 91, 100, 1.1f + (float) Math.atan((this.leftPos + 197 - mouseX) / 40.0), (float) Math.atan((this.topPos + 41 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (receievernumber.isFocused())
			return receievernumber.keyPressed(key, b, c);
		if (sendernumber.isFocused())
			return sendernumber.keyPressed(key, b, c);
		if (message.isFocused())
			return message.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		receievernumber.tick();
		sendernumber.tick();
		message.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		receievernumber = new EditBox(this.font, this.leftPos + 6, this.topPos + 129, 120, 20, Component.translatable("gui.one_piece.snail_menu.receievernumber")) {
			{
				setSuggestion(Component.translatable("gui.one_piece.snail_menu.receievernumber").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.one_piece.snail_menu.receievernumber").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.one_piece.snail_menu.receievernumber").getString());
				else
					setSuggestion(null);
			}
		};
		receievernumber.setMaxLength(32767);
		guistate.put("text:receievernumber", receievernumber);
		this.addWidget(this.receievernumber);
		sendernumber = new EditBox(this.font, this.leftPos + 7, this.topPos + 6, 120, 20, Component.translatable("gui.one_piece.snail_menu.sendernumber"));
		sendernumber.setMaxLength(32767);
		guistate.put("text:sendernumber", sendernumber);
		this.addWidget(this.sendernumber);
		message = new EditBox(this.font, this.leftPos + 133, this.topPos + 128, 120, 20, Component.translatable("gui.one_piece.snail_menu.message")) {
			{
				setSuggestion(Component.translatable("gui.one_piece.snail_menu.message").getString());
			}

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
		message.setMaxLength(32767);
		guistate.put("text:message", message);
		this.addWidget(this.message);
		button_send_message = new Button(this.leftPos + 164, this.topPos + 6, 88, 20, Component.translatable("gui.one_piece.snail_menu.button_send_message"), e -> {
			if (true) {
				OnePieceMod.PACKET_HANDLER.sendToServer(new SnailMenuButtonMessage(0, x, y, z));
				SnailMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_send_message", button_send_message);
		this.addRenderableWidget(button_send_message);
	}
}
