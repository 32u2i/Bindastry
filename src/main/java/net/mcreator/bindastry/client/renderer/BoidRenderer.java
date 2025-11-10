
package net.mcreator.bindastry.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bindastry.entity.BoidEntity;
import net.mcreator.bindastry.client.model.Modelboid;

public class BoidRenderer extends MobRenderer<BoidEntity, Modelboid<BoidEntity>> {
	public BoidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboid(context.bakeLayer(Modelboid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoidEntity entity) {
		return new ResourceLocation("bindastry:textures/entities/boid_texture.png");
	}
}
