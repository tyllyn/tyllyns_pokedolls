package com.tyllyn.pokedoll_mod.block.pokedolls;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class Tepig extends Block {

	public Tepig(Settings settings) {
		super(settings);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
		VoxelShape shape = VoxelShapes.empty();
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.35, 0.09375, 0.3, 0.65, 0.35625, 0.675));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5, 0.19992875, 0.626634375, 0.5, 0.34992875, 0.814134375));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.425, 0.23742874999999997, 0.814134375, 0.575, 0.38742875, 0.964134375));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.33125, 0.275, 0.1875, 0.66875, 0.575, 0.45));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.424625, 0.312125, 0.074625, 0.575375, 0.425375, 0.187875));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.259375, 0.5125, 0.290625, 0.259375, 0.8125, 0.440625));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.740625, 0.5125, 0.290625, 0.740625, 0.8125, 0.440625));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.330875, 0.369125, 0.187125, 0.405875, 0.519125, 0.299625));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.33425, 0.36875, 0.1905, 0.41, 0.5195, 0.30375));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.594125, 0.369125, 0.187125, 0.669125, 0.519125, 0.299625));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.59, 0.36875, 0.1905, 0.66575, 0.5195, 0.30375));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.546875, -0.025, 0.33125, 0.659375, 0.1625, 0.44375));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.340625, -0.025, 0.33125, 0.453125, 0.1625, 0.44375));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.546875, 0, 0.5, 0.659375, 0.11249999999999999, 0.6875));
		shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.340625, 0, 0.5, 0.453125, 0.11249999999999999, 0.6875));

		return shape;
	}
}