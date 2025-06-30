// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgum_bazooka<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gum_bazooka"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart rotation;
	private final ModelPart part1;
	private final ModelPart part2;
	private final ModelPart part3;
	private final ModelPart part4;
	private final ModelPart part5;
	private final ModelPart part6;
	private final ModelPart hand;
	private final ModelPart LeftArm;
	private final ModelPart rotation2;
	private final ModelPart part7;
	private final ModelPart part8;
	private final ModelPart part9;
	private final ModelPart part10;
	private final ModelPart part11;
	private final ModelPart part12;
	private final ModelPart hand13;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelgum_bazooka(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.rotation = this.RightArm.getChild("rotation");
		this.part1 = this.rotation.getChild("part1");
		this.part2 = this.rotation.getChild("part2");
		this.part3 = this.rotation.getChild("part3");
		this.part4 = this.rotation.getChild("part4");
		this.part5 = this.rotation.getChild("part5");
		this.part6 = this.rotation.getChild("part6");
		this.hand = this.rotation.getChild("hand");
		this.LeftArm = root.getChild("LeftArm");
		this.rotation2 = this.LeftArm.getChild("rotation2");
		this.part7 = this.rotation2.getChild("part7");
		this.part8 = this.rotation2.getChild("part8");
		this.part9 = this.rotation2.getChild("part9");
		this.part10 = this.rotation2.getChild("part10");
		this.part11 = this.rotation2.getChild("part11");
		this.part12 = this.rotation2.getChild("part12");
		this.hand13 = this.rotation2.getChild("hand13");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 32)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition rotation = RightArm
				.addOrReplaceChild("rotation",
						CubeListBuilder.create().texOffs(40, 16).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition part1 = rotation.addOrReplaceChild("part1",
				CubeListBuilder.create().texOffs(40, 20)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
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
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 39.0F, 0.0F));

		PartDefinition part3 = rotation.addOrReplaceChild("part3",
				CubeListBuilder.create().texOffs(40, 22)
						.addBox(-8.0F, -27.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -26.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -28.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-8.0F, -29.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 54.0F, 0.0F));

		PartDefinition part4 = rotation.addOrReplaceChild("part4",
				CubeListBuilder.create().texOffs(40, 23)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 61.0F, 0.0F));

		PartDefinition part5 = rotation.addOrReplaceChild("part5",
				CubeListBuilder.create().texOffs(40, 24)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 75.0F, 0.0F));

		PartDefinition part6 = rotation.addOrReplaceChild("part6",
				CubeListBuilder.create().texOffs(40, 25)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -10.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -8.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -6.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -4.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 81.0F, 0.0F));

		PartDefinition hand = rotation.addOrReplaceChild("hand",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 29)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 30)
						.addBox(-8.0F, -16.0F, 2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 26)
						.addBox(-4.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-8.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 95.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 48)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition rotation2 = LeftArm
				.addOrReplaceChild("rotation2",
						CubeListBuilder.create().texOffs(32, 48).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(7.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition part7 = rotation2.addOrReplaceChild("part7",
				CubeListBuilder.create().texOffs(32, 52)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 29.0F, 0.0F));

		PartDefinition part8 = rotation2.addOrReplaceChild("part8",
				CubeListBuilder.create().texOffs(32, 53)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 39.0F, 0.0F));

		PartDefinition part9 = rotation2.addOrReplaceChild("part9",
				CubeListBuilder.create().texOffs(32, 54)
						.addBox(-8.0F, -27.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -26.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -28.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 54)
						.addBox(-8.0F, -29.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 54.0F, 0.0F));

		PartDefinition part10 = rotation2.addOrReplaceChild("part10",
				CubeListBuilder.create().texOffs(32, 55)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 61.0F, 0.0F));

		PartDefinition part11 = rotation2.addOrReplaceChild("part11",
				CubeListBuilder.create().texOffs(32, 56)
						.addBox(-8.0F, -23.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -22.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -19.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -24.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -25.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 75.0F, 0.0F));

		PartDefinition part12 = rotation2.addOrReplaceChild("part12",
				CubeListBuilder.create().texOffs(32, 57)
						.addBox(-8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -10.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -8.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -6.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -5.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -4.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-8.0F, -17.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 81.0F, 0.0F));

		PartDefinition hand13 = rotation2.addOrReplaceChild("hand13",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-8.0F, -14.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 62)
						.addBox(-8.0F, -16.0F, -2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 62)
						.addBox(-8.0F, -16.0F, 2.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 58)
						.addBox(-4.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 58)
						.addBox(-8.0F, -16.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 95.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}