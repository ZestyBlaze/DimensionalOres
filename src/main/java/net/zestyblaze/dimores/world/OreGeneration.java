package net.zestyblaze.dimores.world;

import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;
import net.zestyblaze.dimores.DimOres;
import net.zestyblaze.dimores.registry.DimOreBlocks;

public class OreGeneration {
    private static final ConfiguredFeature<?, ?> OVERWORLD_QUARTZ_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, DimOreBlocks.QUARTZ_ORE.getDefaultState(), 6));
    private static final ConfiguredFeature<?, ?> NETHER_COAL_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, DimOreBlocks.NETHER_COAL_ORE.getDefaultState(), 12));
    private static final ConfiguredFeature<?, ?> NETHER_COPPER_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, DimOreBlocks.NETHER_COPPER_ORE.getDefaultState(), 7));
    private static final ConfiguredFeature<?, ?> NETHER_IRON_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, DimOreBlocks.NETHER_IRON_ORE.getDefaultState(), 8));
    private static final ConfiguredFeature<?, ?> NETHER_LAPIS_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, DimOreBlocks.NETHER_LAPIS_ORE.getDefaultState(), 10));
    private static final ConfiguredFeature<?, ?> NETHER_REDSTONE_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, DimOreBlocks.NETHER_REDSTONE_ORE.getDefaultState(), 11));
    private static final ConfiguredFeature<?, ?> NETHER_DIAMOND_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, DimOreBlocks.NETHER_DIAMOND_ORE.getDefaultState(), 8));
    private static final ConfiguredFeature<?, ?> NETHER_EMERALD_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.NETHERRACK, DimOreBlocks.NETHER_EMERALD_ORE.getDefaultState(), 2));
    private static final ConfiguredFeature<?, ?> END_COAL_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_COAL_ORE.getDefaultState(), 14));
    private static final ConfiguredFeature<?, ?> END_COPPER_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_COPPER_ORE.getDefaultState(), 8));
    private static final ConfiguredFeature<?, ?> END_IRON_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_IRON_ORE.getDefaultState(), 10));
    private static final ConfiguredFeature<?, ?> END_LAPIS_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_LAPIS_ORE.getDefaultState(), 12));
    private static final ConfiguredFeature<?, ?> END_REDSTONE_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_REDSTONE_ORE.getDefaultState(), 13));
    private static final ConfiguredFeature<?, ?> END_DIAMOND_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_DIAMOND_ORE.getDefaultState(), 10));
    private static final ConfiguredFeature<?, ?> END_EMERALD_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_EMERALD_ORE.getDefaultState(), 4));
    private static final ConfiguredFeature<?, ?> END_QUARTZ_ORE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), DimOreBlocks.END_QUARTZ_ORE.getDefaultState(), 12));

    private static final PlacedFeature OVERWORLD_QUARTZ_ORE_PLACE = OVERWORLD_QUARTZ_ORE.withPlacement(CountPlacementModifier.of(4), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(11), YOffset.fixed(98)));
    private static final PlacedFeature NETHER_COAL_ORE_PLACE = NETHER_COAL_ORE.withPlacement(CountPlacementModifier.of(20), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(112)));
    private static final PlacedFeature NETHER_COPPER_ORE_PLACE = NETHER_COPPER_ORE.withPlacement(CountPlacementModifier.of(4), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)));
    private static final PlacedFeature NETHER_IRON_ORE_PLACE = NETHER_IRON_ORE.withPlacement(CountPlacementModifier.of(26), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(78)));
    private static final PlacedFeature NETHER_LAPIS_ORE_PLACE = NETHER_LAPIS_ORE.withPlacement(CountPlacementModifier.of(6), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)));
    private static final PlacedFeature NETHER_REDSTONE_ORE_PLACE = NETHER_REDSTONE_ORE.withPlacement(CountPlacementModifier.of(10), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(48)));
    private static final PlacedFeature NETHER_DIAMOND_ORE_PLACE = NETHER_DIAMOND_ORE.withPlacement(CountPlacementModifier.of(8), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(36)));
    private static final PlacedFeature NETHER_EMERALD_ORE_PLACE = NETHER_EMERALD_ORE.withPlacement(CountPlacementModifier.of(15), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(28)));
    private static final PlacedFeature END_COAL_ORE_PLACE = END_COAL_ORE.withPlacement(CountPlacementModifier.of(22), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(112)));
    private static final PlacedFeature END_COPPER_ORE_PLACE = END_COPPER_ORE.withPlacement(CountPlacementModifier.of(6), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)));
    private static final PlacedFeature END_IRON_ORE_PLACE = END_IRON_ORE.withPlacement(CountPlacementModifier.of(28), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(78)));
    private static final PlacedFeature END_LAPIS_ORE_PLACE = END_LAPIS_ORE.withPlacement(CountPlacementModifier.of(8), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)));
    private static final PlacedFeature END_REDSTONE_ORE_PLACE = END_REDSTONE_ORE.withPlacement(CountPlacementModifier.of(12), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(48)));
    private static final PlacedFeature END_DIAMOND_ORE_PLACE = END_DIAMOND_ORE.withPlacement(CountPlacementModifier.of(10), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(36)));
    private static final PlacedFeature END_EMERALD_ORE_PLACE = END_EMERALD_ORE.withPlacement(CountPlacementModifier.of(17), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(28)));
    private static final PlacedFeature END_QUARTZ_ORE_PLACE = END_QUARTZ_ORE.withPlacement(CountPlacementModifier.of(8), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)));

    public static void generateOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "overworld_quartz_ore"), OVERWORLD_QUARTZ_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_coal_ore"), NETHER_COAL_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_copper_ore"), NETHER_COPPER_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_iron_ore"), NETHER_IRON_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_lapis_ore"), NETHER_LAPIS_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_redstone_ore"), NETHER_REDSTONE_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_diamond_ore"), NETHER_DIAMOND_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_emerald_ore"), NETHER_EMERALD_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_coal_ore"), END_COAL_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_copper_ore"), END_COPPER_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_iron_ore"), END_IRON_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_lapis_ore"), END_LAPIS_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_redstone_ore"), END_REDSTONE_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_diamond_ore"), END_DIAMOND_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_emerald_ore"), END_EMERALD_ORE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "end_quartz_ore"), END_QUARTZ_ORE);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "overworld_quartz_ore"), OVERWORLD_QUARTZ_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_coal_ore"), NETHER_COAL_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_copper_ore"), NETHER_COPPER_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_iron_ore"), NETHER_IRON_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_lapis_ore"), NETHER_LAPIS_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_redstone_ore"), NETHER_REDSTONE_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_diamond_ore"), NETHER_DIAMOND_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "nether_emerald_ore"), NETHER_EMERALD_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_coal_ore"), END_COAL_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_copper_ore"), END_COPPER_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_iron_ore"), END_IRON_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_lapis_ore"), END_LAPIS_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_redstone_ore"), END_REDSTONE_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_diamond_ore"), END_DIAMOND_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_emerald_ore"), END_EMERALD_ORE_PLACE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "end_quartz_ore"), END_QUARTZ_ORE_PLACE);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "overworld_quartz_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "nether_coal_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "nether_copper_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "nether_iron_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "nether_lapis_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "nether_redstone_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "nether_diamond_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "nether_emerald_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_coal_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_copper_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_iron_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_lapis_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_redstone_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_diamond_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_emerald_ore")));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "end_quartz_ore")));
    }

}
