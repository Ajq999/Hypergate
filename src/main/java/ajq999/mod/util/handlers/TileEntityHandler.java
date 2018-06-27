package ajq999.mod.util.handlers;

import ajq999.mod.objects.blocks.machines.htfurnace.TileEntityHighTempFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityHighTempFurnace.class, "high_temp_furnace");
	}
}
