package net.mcreator.bindastry.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bindastry.init.BindastryModMobEffects;

public class VoidDimPlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(BindastryModMobEffects.DECAY.get());
	}
}
