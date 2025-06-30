package net.mcreator.onepiece.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.onepiece.network.OnePieceModVariables;
import net.mcreator.onepiece.client.model.Modelpistol_9;
import net.mcreator.onepiece.client.model.Modelpistol_8;
import net.mcreator.onepiece.client.model.Modelpistol_7;
import net.mcreator.onepiece.client.model.Modelpistol_6;
import net.mcreator.onepiece.client.model.Modelpistol_5;
import net.mcreator.onepiece.client.model.Modelpistol_4;
import net.mcreator.onepiece.client.model.Modelpistol_3;
import net.mcreator.onepiece.client.model.Modelpistol_2;
import net.mcreator.onepiece.client.model.Modelpistol_10;
import net.mcreator.onepiece.client.model.Modelpistol_1;
import net.mcreator.onepiece.client.model.Modelinflate;
import net.mcreator.onepiece.client.model.Modelgum_bazooka;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class GumGumRenderProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		if ((entity.getCapability(OnePieceModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OnePieceModVariables.PlayerVariables())).GumGumUser == true) {
			if (entity.getPersistentData().getBoolean("inflate") == true) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
						_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
					}
					Modelinflate newModel = new Modelinflate(context.bakeLayer(Modelinflate.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (entity.getPersistentData().getBoolean("bazooka") == true && entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 11);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 10);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
						_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
					}
					Modelgum_bazooka newModel = new Modelgum_bazooka(context.bakeLayer(Modelgum_bazooka.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
			if (entity.getPersistentData().getBoolean("pistol") == true) {
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 11);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (entity.getPersistentData().getDouble("pistol_timer") <= 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_1 newModel = new Modelpistol_1(context.bakeLayer(Modelpistol_1.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_2 newModel = new Modelpistol_2(context.bakeLayer(Modelpistol_2.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_3 newModel = new Modelpistol_3(context.bakeLayer(Modelpistol_3.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_4 newModel = new Modelpistol_4(context.bakeLayer(Modelpistol_4.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 6) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_5 newModel = new Modelpistol_5(context.bakeLayer(Modelpistol_5.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 7) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_6 newModel = new Modelpistol_6(context.bakeLayer(Modelpistol_6.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 8) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_7 newModel = new Modelpistol_7(context.bakeLayer(Modelpistol_7.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 9) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_8 newModel = new Modelpistol_8(context.bakeLayer(Modelpistol_8.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 10) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_9 newModel = new Modelpistol_9(context.bakeLayer(Modelpistol_9.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 11) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_10 newModel = new Modelpistol_10(context.bakeLayer(Modelpistol_10.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 13) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_8 newModel = new Modelpistol_8(context.bakeLayer(Modelpistol_8.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 14) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_6 newModel = new Modelpistol_6(context.bakeLayer(Modelpistol_6.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 15) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_4 newModel = new Modelpistol_4(context.bakeLayer(Modelpistol_4.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 16) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_2 newModel = new Modelpistol_2(context.bakeLayer(Modelpistol_2.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (entity.getPersistentData().getDouble("pistol_timer") <= 17) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("one_piece:textures/entities/steve.png") != null) {
							_texture = new ResourceLocation("one_piece:textures/entities/steve.png");
						}
						Modelpistol_1 newModel = new Modelpistol_1(context.bakeLayer(Modelpistol_1.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				}
			}
		}
	}
}
