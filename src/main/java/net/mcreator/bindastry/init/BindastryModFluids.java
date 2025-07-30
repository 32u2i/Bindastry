
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bindastry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.bindastry.fluid.CorruptionFluid;
import net.mcreator.bindastry.BindastryMod;

public class BindastryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BindastryMod.MODID);
	public static final RegistryObject<Fluid> CORRUPTION = REGISTRY.register("corruption", () -> new CorruptionFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CORRUPTION = REGISTRY.register("flowing_corruption", () -> new CorruptionFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CORRUPTION.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CORRUPTION.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
