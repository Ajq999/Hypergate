package ajq999.mod.objects.blocks.machines.htfurnace.slots;

import ajq999.mod.objects.blocks.machines.htfurnace.TileEntityHighTempFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotHighTempFurnaceFuel extends Slot
{
	public SlotHighTempFurnaceFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
		
	}
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityHighTempFurnace.isItemFuel(stack);
		
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}
