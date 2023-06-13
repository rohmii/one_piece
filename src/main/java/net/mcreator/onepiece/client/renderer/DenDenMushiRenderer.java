
package net.mcreator.onepiece.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.onepiece.entity.model.DenDenMushiModel;
import net.mcreator.onepiece.entity.DenDenMushiEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DenDenMushiRenderer extends GeoEntityRenderer<DenDenMushiEntity> {
	public DenDenMushiRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DenDenMushiModel());
		this.shadowRadius = 0.4f;
	}

	@Override
	public RenderType getRenderType(DenDenMushiEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
