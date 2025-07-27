
package net.mcreator.bindastry.potion;

public class RadiationMobEffect extends MobEffect {

	public RadiationMobEffect() {
		super(MobEffectCategory.HARMFUL, -4194360);
	}

	@Override
	public String getDescriptionId() {
		return "effect.bindastry.radiation";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadiationKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		RadiationKoghdaEffiektZakanchivaietsiaProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
