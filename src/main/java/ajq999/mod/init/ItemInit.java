package ajq999.mod.init;

import java.util.ArrayList;
import java.util.List;

import ajq999.mod.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item CARD_CIRCUIT_BASIC = new ItemBase("card_circuit_basic");
	public static final Item CARD_CIRCUIT_ADVANCED = new ItemBase("card_circuit_advanced");
	public static final Item REFINED_COAL = new ItemBase("refined_coal");
	public static final Item SUPERCONDUCTING_NUGGET = new ItemBase("superconducting_nugget");
}
