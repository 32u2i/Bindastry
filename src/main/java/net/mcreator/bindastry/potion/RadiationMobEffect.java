
package net.mcreator.bindastry.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.bindastry.procedures.RadiationKoghdaEffiektZakanchivaietsiaProcedure;
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
