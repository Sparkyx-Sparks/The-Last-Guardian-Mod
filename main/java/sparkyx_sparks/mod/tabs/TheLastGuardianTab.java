package sparkyx_sparks.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import sparkyx_sparks.mod.init.ItemInit;

public class TheLastGuardianTab extends CreativeTabs{

	public TheLastGuardianTab(String label) {
		
		super(label);
		this.setBackgroundImageName("TheLastGuardianTab.png");
		
	}

	@Override
	public ItemStack getTabIconItem() {
	    
		return new ItemStack(ItemInit.TRICO_FEATHER);
		
	}
	
	

}
