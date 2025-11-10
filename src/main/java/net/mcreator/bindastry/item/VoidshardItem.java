
package net.mcreator.bindastry.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class VoidshardItem extends Item {

	public VoidshardItem() {
		super(new Item.Properties().tab(BindastryModTabs.TAB_DELETED_MOD_ELEMENT).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

}
