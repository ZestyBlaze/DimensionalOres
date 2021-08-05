package net.zestyblaze.dimensionalores.setup;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.zestyblaze.dimensionalores.DimensionalOres;

public class EndOreGeneration {
    public static ConfiguredFeature<?, ?> END_COAL_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_COAL.getDefaultState(),
                    18
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(127))
            ))
            .spreadHorizontally()
            .repeat(20);

    public static ConfiguredFeature<?, ?> END_COPPER_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_COPPER.getDefaultState(),
                    16
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(96))
            ))
            .spreadHorizontally()
            .repeat(7);

    public static ConfiguredFeature<?, ?> END_IRON_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_IRON.getDefaultState(),
                    12
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(63))
            ))
            .spreadHorizontally()
            .repeat(14);

    public static ConfiguredFeature<?, ?> END_LAPIS_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_LAPIS.getDefaultState(),
                    5
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(30))
            ))
            .spreadHorizontally()
            .repeat(6);

    public static ConfiguredFeature<?, ?> END_REDSTONE_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_REDSTONE.getDefaultState(),
                    8
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(1), YOffset.fixed(24))
            ))
            .spreadHorizontally()
            .repeat(8);

    public static ConfiguredFeature<?, ?> END_GOLD_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_GOLD.getDefaultState(),
                    13
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(32))
            ))
            .spreadHorizontally()
            .repeat(2);

    public static ConfiguredFeature<?, ?> END_DIAMOND_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_DIAMOND.getDefaultState(),
                    8
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(1), YOffset.fixed(24))
            ))
            .spreadHorizontally()
            .repeat(3);

    public static ConfiguredFeature<?, ?> END_EMERALD_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_EMERALD.getDefaultState(),
                    3
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(4), YOffset.fixed(31))
            ))
            .spreadHorizontally()
            .repeat(10);

    public static void generateOres() {
        {
            RegistryKey<ConfiguredFeature<?, ?>> endCoalOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_coal_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endCoalOre.getValue(), END_COAL_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endCoalOre);

            RegistryKey<ConfiguredFeature<?, ?>> endIronOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_iron_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endIronOre.getValue(), END_IRON_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endIronOre);

            RegistryKey<ConfiguredFeature<?, ?>> endCopperOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_copper_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endCopperOre.getValue(), END_COPPER_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endCopperOre);

            RegistryKey<ConfiguredFeature<?, ?>> endGoldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_gold_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endGoldOre.getValue(), END_GOLD_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endGoldOre);

            RegistryKey<ConfiguredFeature<?, ?>> endLapisOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_lapis_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endLapisOre.getValue(), END_LAPIS_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endLapisOre);

            RegistryKey<ConfiguredFeature<?, ?>> endRedstoneOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_redstone_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endRedstoneOre.getValue(), END_REDSTONE_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endRedstoneOre);

            RegistryKey<ConfiguredFeature<?, ?>> endDiamondOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_diamond_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endDiamondOre.getValue(), END_DIAMOND_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endDiamondOre);

            RegistryKey<ConfiguredFeature<?, ?>> endEmeraldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "end_emerald_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, endEmeraldOre.getValue(), END_EMERALD_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, endEmeraldOre);
        }
    }
}
