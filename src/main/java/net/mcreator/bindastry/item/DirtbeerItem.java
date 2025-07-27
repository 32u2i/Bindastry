
package net.mcreator.bindastry.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class DirtbeerItem extends Item {

	public DirtbeerItem() {
		super(new Item.Properties().tab(BindastryModTabs.TAB_BINDUSTRY).stacksTo(1).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(-5).saturationMod(-3f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Blocks.DIRT);
		super.finishUsingItem(itemstack, world, entity);

		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}

}
