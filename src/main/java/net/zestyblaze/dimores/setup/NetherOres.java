package net.zestyblaze.dimores.setup;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.dimores.DimOres;

public class NetherOres {
    public static final Block NETHER_COAL = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 0)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()
    );

    public static final Block NETHER_COPPER = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()
    );

    public static final Block NETHER_IRON = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()
    );

    public static final Block NETHER_LAPIS = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()
    );

    public static Block NETHER_REDSTONE = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()
    );

    public static final Block NETHER_DIAMOND = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()
    );

    public static final Block NETHER_EMERALD = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.NETHERRACK)
            .requiresTool()
    );

    public static void registerBlocks() {
        {
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_coal"), NETHER_COAL);
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_copper"), NETHER_COPPER);
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_iron"), NETHER_IRON);
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_lapis"), NETHER_LAPIS);
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_redstone"), NETHER_REDSTONE);
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_diamond"), NETHER_DIAMOND);
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "nether_emerald"), NETHER_EMERALD);
        }
    }

    public static void registerBlockItems() {
        {
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_coal"), new BlockItem(NETHER_COAL, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_copper"), new BlockItem(NETHER_COPPER, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_iron"), new BlockItem(NETHER_IRON, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_lapis"), new BlockItem(NETHER_LAPIS, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_redstone"), new BlockItem(NETHER_REDSTONE, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_diamond"), new BlockItem(NETHER_DIAMOND, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_emerald"), new BlockItem(NETHER_EMERALD, new FabricItemSettings().group(DimOres.MAIN_TAB)));
        }
    }

}