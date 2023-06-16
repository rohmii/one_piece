
package net.mcreator.onepiece.item;

import software.bernie.geckolib3.core.builder.ILoopType.EDefaultLoopTypes;

import javax.annotation.Nullable;

import net.minecraft.sounds.SoundEvent;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public class PortgasDAceHatItem extends GeoArmorItem implements IAnimatable {
	private AnimationFactory factory = GeckoLibUtil.createFactory(this);
	public String animationprocedure = "empty";

	public PortgasDAceHatItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{0, 0, 0, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "portgas_d_ace_hat";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
	}

	@SuppressWarnings("unused")
	private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
		List<EquipmentSlot> slotData = event.getExtraDataOfType(EquipmentSlot.class);
		List<ItemStack> stackData = event.getExtraDataOfType(ItemStack.class);
		LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);
		if (this.animationprocedure.equals("empty")) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("PortgasDAce_Hat.animation", EDefaultLoopTypes.LOOP));

			if (livingEntity instanceof ArmorStand) {
				return PlayState.CONTINUE;
			}

			List<Item> armorList = new ArrayList<>(4);
			for (EquipmentSlot slot : EquipmentSlot.values()) {
				if (slot.getType() == EquipmentSlot.Type.ARMOR) {
					if (livingEntity.getItemBySlot(slot) != null) {
						armorList.add(livingEntity.getItemBySlot(slot).getItem());
					}
				}
			}

			boolean isWearingAll = armorList.containsAll(Arrays.asList(

			));

			return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;
		}
		return PlayState.STOP;
	}

	@SuppressWarnings("unused")
	private <P extends IAnimatable> PlayState procedurePredicate(AnimationEvent<P> event) {
		List<EquipmentSlot> slotData = event.getExtraDataOfType(EquipmentSlot.class);
		List<ItemStack> stackData = event.getExtraDataOfType(ItemStack.class);
		LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);
		if (!this.animationprocedure.equals("empty") && event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation(this.animationprocedure, EDefaultLoopTypes.PLAY_ONCE));
			if (event.getController().getAnimationState().equals(software.bernie.geckolib3.core.AnimationState.Stopped)) {
				this.animationprocedure = "empty";
				event.getController().markNeedsReload();
			}

			if (livingEntity instanceof ArmorStand) {
				return PlayState.CONTINUE;
			}

			List<Item> armorList = new ArrayList<>(4);
			for (EquipmentSlot slot : EquipmentSlot.values()) {
				if (slot.getType() == EquipmentSlot.Type.ARMOR) {
					if (livingEntity.getItemBySlot(slot) != null) {
						armorList.add(livingEntity.getItemBySlot(slot).getItem());
					}
				}
			}

			boolean isWearingAll = armorList.containsAll(Arrays.asList(

			));

			return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;
		}
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController(this, "controller", 5, this::predicate));
		data.addAnimationController(new AnimationController(this, "procedureController", 5, this::procedurePredicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}

}
