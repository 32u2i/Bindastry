package net.mcreator.bindastry.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RadiationKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.GENERIC, 2);
	}
}
