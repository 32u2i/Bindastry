
package net.mcreator.bindastry.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bindastry.entity.BoidEntity;
import net.mcreator.bindastry.client.model.ModelCustomModel;

public class BoidRenderer extends MobRenderer<BoidEntity, ModelCustomModel<BoidEntity>> {
	public BoidRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoidEntity entity) {
		return new ResourceLocation("bindastry:textures/entities/boid_texture.png");
	}
}
