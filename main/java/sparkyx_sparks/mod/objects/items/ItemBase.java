package sparkyx_sparks.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sparkyx_sparks.mod.Main;
import sparkyx_sparks.mod.init.ItemInit;
import sparkyx_sparks.mod.proxy.ClientProxy;
import sparkyx_sparks.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}