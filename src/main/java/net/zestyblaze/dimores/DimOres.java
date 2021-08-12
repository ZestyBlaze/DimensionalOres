package net.zestyblaze.dimores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zestyblaze.dimores.setup.*;

import static net.zestyblaze.dimores.setup.NetherOres.NETHER_IRON;

public class DimOres implements ModInitializer {

	public static final String MOD_ID = "dimores";
	public static final ItemGroup MAIN_TAB = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "main_tab"),
			() -> new ItemStack(NETHER_IRON));

	@Override
	public void onInitialize() {
		OverworldOres.registerBlocks();
		OverworldOres.registerBlockItems();

		NetherOres.registerBlocks();
		NetherOres.registerBlockItems();

		EndOres.registerBlocks();
		EndOres.registerBlockItems();

		OverworldOreGeneration.generateOres();
		NetherOreGeneration.generateOres();
		EndOreGeneration.generateOres();
	}
}
