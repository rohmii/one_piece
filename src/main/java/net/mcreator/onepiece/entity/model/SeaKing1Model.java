package net.mcreator.onepiece.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.onepiece.entity.SeaKing1Entity;

public class SeaKing1Model extends GeoModel<SeaKing1Entity> {
	@Override
	public ResourceLocation getAnimationResource(SeaKing1Entity entity) {
		return new ResourceLocation("one_piece", "animations/sea_king_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SeaKing1Entity entity) {
		return new ResourceLocation("one_piece", "geo/sea_king_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SeaKing1Entity entity) {
		return new ResourceLocation("one_piece", "textures/entities/" + entity.getTexture() + ".png");
	}

}
