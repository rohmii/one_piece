
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onepiece.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.onepiece.client.model.Modelpistol_9;
import net.mcreator.onepiece.client.model.Modelpistol_8;
import net.mcreator.onepiece.client.model.Modelpistol_7;
import net.mcreator.onepiece.client.model.Modelpistol_6;
import net.mcreator.onepiece.client.model.Modelpistol_5;
import net.mcreator.onepiece.client.model.Modelpistol_4;
import net.mcreator.onepiece.client.model.Modelpistol_3;
import net.mcreator.onepiece.client.model.Modelpistol_2;
import net.mcreator.onepiece.client.model.Modelpistol_10;
import net.mcreator.onepiece.client.model.Modelpistol_1;
import net.mcreator.onepiece.client.model.Modelmakami;
import net.mcreator.onepiece.client.model.Modelinflate;
import net.mcreator.onepiece.client.model.Modelgum_bazooka;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OnePieceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpistol_9.LAYER_LOCATION, Modelpistol_9::createBodyLayer);
		event.registerLayerDefinition(Modelinflate.LAYER_LOCATION, Modelinflate::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_2.LAYER_LOCATION, Modelpistol_2::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_8.LAYER_LOCATION, Modelpistol_8::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_6.LAYER_LOCATION, Modelpistol_6::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_4.LAYER_LOCATION, Modelpistol_4::createBodyLayer);
		event.registerLayerDefinition(Modelmakami.LAYER_LOCATION, Modelmakami::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_10.LAYER_LOCATION, Modelpistol_10::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_7.LAYER_LOCATION, Modelpistol_7::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_1.LAYER_LOCATION, Modelpistol_1::createBodyLayer);
		event.registerLayerDefinition(Modelgum_bazooka.LAYER_LOCATION, Modelgum_bazooka::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_3.LAYER_LOCATION, Modelpistol_3::createBodyLayer);
		event.registerLayerDefinition(Modelpistol_5.LAYER_LOCATION, Modelpistol_5::createBodyLayer);
	}
}
