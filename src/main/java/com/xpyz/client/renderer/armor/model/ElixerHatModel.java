package com.xpyz.client.renderer.armor.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.xpyz.Elixer2;
import com.xpyz.items.ElixerHatItem;

import com.xpyz.items.ItemInit;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;

public final class ElixerHatModel<S extends HumanoidRenderState> extends HumanoidModel<S> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Elixer2.id("elixer_hat"), "main");
	private final ModelPart bipedHead;
	private final ModelPart armorHead;
	private final ModelPart group;
	private final ModelPart brim;
	private final ModelPart hat;
	private final ModelPart group2;
	private final ModelPart star;
	private final ModelPart group3;
	private final ModelPart group4;
	private final ModelPart group5;
	private final ModelPart group6;
	private final ModelPart group7;
	private final ModelPart group8;
	private final ModelPart group9;
	private final ModelPart group10;
	private final ModelPart group11;
	private final ModelPart group12;
	private final ModelPart group13;
	private final ModelPart group14;
	private final ModelPart group15;
	private final ModelPart group16;
	private final ModelPart group17;
	private final ModelPart group18;
	private final ModelPart bipedBody;
	private final ModelPart armorBody;
	private final ModelPart bipedRightArm;
	private final ModelPart armorRightArm;
	private final ModelPart bipedLeftArm;
	private final ModelPart armorLeftArm;
	private final ModelPart bipedLeftLeg;
	private final ModelPart armorLeftLeg;
	private final ModelPart armorLeftBoot;
	private final ModelPart bipedRightLeg;
	private final ModelPart armorRightLeg;
	private final ModelPart armorRightBoot;

    public ElixerHatModel(ModelPart root) {
        super(root);
        this.bipedHead = root.getChild("head");
		this.armorHead = this.bipedHead.getChild("hat");
		this.group = this.armorHead.getChild("group");
		this.brim = this.group.getChild("brim");
		this.hat = this.armorHead.getChild("hat");
		this.group2 = this.armorHead.getChild("group2");
		this.star = this.group2.getChild("star");
		this.group3 = this.group2.getChild("group3");
		this.group4 = this.armorHead.getChild("group4");
		this.group5 = this.armorHead.getChild("group5");
		this.group6 = this.armorHead.getChild("group6");
		this.group7 = this.armorHead.getChild("group7");
		this.group8 = this.group7.getChild("group8");
		this.group9 = this.armorHead.getChild("group9");
		this.group10 = this.armorHead.getChild("group10");
		this.group11 = this.armorHead.getChild("group11");
		this.group12 = this.armorHead.getChild("group12");
		this.group13 = this.armorHead.getChild("group13");
		this.group14 = this.armorHead.getChild("group14");
		this.group15 = this.armorHead.getChild("group15");
		this.group16 = this.armorHead.getChild("group16");
		this.group17 = this.armorHead.getChild("group17");
		this.group18 = this.armorHead.getChild("group18");
		this.bipedBody = root.getChild("body");
		this.armorBody = this.bipedBody.getChild("armorBody");
		this.bipedRightArm = root.getChild("right_arm");
		this.armorRightArm = this.bipedRightArm.getChild("armorRightArm");
		this.bipedLeftArm = root.getChild("left_arm");
		this.armorLeftArm = this.bipedLeftArm.getChild("armorLeftArm");
		this.bipedLeftLeg = root.getChild("left_leg");
		this.armorLeftLeg = this.bipedLeftLeg.getChild("armorLeftLeg");
		this.armorLeftBoot = this.bipedLeftLeg.getChild("armorLeftBoot");
		this.bipedRightLeg = root.getChild("right_leg");
		this.armorRightLeg = this.bipedRightLeg.getChild("armorRightLeg");
		this.armorRightBoot = this.bipedRightLeg.getChild("armorRightBoot");
    }
    
    public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead = bipedHead.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition group = armorHead.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition brim = group.addOrReplaceChild("brim", CubeListBuilder.create().texOffs(38, 0).addBox(-21.7584F, 21.0F, -6.9327F, 12.5F, 0.45F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(9, 38).mirror().addBox(-21.7584F, 21.0F, -8.1327F, 12.5F, 0.45F, 1.25F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(5, 38).addBox(-21.7584F, 21.0F, 7.0673F, 12.5F, 0.45F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(15.7878F, -28.0F, -0.2794F));

		PartDefinition cube_r1 = brim.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 0).addBox(-9.35F, -3.5F, -5.0F, 8.6F, 0.85F, 7.55F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.4584F, 22.8409F, -0.5263F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hat = armorHead.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(34, 0).addBox(-4.5206F, -9.4F, -5.1622F, 9.6F, 2.8F, 10.6F, new CubeDeformation(0.0F))
		.texOffs(48, 16).addBox(-1.7206F, -16.1659F, 2.3251F, 4.0F, 4.2F, 5.6F, new CubeDeformation(0.0F))
		.texOffs(25, 49).addBox(-0.9706F, -15.0659F, 7.9251F, 2.5F, 2.5F, 2.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hat.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 57).mirror().addBox(-4.8F, -9.35F, 11.0F, 0.6F, 0.6F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(55, 16).addBox(-5.05F, -9.7F, 9.5F, 1.1F, 1.2F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7794F, -1.3833F, 5.9099F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hat.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 51).mirror().addBox(-5.75F, -9.25F, 6.0F, 1.5F, 1.3F, 1.75F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2794F, -8.4004F, 1.2698F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hat.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 18).addBox(-6.2F, -13.5F, 0.3F, 6.4F, 7.2F, 6.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2795F, -2.2226F, 6.7049F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hat.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 20).addBox(-9.3F, -6.8F, -5.0F, 8.6F, 3.3F, 9.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2794F, -5.1591F, -0.8057F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group2 = armorHead.addOrReplaceChild("group2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition star = group2.addOrReplaceChild("star", CubeListBuilder.create().texOffs(33, 33).mirror().addBox(-24.6927F, 21.9222F, 10.8388F, 0.32F, 0.5F, 2.25F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(57, 43).addBox(-24.6927F, 21.9222F, 10.0457F, 0.32F, 0.5F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(24.8021F, -33.9496F, 1.7206F));

		PartDefinition cube_r6 = star.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(0.03F, 2.3086F, 0.9047F, 0.32F, 0.4F, 0.35F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-24.7227F, 19.65F, 14.0816F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r7 = star.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 58).addBox(0.03F, 2.3086F, -1.2547F, 0.32F, 0.4F, 0.35F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.7227F, 19.65F, 9.053F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = star.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 58).mirror().addBox(0.03F, 2.3086F, 0.7453F, 0.32F, 0.5F, 0.35F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, 58).mirror().addBox(0.03F, 1.0086F, 1.3453F, 0.32F, 0.5F, 0.35F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-24.7227F, 20.4546F, 9.6898F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = star.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(54, 57).addBox(0.03F, -0.5086F, 2.1453F, 0.32F, 0.5F, 1.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.7227F, 24.8291F, 10.6941F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r10 = star.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(50, 57).addBox(0.03F, -0.5086F, -3.3953F, 0.32F, 0.5F, 1.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.7227F, 24.8291F, 12.4405F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r11 = star.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 40).addBox(0.03F, 2.1453F, -0.6086F, 0.32F, 1.25F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.7227F, 21.0187F, 12.1205F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r12 = star.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 57).mirror().addBox(0.03F, 0.9453F, 0.4914F, 0.32F, 2.45F, 0.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-24.7227F, 21.0504F, 12.513F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r13 = star.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(57, 57).addBox(0.03F, 2.1453F, 0.0086F, 0.32F, 1.25F, 0.6F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.7227F, 21.0187F, 11.0141F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r14 = star.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(0.03F, 1.1453F, -0.9914F, 0.32F, 2.25F, 0.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-24.7227F, 21.0504F, 10.6216F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r15 = star.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(41, 58).mirror().addBox(0.03F, -0.3953F, 1.0086F, 0.32F, 1.95F, 0.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-24.7227F, 20.8508F, 10.2355F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r16 = star.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(38, 58).mirror().addBox(0.03F, -0.3953F, 0.8086F, 0.32F, 1.75F, 0.7F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-24.7227F, 22.0055F, 10.5381F, 0.3927F, 0.0F, 0.0F));

		PartDefinition group3 = group2.addOrReplaceChild("group3", CubeListBuilder.create().texOffs(36, 58).addBox(-16.0284F, 14.4F, 13.3673F, 0.22F, 0.6F, 0.3F, new CubeDeformation(0.0F))
		.texOffs(25, 58).mirror().addBox(-15.8084F, 14.95F, 13.2673F, 0.58F, 0.7F, 0.5F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(31, 58).mirror().addBox(-15.2284F, 14.4F, 13.3673F, 0.22F, 0.6F, 0.3F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(15.7878F, -28.5F, -0.2794F));

		PartDefinition group4 = armorHead.addOrReplaceChild("group4", CubeListBuilder.create().texOffs(35, 31).mirror().addBox(5.0794F, -9.05F, -5.4122F, 0.25F, 0.3F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(24, 27).addBox(-4.7706F, -9.05F, -5.4122F, 0.25F, 0.3F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(46, 46).mirror().addBox(-4.7706F, -9.05F, 5.3878F, 10.1F, 0.3F, 0.25F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(47, 46).mirror().addBox(-4.7706F, -9.05F, -5.5122F, 10.1F, 0.3F, 0.25F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(43, 51).mirror().addBox(-2.0206F, -7.75F, 5.7878F, 4.2F, 0.8F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(38, 42).addBox(5.0794F, -8.8F, -5.4122F, 0.25F, 1.7F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(6, 42).addBox(-4.7706F, -8.8F, -5.4122F, 0.25F, 1.7F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(50, 46).addBox(-4.7706F, -8.8F, -5.5122F, 10.1F, 1.7F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(52, 46).mirror().addBox(-4.7706F, -8.8F, 5.3878F, 10.1F, 1.7F, 0.25F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(38, 40).addBox(5.1795F, -8.0F, -5.8622F, 0.55F, 1.0F, 11.9F, new CubeDeformation(0.0F))
		.texOffs(40, 39).addBox(-5.2206F, -8.0F, -5.8622F, 0.55F, 1.0F, 11.9F, new CubeDeformation(0.0F))
		.texOffs(41, 40).mirror().addBox(-5.2306F, -8.0F, -5.9122F, 10.96F, 1.0F, 0.55F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(42, 42).mirror().addBox(-5.2306F, -8.0F, 5.4878F, 10.96F, 1.0F, 0.55F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition group5 = armorHead.addOrReplaceChild("group5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = group5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 58).addBox(-1.25F, -0.75F, -1.2F, 1.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 58).addBox(-1.25F, -0.75F, -16.65F, 1.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 52).mirror().addBox(-1.25F, -0.75F, -2.15F, 3.0F, 0.3F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 51).mirror().addBox(-1.25F, -0.75F, -15.65F, 3.0F, 0.3F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(49, 50).mirror().addBox(-1.25F, -0.75F, -3.15F, 5.0F, 0.3F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 48).mirror().addBox(-1.25F, -0.75F, -14.65F, 5.0F, 0.3F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 40).addBox(-1.25F, -0.75F, -5.15F, 6.0F, 0.3F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 40).mirror().addBox(-1.25F, -0.75F, -13.65F, 6.0F, 0.3F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 26).addBox(-1.25F, -0.75F, -11.65F, 7.0F, 0.3F, 6.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3973F, -5.8287F, 8.2378F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group6 = armorHead.addOrReplaceChild("group6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = group6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(59, 7).addBox(-0.75F, -0.75F, -1.2F, 1.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(59, 4).addBox(-0.75F, -0.75F, -16.65F, 1.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 52).addBox(-2.75F, -0.75F, -2.15F, 3.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 17).addBox(-2.75F, -0.75F, -15.65F, 3.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-4.75F, -0.75F, -3.15F, 5.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 51).addBox(-4.75F, -0.75F, -14.65F, 5.0F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 41).mirror().addBox(-5.75F, -0.75F, -5.15F, 6.0F, 0.3F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 41).addBox(-5.75F, -0.75F, -13.65F, 6.0F, 0.3F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(49, 28).addBox(-6.75F, -0.75F, -11.65F, 7.0F, 0.3F, 6.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.9145F, -6.2114F, 8.2378F, 0.0F, 0.0F, -0.3927F));

		PartDefinition group7 = armorHead.addOrReplaceChild("group7", CubeListBuilder.create().texOffs(12, 38).addBox(-5.9706F, -7.0F, 7.9878F, 12.5F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 44).addBox(-4.9706F, -7.0F, 8.9878F, 10.5F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 48).addBox(-2.9705F, -7.0F, 9.9878F, 6.5F, 0.3F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition group8 = group7.addOrReplaceChild("group8", CubeListBuilder.create(), PartPose.offset(0.0878F, -32.25F, 7.7206F));

		PartDefinition cube_r19 = group8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(11, 48).addBox(-3.25F, -0.75F, -3.5F, 6.5F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 44).addBox(-5.25F, -0.75F, -2.5F, 10.5F, 0.3F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 38).addBox(-6.25F, -0.75F, -1.5F, 12.5F, 0.3F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1916F, 25.7516F, -15.3838F, 0.3927F, 0.0F, 0.0F));

		PartDefinition group9 = armorHead.addOrReplaceChild("group9", CubeListBuilder.create().texOffs(5, 14).addBox(2.4794F, -9.15F, -6.0622F, 0.55F, 1.95F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(8, 15).mirror().addBox(3.0295F, -9.45F, -6.0622F, 0.85F, 2.45F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 16).addBox(3.8794F, -9.15F, -6.0622F, 0.55F, 1.95F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(59, 19).addBox(4.3795F, -8.85F, -6.0622F, 0.35F, 1.35F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(59, 22).addBox(2.1795F, -8.85F, -6.0622F, 0.35F, 1.35F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition group10 = armorHead.addOrReplaceChild("group10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r20 = group10.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(27, 27).mirror().addBox(-9.1F, -1.1F, -15.15F, 0.75F, 1.65F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(24, 26).addBox(-6.9F, -1.1F, -15.15F, 0.75F, 1.65F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(20, 25).mirror().addBox(-7.4F, -1.4F, -15.15F, 0.95F, 2.25F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(42, 24).mirror().addBox(-8.25F, -1.7F, -15.15F, 1.25F, 2.75F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 23).mirror().addBox(-8.8F, -1.4F, -15.15F, 0.95F, 2.25F, 0.1F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.2795F, -2.0F, 7.7878F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group11 = armorHead.addOrReplaceChild("group11", CubeListBuilder.create().texOffs(59, 30).addBox(5.8555F, -8.4424F, -4.3066F, 0.176F, 0.704F, 0.704F, new CubeDeformation(0.0F))
		.texOffs(32, 31).addBox(5.6795F, -9.3224F, -4.4826F, 0.176F, 1.76F, 1.056F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r21 = group11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(59, 43).addBox(-0.176F, -0.4337F, -0.7982F, 0.176F, 1.056F, 1.232F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8555F, -7.7384F, -4.3066F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = group11.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 40).addBox(-0.176F, -0.9617F, 0.0943F, 0.176F, 1.056F, 1.232F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8555F, -7.7384F, -4.3066F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r23 = group11.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(59, 37).addBox(-0.176F, -0.9293F, -1.1441F, 0.176F, 1.056F, 1.232F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8555F, -7.7384F, -4.3066F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r24 = group11.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(59, 34).addBox(-0.176F, -0.595F, 0.5432F, 0.176F, 1.056F, 1.232F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8555F, -7.7384F, -4.3066F, 0.3927F, 0.0F, 0.0F));

		PartDefinition group12 = armorHead.addOrReplaceChild("group12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = group12.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(19, 46).addBox(-2.5376F, -7.0574F, -6.8141F, 0.2257F, 3.3462F, 0.9126F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2538F, -0.128F, -0.8674F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r26 = group12.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(4, 45).addBox(-2.5376F, -9.6127F, 2.0686F, 0.2257F, 3.3462F, 0.9126F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2538F, -0.128F, -0.8674F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r27 = group12.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 51).addBox(-2.5376F, -7.7875F, -5.4148F, 0.2257F, 0.9126F, 3.3462F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2538F, -0.128F, -0.8674F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group13 = armorHead.addOrReplaceChild("group13", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r28 = group13.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 47).addBox(-10.5F, -2.2F, -13.175F, 0.75F, 2.25F, 0.075F, new CubeDeformation(0.0F))
		.texOffs(49, 56).addBox(-11.25F, -1.45F, -13.175F, 2.25F, 0.75F, 0.075F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2794F, -2.0F, 5.7878F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group14 = armorHead.addOrReplaceChild("group14", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r29 = group14.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(34, 50).mirror().addBox(-13.0124F, -3.1518F, -10.1827F, 0.1025F, 1.1224F, 1.0248F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 53).addBox(-13.0124F, -2.127F, -11.3295F, 0.1025F, 1.0248F, 1.1224F, new CubeDeformation(0.0F))
		.texOffs(34, 50).mirror().addBox(-13.0124F, -1.1998F, -10.1827F, 0.1025F, 1.1224F, 1.0248F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 53).addBox(-13.0124F, -2.127F, -9.1335F, 0.1025F, 1.0248F, 1.0004F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2794F, -2.0F, 5.7878F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r30 = group14.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(11, 60).addBox(-15.306F, -1.19F, -12.652F, 0.122F, 0.976F, 1.098F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.7195F, -2.0F, 8.2278F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group15 = armorHead.addOrReplaceChild("group15", CubeListBuilder.create().texOffs(59, 53).addBox(-5.6955F, -8.7242F, -0.4583F, 0.2165F, 0.8659F, 0.8659F, new CubeDeformation(0.0F))
		.texOffs(47, 54).mirror().addBox(-5.479F, -9.8066F, -0.6748F, 0.2165F, 2.1648F, 1.2989F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r31 = group15.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(57, 11).addBox(0.0F, -0.5335F, -0.9818F, 0.2165F, 1.2989F, 1.5154F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.479F, -7.8583F, -0.4583F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r32 = group15.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 7).addBox(0.0F, -1.1829F, 0.1159F, 0.2165F, 1.2989F, 1.5154F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.479F, -7.8583F, -0.4583F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r33 = group15.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(56, 57).addBox(0.0F, -1.143F, -1.4073F, 0.2165F, 1.2989F, 1.5154F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.479F, -7.8583F, -0.4583F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r34 = group15.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(52, 56).addBox(0.0F, -0.7318F, 0.6682F, 0.2165F, 1.2989F, 1.5154F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.479F, -7.8583F, -0.4583F, 0.3927F, 0.0F, 0.0F));

		PartDefinition group16 = armorHead.addOrReplaceChild("group16", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r35 = group16.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(57, 33).addBox(-9.7F, -1.85F, -0.3F, 0.6F, 0.1F, 2.4F, new CubeDeformation(0.0F))
		.texOffs(57, 28).addBox(-9.1F, -1.95F, -0.3F, 0.6F, 0.1F, 2.4F, new CubeDeformation(0.0F))
		.texOffs(57, 24).addBox(-8.5F, -1.85F, -0.3F, 0.6F, 0.1F, 2.4F, new CubeDeformation(0.0F))
		.texOffs(57, 20).addBox(-7.9F, -1.95F, -0.3F, 0.6F, 0.1F, 2.4F, new CubeDeformation(0.0F))
		.texOffs(57, 16).addBox(-7.3F, -1.85F, -0.3F, 0.6F, 0.1F, 2.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2795F, -6.1556F, 7.773F, 0.3927F, 0.0F, 0.0F));

		PartDefinition group17 = armorHead.addOrReplaceChild("group17", CubeListBuilder.create().texOffs(54, 18).addBox(-1.4205F, -7.2056F, 6.773F, 0.6F, 0.1F, 2.8F, new CubeDeformation(0.0F))
		.texOffs(54, 54).addBox(-0.8206F, -7.3056F, 6.773F, 0.6F, 0.1F, 2.8F, new CubeDeformation(0.0F))
		.texOffs(35, 41).addBox(-0.2205F, -7.2056F, 6.773F, 0.6F, 0.1F, 2.8F, new CubeDeformation(0.0F))
		.texOffs(54, 45).addBox(0.3795F, -7.3056F, 6.773F, 0.6F, 0.1F, 2.8F, new CubeDeformation(0.0F))
		.texOffs(53, 55).addBox(0.9795F, -7.2056F, 6.773F, 0.6F, 0.1F, 2.8F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition group18 = armorHead.addOrReplaceChild("group18", CubeListBuilder.create().texOffs(54, 54).addBox(-2.0206F, -7.3056F, 6.773F, 0.6F, 0.1F, 2.8F, new CubeDeformation(0.0F))
		.texOffs(54, 54).addBox(1.5795F, -7.3056F, 6.773F, 0.6F, 0.1F, 2.8F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r36 = group18.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(57, 28).addBox(-6.7F, -1.95F, -0.3F, 0.6F, 0.1F, 2.4F, new CubeDeformation(0.0F))
		.texOffs(57, 28).addBox(-10.3F, -1.95F, -0.3F, 0.6F, 0.1F, 2.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2795F, -6.1556F, 7.773F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorBody = bipedBody.addOrReplaceChild("armorBody", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition armorRightArm = bipedRightArm.addOrReplaceChild("armorRightArm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition armorLeftArm = bipedLeftArm.addOrReplaceChild("armorLeftArm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition armorLeftLeg = bipedLeftLeg.addOrReplaceChild("armorLeftLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorLeftBoot = bipedLeftLeg.addOrReplaceChild("armorLeftBoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition armorRightLeg = bipedRightLeg.addOrReplaceChild("armorRightLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorRightBoot = bipedRightLeg.addOrReplaceChild("armorRightBoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(S state) {
        armorHead.visible = state.headEquipment.is(ItemInit.ELIXER_HAT);
	}
}   
