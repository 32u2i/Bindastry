package net.mcreator.bindastry.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.bindastry.init.BindastryModMobEffects;

public class RadiationKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BindastryModMobEffects.ANTI_RAD.get()) : false)) {
			entity.hurt(DamageSource.GENERIC, 2);
		}
	}
}
