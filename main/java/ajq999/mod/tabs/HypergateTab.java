package ajq999.mod.tabs;

import ajq999.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HypergateTab extends CreativeTabs
{

	public HypergateTab(String label) {
		super("hypergatetab");
		this.setBackgroundImageName("hypergate.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.CARD_CIRCUIT_BASIC);
	}
	
}
