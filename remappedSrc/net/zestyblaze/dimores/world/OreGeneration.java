package net.zestyblaze.dimores.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.zestyblaze.dimores.DimOres;
import net.zestyblaze.dimores.registry.DimOreBlocks;

public class OreGeneration {

    private static final ConfiguredFeature<?, ?> OVERWORLD_QUARTZ_ORE = Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, DimOreBlocks.QUARTZ_ORE.getDefaultState(), 6));

    private static final PlacedFeature OVERWORLD_QUARTZ_ORE_PLACE = OVERWORLD_QUARTZ_ORE.withPlacement(CountPlacementModifier.of(4), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(22), YOffset.fixed(98)));

    public static void generateOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(DimOres.MOD_ID, "overworld_quartz_ore"), OVERWORLD_QUARTZ_ORE);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(DimOres.MOD_ID, "overworld_quartz_ore"), OVERWORLD_QUARTZ_ORE_PLACE);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(DimOres.MOD_ID, "overworld_quartz_ore")));
    }

}
