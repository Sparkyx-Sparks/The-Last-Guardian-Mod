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
	public static final Block STONE_FLOOR_SLAB = new BlockBase("stone_floor_slab", Material.ROCK);
	public static final Block STONE_MOSS = new BlockBase("stone_moss", Material.ROCK);
	public static final Block ROCKS_MOSS = new BlockBase("rocks_moss", Material.ROCK);
	
	public static final Block UNSTABLE_STONE = new BlockBase("stone_unstable", Material.ROCK);

}