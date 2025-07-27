
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bindastry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bindastry.item.BlackmicrocircuitsItem;
import net.mcreator.bindastry.BindastryMod;

public class BindastryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BindastryMod.MODID);
	public static final RegistryObject<Item> BLACKMICROCIRCUITS = REGISTRY.register("blackmicrocircuits", () -> new BlackmicrocircuitsItem());
}
