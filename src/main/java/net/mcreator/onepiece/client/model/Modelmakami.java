package net.mcreator.onepiece.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmakami<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("one_piece", "modelmakami"), "main");
	public final ModelPart left_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart tail;
	public final ModelPart right_arm;
	public final ModelPart head;
	public final ModelPart ears;
	public final ModelPart jaw;
	public final ModelPart body;

	public Modelmakami(ModelPart root) {
		this.left_arm = root.getChild("left_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = this.left_leg.getChild("right_leg");
		this.tail = root.getChild("tail");
		this.right_arm = root.getChild("right_arm");
		this.head = root.getChild("head");
		this.ears = this.head.getChild("ears");
		this.jaw = this.head.getChild("jaw");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(34, 60).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 52)
				.addBox(-1.0F, 13.3007F, -3.9537F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 74).addBox(-1.0F, 5.3007F, -1.9537F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 10.0F, -2.0F));
		PartDefinition cube_r1 = left_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, -1).addBox(0.9F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 13.3007F, 1.0463F, 0.4363F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(50, 63).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 71)
				.addBox(-3.0F, 13.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 74).addBox(-3.0F, 5.0F, -2.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 10.0F, 12.0F));
		PartDefinition cube_r2 = left_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, -1).addBox(0.9F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 13.0F, 1.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition right_leg = left_leg.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(66, 63).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 13)
				.addBox(0.0F, 13.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 0).addBox(1.0F, 5.0F, -2.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = right_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, -1).addBox(1.1F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 13.0F, 1.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(72, 58).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 28)
				.addBox(-4.0F, -3.0F, 2.0F, 8.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(52, 0).addBox(-3.0F, -2.0F, 14.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 15.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(56, 52).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 70)
				.addBox(-1.0F, 13.3731F, -3.4611F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 74).addBox(0.0F, 5.3731F, -1.4611F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 10.0F, -2.0F));
		PartDefinition cube_r4 = right_arm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, -1).addBox(0.1F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 13.3731F, 1.5389F, 0.4363F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 52).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-2.0F, 1.0F, -13.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, -11.0F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(28, 76).addBox(0.0F, -7.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(24, 76).addBox(3.0F, -7.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, -3.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition ears = head.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));
		PartDefinition cube_r6 = ears.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 76).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -1.0F, -0.1309F, 0.0F, -0.2618F));
		PartDefinition cube_r7 = ears.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 19).addBox(0.0F, -4.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -1.0F, -0.1309F, 0.0F, 0.2182F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(34, 52).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -8.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, -6.8333F, -6.5F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(52, 13)
				.addBox(-4.0F, -5.8333F, -8.5F, 8.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -4.8333F, -0.5F, 8.0F, 10.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.8333F, -2.5F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
