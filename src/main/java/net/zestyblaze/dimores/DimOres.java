package net.zestyblaze.dimores;

import net.fabricmc.api.ModInitializer;
import net.zestyblaze.dimores.registry.*;
import net.zestyblaze.dimores.world.OreGeneration;
import org.apache.logging.log4j.*;

public class DimOres implements ModInitializer {
	public static final String MOD_ID = "dimores";

	@Override
	public void onInitialize() {
		DimOreBlocks.registerBlocks();
		DimOreItems.registerItems();
		OreGeneration.generateOres();
	}
}
