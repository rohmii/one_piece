package net.mcreator.onepiece.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.onepiece.item.StrawHatItem;

public class StrawHatModel extends AnimatedGeoModel<StrawHatItem> {
	@Override
	public ResourceLocation getAnimationResource(StrawHatItem object) {
		return new ResourceLocation("one_piece", "animations/straw_hat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StrawHatItem object) {
		return new ResourceLocation("one_piece", "geo/straw_hat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StrawHatItem object) {
		return new ResourceLocation("one_piece", "textures/items/strawhatmapping.png");
	}
}
