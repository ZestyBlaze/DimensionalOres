package net.zestyblaze.dimensionalores.setup;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

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
                    2
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(4), YOffset.fixed(31))
            ))
            .spreadHorizontally()
            .repeat(10);
}
