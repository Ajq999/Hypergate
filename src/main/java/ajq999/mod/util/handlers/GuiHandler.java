package ajq999.mod.util.handlers;

import ajq999.mod.objects.blocks.machines.htfurnace.ContainerHighTempFurnace;
import ajq999.mod.objects.blocks.machines.htfurnace.GuiHighTempFurnace;
import ajq999.mod.objects.blocks.machines.htfurnace.TileEntityHighTempFurnace;
import ajq999.mod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID,EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_HIGH_TEMP_FURNACE) return new ContainerHighTempFurnace(player.inventory, (TileEntityHighTempFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_HIGH_TEMP_FURNACE) return new GuiHighTempFurnace(player.inventory, (TileEntityHighTempFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
}
