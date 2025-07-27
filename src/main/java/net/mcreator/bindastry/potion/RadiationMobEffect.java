
package net.mcreator.bindastry.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.bindastry.procedures.RadiationKazhdyiTikVoVriemiaEffiektaProcedure;

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
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
