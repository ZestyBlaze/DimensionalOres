package net.zestyblaze.dimores.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.dimores.DimOres;

public class DimOreBlocks {
    public static final Block QUARTZ_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool(), UniformIntProvider.create(2, 5));
    public static final Block NETHER_COAL_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool(), UniformIntProvider.create(2, 6));
    public static final Block NETHER_COPPER_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_LAPIS_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool(), UniformIntProvider.create(3, 6));
    public static final Block NETHER_REDSTONE_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool(), UniformIntProvider.create(3, 6));
    public static final Block NETHER_DIAMOND_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool(), UniformIntProvider.create(4, 8));
    public static final Block NETHER_EMERALD_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool(), UniformIntProvider.create(4, 9));
    public static final Block END_COAL_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool(), UniformIntProvider.create(3, 6));
    public static final Block END_COPPER_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_IRON_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_GOLD_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_LAPIS_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool(), UniformIntProvider.create(3, 7));
    public static final Block END_REDSTONE_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool(), UniformIntProvider.create(3, 7));
    public static final Block END_DIAMOND_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool(), UniformIntProvider.create(4, 9));
    public static final Block END_EMERALD_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool(), UniformIntProvider.create(5, 9));
    public static final Block END_QUARTZ_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool(), UniformIntProvider.create(3, 6));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "quartz_ore"), QUARTZ_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_coal_ore"), NETHER_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_copper_ore"), NETHER_COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_iron_ore"), NETHER_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_lapis_ore"), NETHER_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_redstone_ore"), NETHER_REDSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_diamond_ore"), NETHER_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_emerald_ore"), NETHER_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_coal_ore"), END_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_copper_ore"), END_COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_iron_ore"), END_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_gold_ore"), END_GOLD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_lapis_ore"), END_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_redstone_ore"), END_REDSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_diamond_ore"), END_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_emerald_ore"), END_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_quartz_ore"), END_QUARTZ_ORE);
    }

}
