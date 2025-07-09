package net.mcreator.onepiece.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class NewsCooModel extends GeoModel<NewsCooEntity> {
	@Override
	public ResourceLocation getAnimationResource(NewsCooEntity entity) {
		return new ResourceLocation("one_piece", "animations/newscoomodel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NewsCooEntity entity) {
		return new ResourceLocation("one_piece", "geo/newscoomodel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NewsCooEntity entity) {
		return new ResourceLocation("one_piece", "textures/entities/" + entity.getTexture() + ".png");
	}

}