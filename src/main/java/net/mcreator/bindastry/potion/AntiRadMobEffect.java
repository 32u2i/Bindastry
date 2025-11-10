
package net.mcreator.bindastry.potion;

public class AntiRadMobEffect extends MobEffect {

	public AntiRadMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.bindastry.anti_rad";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		AntiRadKoghdaEffiektNachatprimienienProcedure.execute(

		);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AntiRadKoghdaEffiektNachatprimienienProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
