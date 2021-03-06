package net.zestyblaze.dimores;

import net.fabricmc.api.ModInitializer;
import net.zestyblaze.dimores.registry.*;
import net.zestyblaze.dimores.world.OreGeneration;
import org.apache.logging.log4j.*;

public class DimOres implements ModInitializer {
	public static final String MOD_ID = "dimores";
	public static final String MODNAME = "DimensionalOres";
	public static final Logger LOGGER = LogManager.getLogger(MODNAME);

	@Override
	public void onInitialize() {
		LOGGER.info(MODNAME + " is installed correctly, loading now! Thanks for installing! <3");
		DimOreBlocks.registerBlocks();
		DimOreItems.registerItems();
		OreGeneration.generateOres();
	}
}
