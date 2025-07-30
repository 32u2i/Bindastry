
package net.mcreator.bindastry.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.bindastry.init.BindastryModFluids;

public class CorruptionBlock extends LiquidBlock {
	public CorruptionBlock() {
		super(() -> (FlowingFluid) BindastryModFluids.CORRUPTION.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)

		);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}
}
