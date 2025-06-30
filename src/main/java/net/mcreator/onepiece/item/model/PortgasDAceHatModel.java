package net.mcreator.onepiece.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.onepiece.item.PortgasDAceHatItem;

public class PortgasDAceHatModel extends GeoModel<PortgasDAceHatItem> {
	@Override
	public ResourceLocation getAnimationResource(PortgasDAceHatItem object) {
		return new ResourceLocation("one_piece", "animations/portgas.dace_hat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PortgasDAceHatItem object) {
		return new ResourceLocation("one_piece", "geo/portgas.dace_hat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PortgasDAceHatItem object) {
		return new ResourceLocation("one_piece", "textures/item/portgasd_ace.png");
	}
}
