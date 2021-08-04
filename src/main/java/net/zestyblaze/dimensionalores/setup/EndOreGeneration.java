package net.zestyblaze.dimensionalores.setup;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

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
                    UniformHeightProvider.create(YOffset.fixed(1), YOffset.fixed(16))
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
                    UniformHeightProvider.create(YOffset.fixed(1), YOffset.fixed(16))
            ))
            .spreadHorizontally()
            .repeat(3);

    public static ConfiguredFeature<?, ?> END_EMERALD_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    EndOres.END_EMERALD.getDefaultState(),
                    2
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(4), YOffset.fixed(31))
            ))
            .spreadHorizontally()
            .repeat(10);
}
