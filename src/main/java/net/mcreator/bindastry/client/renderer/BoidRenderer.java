
package net.mcreator.bindastry.client.renderer;

public class BoidRenderer extends MobRenderer<BoidEntity, Modelboid<BoidEntity>> {

	public BoidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboid(context.bakeLayer(Modelboid.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BoidEntity entity) {
		return new ResourceLocation("bindastry:textures/entities/boid_texture.png");
	}

}
