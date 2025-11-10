
package net.mcreator.bindastry.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bindastry.procedures.UraniumKoghdaPriedmietVInvientarieProcedure;
import net.mcreator.bindastry.procedures.UraniumIghrokZakanchivaietIspolzovaniiePriedmietaProcedure;
import net.mcreator.bindastry.init.BindastryModTabs;

public class UraniumItem extends Item {
	public UraniumItem() {
		super(new Item.Properties().tab(BindastryModTabs.TAB_ORE_AND_METAL).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(177).saturationMod(177f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		UraniumIghrokZakanchivaietIspolzovaniiePriedmietaProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		UraniumKoghdaPriedmietVInvientarieProcedure.execute(entity);
	}
}
