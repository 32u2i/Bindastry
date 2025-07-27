
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bindastry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.bindastry.block.PhotolithographBlock;
import net.mcreator.bindastry.block.DecorativelogBlock;
import net.mcreator.bindastry.BindastryMod;

public class BindastryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BindastryMod.MODID);
	public static final RegistryObject<Block> PHOTOLITHOGRAPH = REGISTRY.register("photolithograph", () -> new PhotolithographBlock());
	public static final RegistryObject<Block> DECORATIVELOG = REGISTRY.register("decorativelog", () -> new DecorativelogBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PhotolithographBlock.registerRenderLayer();
			DecorativelogBlock.registerRenderLayer();
		}
	}
}
