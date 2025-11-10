package net.mcreator.bindastry.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AntiRadKoghdaEffiektNachatprimienienProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(BindastryModMobEffects.RADIATION.get());
	}
}
