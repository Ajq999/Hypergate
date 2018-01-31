package ajq999.mod.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockLightningRod extends BlockBase
{
	public static final AxisAlignedBB TESLA_COIL_AABB = new AxisAlignedBB(0D, 0, 0D, 0D, 0, 0D);
	
	public BlockLightningRod(String name) 
	{
		super(name, Material.IRON);
	}	
		
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return true;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return TESLA_COIL_AABB;
		
	}
}
