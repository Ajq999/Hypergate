package ajq999.mod.init;

import java.util.ArrayList;
import java.util.List;

import ajq999.mod.objects.blocks.BlockTeslaCoil;
import ajq999.mod.objects.blocks.machines.htfurnace.BlockHighTempFurnace;
import net.minecraft.block.Block;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TESLA_COIL = new BlockTeslaCoil("tesla_coil");
	public static final Block HIGH_TEMP_FURNACE = new BlockHighTempFurnace("high_temp_furnace");
}
