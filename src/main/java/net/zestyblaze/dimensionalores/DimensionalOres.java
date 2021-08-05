package net.zestyblaze.dimensionalores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zestyblaze.dimensionalores.setup.EndOreGeneration;
import net.zestyblaze.dimensionalores.setup.EndOres;
import net.zestyblaze.dimensionalores.setup.NetherOreGeneration;
import net.zestyblaze.dimensionalores.setup.NetherOres;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_IRON;

public class DimensionalOres implements ModInitializer {

	public static final String MOD_ID = "dimensionalores";
	public static final ItemGroup MAIN_TAB = FabricItemGroupBuilder.build(
			new Identifier("dimensionalores", "main_tab"),
			() -> new ItemStack(NETHER_IRON));

	@Override
	public void onInitialize() {
		NetherOres.registerBlocks();
		NetherOres.registerBlockItems();

		EndOres.registerBlocks();
		EndOres.registerBlockItems();

		NetherOreGeneration.generateOres();
		EndOreGeneration.generateOres();
	}
}
