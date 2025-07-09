
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.onepiece.client.renderer.SouthBirdRenderer;
import net.mcreator.onepiece.client.renderer.SeaKing1Renderer;
import net.mcreator.onepiece.client.renderer.NewsCooRenderer;
import net.mcreator.onepiece.client.renderer.DenDenMushiRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OnePieceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OnePieceModEntities.DEN_DEN_MUSHI.get(), DenDenMushiRenderer::new);
		event.registerEntityRenderer(OnePieceModEntities.SEA_KING_1.get(), SeaKing1Renderer::new);
		event.registerEntityRenderer(OnePieceModEntities.SOUTH_BIRD.get(), SouthBirdRenderer::new);
		event.registerEntityRenderer(OnePieceModEntities.NEWS_COO.get(), NewsCooRenderer::new);
	}
}
