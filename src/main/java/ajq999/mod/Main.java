package ajq999.mod;

import ajq999.mod.proxy.CommonProxy;
import ajq999.mod.tabs.HypergateTab;
import ajq999.mod.util.Reference;
import ajq999.mod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class Main 
{
	public static final CreativeTabs hypergatetab = new HypergateTab("hypergatetab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void init(FMLInitializationEvent event){}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){}
}
