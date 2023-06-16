
package net.mcreator.onepiece.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.onepiece.procedures.TertiaryBar7Procedure;
import net.mcreator.onepiece.procedures.TertiaryBar6Procedure;
import net.mcreator.onepiece.procedures.TertiaryBar5Procedure;
import net.mcreator.onepiece.procedures.TertiaryBar4Procedure;
import net.mcreator.onepiece.procedures.TertiaryBar3Procedure;
import net.mcreator.onepiece.procedures.TertiaryBar2Procedure;
import net.mcreator.onepiece.procedures.TertiaryBar1Procedure;
import net.mcreator.onepiece.procedures.SecondaryBar7Procedure;
import net.mcreator.onepiece.procedures.SecondaryBar6Procedure;
import net.mcreator.onepiece.procedures.SecondaryBar5Procedure;
import net.mcreator.onepiece.procedures.SecondaryBar4Procedure;
import net.mcreator.onepiece.procedures.SecondaryBar3Procedure;
import net.mcreator.onepiece.procedures.SecondaryBar2Procedure;
import net.mcreator.onepiece.procedures.SecondaryBar1Procedure;
import net.mcreator.onepiece.procedures.PrimaryBar7Procedure;
import net.mcreator.onepiece.procedures.PrimaryBar6Procedure;
import net.mcreator.onepiece.procedures.PrimaryBar5Procedure;
import net.mcreator.onepiece.procedures.PrimaryBar4Procedure;
import net.mcreator.onepiece.procedures.PrimaryBar3Procedure;
import net.mcreator.onepiece.procedures.PrimaryBar2Procedure;
import net.mcreator.onepiece.procedures.PrimaryBar1Procedure;
import net.mcreator.onepiece.procedures.DevilFruitHudDisplayOverlayIngameProcedure;
import net.mcreator.onepiece.procedures.BaraDisplayConditionProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DevilFruitHudOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (DevilFruitHudDisplayOverlayIngameProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_0.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);

			if (BaraDisplayConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/bara_primary.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 95, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (PrimaryBar1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (PrimaryBar2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (PrimaryBar3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (PrimaryBar4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (PrimaryBar5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (PrimaryBar6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (PrimaryBar7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 94, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_0.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);

			if (BaraDisplayConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/bara_secondary.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (SecondaryBar1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (SecondaryBar2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (SecondaryBar3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (SecondaryBar4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (SecondaryBar5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (SecondaryBar6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (SecondaryBar7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 116, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_0.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);

			if (BaraDisplayConditionProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/bara_tertiary.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 138, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (TertiaryBar1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (TertiaryBar2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (TertiaryBar3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (TertiaryBar4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (TertiaryBar5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (TertiaryBar6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);
			}
			if (TertiaryBar7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("one_piece:textures/screens/power_bar_7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 137, posY + -23, 0, 0, 22, 22, 22, 22);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
