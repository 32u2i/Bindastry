package net.mcreator.bindastry.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UraniumKoghdaPriedmietVInvientarieProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(BindastryModMobEffects.RADIATION.get(), 60, 1));
	}
}
