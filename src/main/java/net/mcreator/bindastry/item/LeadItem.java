
package net.mcreator.bindastry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.bindastry.init.BindastryModTabs;

public class LeadItem extends Item {
	public LeadItem() {
		super(new Item.Properties().tab(BindastryModTabs.TAB_ORE_AND_METAL).stacksTo(64).rarity(Rarity.COMMON));
	}
}
