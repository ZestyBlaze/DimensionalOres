package net.zestyblaze.dimores.setup;

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
import net.zestyblaze.dimores.DimOres;

public class OverworldOreGeneration {

    public static ConfiguredFeature<?, ?> OVERWORLD_QUARTZ_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    OverworldOres.QUARTZ_ORE.getDefaultState(),
                    7
            ))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(52))
            ))
            .spreadHorizontally()
            .repeat(12);

    public static void generateOres() {
        {
            RegistryKey<ConfiguredFeature<?, ?>> overworldQuartzOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(DimOres.MOD_ID, "overworld_quartz_ore"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, overworldQuartzOre.getValue(), OVERWORLD_QUARTZ_ORE);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, overworldQuartzOre);
        }
    }

}
