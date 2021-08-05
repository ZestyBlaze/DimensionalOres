package net.zestyblaze.dimensionalores.setup;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
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

public class NetherOreGeneration {

    public static ConfiguredFeature<?, ?> NETHER_COAL_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NetherOres.NETHER_COAL.getDefaultState(),
                    18
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(127))
            ))
            .spreadHorizontally()
            .repeat(20);

    public static ConfiguredFeature<?, ?> NETHER_COPPER_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NetherOres.NETHER_COPPER.getDefaultState(),
                    16
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(96))
            ))
            .spreadHorizontally()
            .repeat(7);

    public static ConfiguredFeature<?, ?> NETHER_IRON_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NetherOres.NETHER_IRON.getDefaultState(),
                    12
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(63))
            ))
            .spreadHorizontally()
            .repeat(14);

    public static ConfiguredFeature<?, ?> NETHER_LAPIS_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NetherOres.NETHER_LAPIS.getDefaultState(),
                    5
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(30))
            ))
            .spreadHorizontally()
            .repeat(6);

    public static ConfiguredFeature<?, ?> NETHER_REDSTONE_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NetherOres.NETHER_REDSTONE.getDefaultState(),
                    10
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(1), YOffset.fixed(16))
            ))
            .spreadHorizontally()
            .repeat(8);

    public static ConfiguredFeature<?, ?> NETHER_DIAMOND_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NetherOres.NETHER_DIAMOND.getDefaultState(),
                    8
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(1), YOffset.fixed(16))
            ))
            .spreadHorizontally()
            .repeat(3);

    public static ConfiguredFeature<?, ?> NETHER_EMERALD_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NetherOres.NETHER_EMERALD.getDefaultState(),
                    3
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(4), YOffset.fixed(31))
            ))
            .spreadHorizontally()
            .repeat(10);


    public static void generateOres() {
        {
            RegistryKey<ConfiguredFeature<?, ?>> netherCoalOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "nether_coal_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherCoalOre.getValue(), NETHER_COAL_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherCoalOre);

            RegistryKey<ConfiguredFeature<?, ?>> netherIronOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "nether_iron_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherIronOre.getValue(), NETHER_IRON_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherIronOre);

            RegistryKey<ConfiguredFeature<?, ?>> netherCopperOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "nether_copper_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherCopperOre.getValue(), NETHER_COPPER_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherCopperOre);

            RegistryKey<ConfiguredFeature<?, ?>> netherLapisOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "nether_lapis_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherLapisOre.getValue(), NETHER_LAPIS_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherLapisOre);

            RegistryKey<ConfiguredFeature<?, ?>> netherRedstoneOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "nether_redstone_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherRedstoneOre.getValue(), NETHER_REDSTONE_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherRedstoneOre);

            RegistryKey<ConfiguredFeature<?, ?>> netherDiamondOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "nether_diamond_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherDiamondOre.getValue(), NETHER_DIAMOND_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherDiamondOre);

            RegistryKey<ConfiguredFeature<?, ?>> netherEmeraldOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimensionalOres.MOD_ID, "nether_emerald_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, netherEmeraldOre.getValue(), NETHER_EMERALD_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, netherEmeraldOre);
        }
    }
}
