package net.mcreator.bindastry.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
