package sparkyx_sparks.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import sparkyx_sparks.mod.objects.blocks.BlockBase;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Blocks declaration:
	
	public static final Block TILES_STONE = new BlockBase("stone_tiles", Material.ROCK);
	public static final Block STRIPED_STONE = new BlockBase("stone_striped", Material.ROCK);

}