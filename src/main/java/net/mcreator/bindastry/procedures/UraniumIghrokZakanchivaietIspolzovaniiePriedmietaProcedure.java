package net.mcreator.bindastry.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UraniumIghrokZakanchivaietIspolzovaniiePriedmietaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.GENERIC, 10000);
	}
}
