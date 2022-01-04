package net.zestyblaze.dimores.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.dimores.DimOres;

public class DimOreBlocks {

    public static final Block QUARTZ_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block NETHER_COAL = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_COPPER = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_IRON = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_LAPIS = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_REDSTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_DIAMOND = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block NETHER_EMERALD = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.NETHERRACK).requiresTool());
    public static final Block END_COAL = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_COPPER = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_IRON = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_GOLD = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_LAPIS = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_REDSTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_DIAMOND = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_EMERALD = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block END_QUARTZ = new Block(FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE).requiresTool());


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "quartz_ore"), QUARTZ_ORE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_coal"), NETHER_COAL);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_copper"), NETHER_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_iron"), NETHER_IRON);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_lapis"), NETHER_LAPIS);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_redstone"), NETHER_REDSTONE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_diamond"), NETHER_DIAMOND);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_emerald"), NETHER_EMERALD);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_coal"), END_COAL);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_copper"), END_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_iron"), END_IRON);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_gold"), END_GOLD);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_lapis"), END_LAPIS);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_redstone"), END_REDSTONE);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_diamond"), END_DIAMOND);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_emerald"), END_EMERALD);
        Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "end_quartz"), END_QUARTZ);
    }

}
