
package net.mcreator.onepiece.item;

public class IronKatanaItem extends SwordItem {
	public IronKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 312;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -2f, new Item.Properties());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		IronKatanaRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}
