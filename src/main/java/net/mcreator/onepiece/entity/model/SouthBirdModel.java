package net.mcreator.onepiece.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class SouthBirdModel extends GeoModel<SouthBirdEntity> {
	@Override
	public ResourceLocation getAnimationResource(SouthBirdEntity entity) {
		return new ResourceLocation("one_piece", "animations/southbird_model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SouthBirdEntity entity) {
		return new ResourceLocation("one_piece", "geo/southbird_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SouthBirdEntity entity) {
		return new ResourceLocation("one_piece", "textures/entities/" + entity.getTexture() + ".png");
	}

}