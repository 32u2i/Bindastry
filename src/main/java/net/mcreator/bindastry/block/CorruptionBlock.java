
package net.mcreator.bindastry.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.bindastry.procedures.VoidDimPriObnovlieniiTaktovPortalaProcedure;
import net.mcreator.bindastry.init.BindastryModFluids;

public class CorruptionBlock extends LiquidBlock {
	public CorruptionBlock() {
		super(() -> (FlowingFluid) BindastryModFluids.CORRUPTION.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		VoidDimPriObnovlieniiTaktovPortalaProcedure.execute(entity);
	}
}
