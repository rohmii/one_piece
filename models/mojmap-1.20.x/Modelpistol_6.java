// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpistol_6<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pistol_6"), "main");
	private final ModelPart RightArm;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart rotation;
	private final ModelPart part1;
	private final ModelPart part2;
	private final ModelPart part3;
	private final ModelPart part4;
	private final ModelPart part5;
	private final ModelPart part6;
	private final ModelPart hand;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelpistol_6(ModelPart root) {
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.rotation = this.Head.getChild("rotation");
		this.part1 = this.rotation.getChild("part1");
		this.part2 = this.rotation.getChild("part2");
		this.part3 = this.rotation.getChild("part3");
		this.part4 = this.rotation.getChild("part4");
		this.part5 = this.rotation.getChild("part5");
		this.part6 = this.rotation.getChild("part6");
		this.hand = this.rotation.getChild("hand");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition rotation = Head
				.addOrReplaceChild("rotation",
						CubeListBuilder.create().texOffs(40, 16).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition part1 = rotation.addOrReplaceChild("part1",
				CubeListBuilder.create().texOffs(40, 20)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 29.0F, 0.0F));

		PartDefinition part2 = rotation.addOrReplaceChild("part2",
				CubeListBuilder.create().texOffs(40, 21)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 35.0F, 0.0F));

		PartDefinition part3 = rotation.addOrReplaceChild("part3",
				CubeListBuilder.create().texOffs(40, 22)
						.addBox(-8.0F, -27.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -26.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -28.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -29.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 45.0F, 0.0F));

		PartDefinition part4 = rotation.addOrReplaceChild("part4",
				CubeListBuilder.create().texOffs(40, 23)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 46.0F, 0.0F));

		PartDefinition part5 = rotation.addOrReplaceChild("part5",
				CubeListBuilder.create().texOffs(40, 24)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 53.0F, 0.0F));

		PartDefinition part6 = rotation.addOrReplaceChild("part6",
				CubeListBuilder.create().texOffs(40, 25)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 51.0F, 0.0F));

		PartDefinition hand = rotation.addOrReplaceChild("hand",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 29)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 30)
						.addBox(-8.0F, -16.0F, 2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 26)
						.addBox(-4.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-8.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 57.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}