package net.mcreator.onepiece.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelpistol_2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("one_piece", "modelpistol_2"), "main");
	public final ModelPart RightArm;
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart rotation;
	public final ModelPart hand;
	public final ModelPart part2;
	public final ModelPart part3;
	public final ModelPart part4;
	public final ModelPart part5;
	public final ModelPart part1;
	public final ModelPart part6;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelpistol_2(ModelPart root) {
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.rotation = this.Head.getChild("rotation");
		this.hand = this.rotation.getChild("hand");
		this.part2 = this.rotation.getChild("part2");
		this.part3 = this.rotation.getChild("part3");
		this.part4 = this.rotation.getChild("part4");
		this.part5 = this.rotation.getChild("part5");
		this.part1 = this.rotation.getChild("part1");
		this.part6 = this.rotation.getChild("part6");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition rotation = Head.addOrReplaceChild("rotation", CubeListBuilder.create().texOffs(40, 16).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition hand = rotation.addOrReplaceChild("hand",
				CubeListBuilder.create().texOffs(40, 16).addBox(-8.0F, -14.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 29).addBox(-8.0F, -16.0F, -2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 30)
						.addBox(-8.0F, -16.0F, 2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 26).addBox(-4.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-8.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 32.0F, 0.0F));
		PartDefinition part2 = rotation.addOrReplaceChild("part2",
				CubeListBuilder.create().texOffs(40, 21).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21).addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 31.0F, 0.0F));
		PartDefinition part3 = rotation.addOrReplaceChild("part3",
				CubeListBuilder.create().texOffs(40, 22).addBox(-8.0F, -28.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22).addBox(-8.0F, -29.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 37.0F, 0.0F));
		PartDefinition part4 = rotation.addOrReplaceChild("part4",
				CubeListBuilder.create().texOffs(40, 23).addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 34.0F, 0.0F));
		PartDefinition part5 = rotation.addOrReplaceChild("part5",
				CubeListBuilder.create().texOffs(40, 24).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24).addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 37.0F, 0.0F));
		PartDefinition part1 = rotation.addOrReplaceChild("part1",
				CubeListBuilder.create().texOffs(40, 20).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20).addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 29.0F, 0.0F));
		PartDefinition part6 = rotation.addOrReplaceChild("part6",
				CubeListBuilder.create().texOffs(40, 25).addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25).addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 31.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
