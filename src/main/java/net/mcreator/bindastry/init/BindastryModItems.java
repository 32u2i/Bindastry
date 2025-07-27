
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bindastry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bindastry.item.UraniumItem;
import net.mcreator.bindastry.item.UraniumBatteryItem;
import net.mcreator.bindastry.item.SemiconductorPTypeItem;
import net.mcreator.bindastry.item.SemiconductorNTypeItem;
import net.mcreator.bindastry.item.SemiconductorConverterItem;
import net.mcreator.bindastry.item.LeadPlateItem;
import net.mcreator.bindastry.item.LeadItem;
import net.mcreator.bindastry.item.LaserFocusItem;
import net.mcreator.bindastry.item.LaserCutterItem;
import net.mcreator.bindastry.item.IronPlateItem;
import net.mcreator.bindastry.item.IronHammerItem;
import net.mcreator.bindastry.item.DirtbeerItem;
import net.mcreator.bindastry.item.BlackmicrocircuitsItem;
import net.mcreator.bindastry.BindastryMod;

public class BindastryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BindastryMod.MODID);
	public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new IronHammerItem());
	public static final RegistryObject<Item> BLACKMICROCIRCUITS = REGISTRY.register("blackmicrocircuits", () -> new BlackmicrocircuitsItem());
	public static final RegistryObject<Item> DIRTBEER = REGISTRY.register("dirtbeer", () -> new DirtbeerItem());
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> LASER_FOCUS = REGISTRY.register("laser_focus", () -> new LaserFocusItem());
	public static final RegistryObject<Item> IRON_PLATE = REGISTRY.register("iron_plate", () -> new IronPlateItem());
	public static final RegistryObject<Item> URANIUM_BATTERY = REGISTRY.register("uranium_battery", () -> new UraniumBatteryItem());
	public static final RegistryObject<Item> SEMICONDUCTOR_N_TYPE = REGISTRY.register("semiconductor_n_type", () -> new SemiconductorNTypeItem());
	public static final RegistryObject<Item> SEMICONDUCTOR_P_TYPE = REGISTRY.register("semiconductor_p_type", () -> new SemiconductorPTypeItem());
	public static final RegistryObject<Item> SEMICONDUCTOR_CONVERTER = REGISTRY.register("semiconductor_converter",
			() -> new SemiconductorConverterItem());
	public static final RegistryObject<Item> LEAD = REGISTRY.register("lead", () -> new LeadItem());
	public static final RegistryObject<Item> LEAD_PLATE = REGISTRY.register("lead_plate", () -> new LeadPlateItem());
	public static final RegistryObject<Item> LASER_CUTTER = REGISTRY.register("laser_cutter", () -> new LaserCutterItem());
}
