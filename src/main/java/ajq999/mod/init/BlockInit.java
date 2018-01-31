package ajq999.mod.init;

import java.util.ArrayList;
import java.util.List;

import ajq999.mod.objects.blocks.BlockLightningRod;
import net.minecraft.block.Block;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TESLA_COIL = new BlockLightningRod("tesla_coil");
}
