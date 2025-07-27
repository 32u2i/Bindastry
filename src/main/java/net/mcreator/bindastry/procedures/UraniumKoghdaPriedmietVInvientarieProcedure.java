package net.mcreator.bindastry.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bindastry.init.BindastryModMobEffects;

public class UraniumKoghdaPriedmietVInvientarieProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(BindastryModMobEffects.RADIATION.get(), 60, 1));
	}
}
