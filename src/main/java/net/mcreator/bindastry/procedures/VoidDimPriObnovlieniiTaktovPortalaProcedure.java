package net.mcreator.bindastry.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bindastry.init.BindastryModMobEffects;

public class VoidDimPriObnovlieniiTaktovPortalaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BindastryModMobEffects.DECAY.get()) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(BindastryModMobEffects.DECAY.get(), 30, 1));
		}
	}
}
