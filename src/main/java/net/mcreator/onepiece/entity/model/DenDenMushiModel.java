package net.mcreator.onepiece.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.onepiece.entity.DenDenMushiEntity;

public class DenDenMushiModel extends GeoModel<DenDenMushiEntity> {
	@Override
	public ResourceLocation getAnimationResource(DenDenMushiEntity entity) {
		return new ResourceLocation("one_piece", "animations/den_den_mushi.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DenDenMushiEntity entity) {
		return new ResourceLocation("one_piece", "geo/den_den_mushi.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DenDenMushiEntity entity) {
		return new ResourceLocation("one_piece", "textures/entities/" + entity.getTexture() + ".png");
	}

}
