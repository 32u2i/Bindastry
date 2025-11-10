
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bindastry.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bindastry.client.model.Modelvoidarachna;
import net.mcreator.bindastry.client.model.Modelboid;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BindastryModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelvoidarachna.LAYER_LOCATION, Modelvoidarachna::createBodyLayer);
		event.registerLayerDefinition(Modelboid.LAYER_LOCATION, Modelboid::createBodyLayer);
	}
}
