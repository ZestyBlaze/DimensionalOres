package net.zestyblaze.dimensionalores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import static net.zestyblaze.dimensionalores.setup.EndOres.END_COAL;
import static net.zestyblaze.dimensionalores.setup.EndOres.END_IRON;
import static net.zestyblaze.dimensionalores.setup.EndOres.END_COPPER;
import static net.zestyblaze.dimensionalores.setup.EndOres.END_LAPIS;
import static net.zestyblaze.dimensionalores.setup.EndOres.END_REDSTONE;
import static net.zestyblaze.dimensionalores.setup.EndOres.END_GOLD;
import static net.zestyblaze.dimensionalores.setup.EndOres.END_DIAMOND;
import static net.zestyblaze.dimensionalores.setup.EndOres.END_EMERALD;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_COAL;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_COPPER;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_IRON;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_LAPIS;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_REDSTONE;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_DIAMOND;
import static net.zestyblaze.dimensionalores.setup.NetherOres.NETHER_EMERALD;
import static net.zestyblaze.dimensionalores.setup.NetherOreGeneration.*;
import static net.zestyblaze.dimensionalores.setup.EndOreGeneration.*;

public class DimensionalOres implements ModInitializer {

	public static final ItemGroup MAIN_TAB = FabricItemGroupBuilder.build(
			new Identifier("dimensionalores", "main_tab"),
			() -> new ItemStack(NETHER_IRON));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "nether_coal"), NETHER_COAL);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "nether_coal"), new BlockItem(NETHER_COAL, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "nether_copper"), NETHER_COPPER);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "nether_copper"), new BlockItem(NETHER_COPPER, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "nether_iron"), NETHER_IRON);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "nether_iron"), new BlockItem(NETHER_IRON, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "nether_lapis"), NETHER_LAPIS);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "nether_lapis"), new BlockItem(NETHER_LAPIS, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "nether_redstone"), NETHER_REDSTONE);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "nether_redstone"), new BlockItem(NETHER_REDSTONE, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "nether_diamond"), NETHER_DIAMOND);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "nether_diamond"), new BlockItem(NETHER_DIAMOND, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "nether_emerald"), NETHER_EMERALD);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "nether_emerald"), new BlockItem(NETHER_EMERALD, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));



		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_coal"), END_COAL);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_coal"), new BlockItem(END_COAL, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_copper"), END_COPPER);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_copper"), new BlockItem(END_COPPER, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_iron"), END_IRON);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_iron"), new BlockItem(END_IRON, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_gold"), END_GOLD);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_gold"), new BlockItem(END_GOLD, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_lapis"), END_LAPIS);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_lapis"), new BlockItem(END_LAPIS, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_redstone"), END_REDSTONE);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_redstone"), new BlockItem(END_REDSTONE, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_diamond"), END_DIAMOND);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_diamond"), new BlockItem(END_DIAMOND, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));

		Registry.register(Registry.BLOCK, new Identifier("dimensionalores", "end_emerald"), END_EMERALD);
		Registry.register(Registry.ITEM, new Identifier("dimensionalores", "end_emerald"), new BlockItem(END_EMERALD, new FabricItemSettings().group(DimensionalOres.MAIN_TAB)));


		RegistryKey<ConfiguredFeature<?, ?>> netherCoalOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "nether_coal_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherCoalOre.getValue(), NETHER_COAL_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherCoalOre);

		RegistryKey<ConfiguredFeature<?, ?>> netherIronOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "nether_iron_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherIronOre.getValue(), NETHER_IRON_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherIronOre);

		RegistryKey<ConfiguredFeature<?, ?>> netherCopperOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "nether_copper_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherCopperOre.getValue(), NETHER_COPPER_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherCopperOre);

		RegistryKey<ConfiguredFeature<?, ?>> netherLapisOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "nether_lapis_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherLapisOre.getValue(), NETHER_LAPIS_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherLapisOre);

		RegistryKey<ConfiguredFeature<?, ?>> netherRedstoneOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "nether_redstone_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherRedstoneOre.getValue(), NETHER_REDSTONE_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherRedstoneOre);

		RegistryKey<ConfiguredFeature<?, ?>> netherDiamondOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "nether_diamond_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherDiamondOre.getValue(), NETHER_DIAMOND_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherDiamondOre);

		RegistryKey<ConfiguredFeature<?, ?>> netherEmeraldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "nether_emerald_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherEmeraldOre.getValue(), NETHER_EMERALD_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherEmeraldOre);

		RegistryKey<ConfiguredFeature<?, ?>> endCoalOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_coal_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endCoalOre.getValue(), END_COAL_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endCoalOre);

		RegistryKey<ConfiguredFeature<?, ?>> endIronOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_iron_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endIronOre.getValue(), END_IRON_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endIronOre);

		RegistryKey<ConfiguredFeature<?, ?>> endCopperOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_copper_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endCopperOre.getValue(), END_COPPER_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endCopperOre);

		RegistryKey<ConfiguredFeature<?, ?>> endGoldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_gold_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endGoldOre.getValue(), END_GOLD_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endGoldOre);

		RegistryKey<ConfiguredFeature<?, ?>> endLapisOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_lapis_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endLapisOre.getValue(), END_LAPIS_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endLapisOre);

		RegistryKey<ConfiguredFeature<?, ?>> endRedstoneOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_redstone_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endRedstoneOre.getValue(), END_REDSTONE_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endRedstoneOre);

		RegistryKey<ConfiguredFeature<?, ?>> endDiamondOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_diamond_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endDiamondOre.getValue(), END_DIAMOND_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endDiamondOre);

		RegistryKey<ConfiguredFeature<?, ?>> endEmeraldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("dimensionalores", "end_emerald_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endEmeraldOre.getValue(), END_EMERALD_ORE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endEmeraldOre);
	}
}
