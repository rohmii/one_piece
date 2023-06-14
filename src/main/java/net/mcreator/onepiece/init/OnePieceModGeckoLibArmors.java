package net.mcreator.onepiece.init;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.onepiece.item.StrawHatItem;
import net.mcreator.onepiece.client.renderer.StrawHatArmorRenderer;
import net.mcreator.onepiece.OnePieceMod;

@Mod.EventBusSubscriber(modid = OnePieceMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OnePieceModGeckoLibArmors {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.AddLayers event) {
		GeoArmorRenderer.registerArmorRenderer(StrawHatItem.class, () -> new StrawHatArmorRenderer());
	}
}
