
package net.mcreator.bindastry.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.bindastry.init.BindastryModItems;
import net.mcreator.bindastry.init.BindastryModFluids;
import net.mcreator.bindastry.init.BindastryModBlocks;

public abstract class CorruptionFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BindastryModFluids.CORRUPTION,
			BindastryModFluids.FLOWING_CORRUPTION,
			FluidAttributes
					.builder(new ResourceLocation("bindastry:blocks/corruptionstill"), new ResourceLocation("bindastry:blocks/corruptionstill"))

					.temperature(30000)

	).explosionResistance(100f)

			.bucket(BindastryModItems.CORRUPTION_BUCKET).block(() -> (LiquidBlock) BindastryModBlocks.CORRUPTION.get());

	private CorruptionFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ASH;
	}

	public static class Source extends CorruptionFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CorruptionFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
