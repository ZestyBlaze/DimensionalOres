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

public class EndOres {
    public static final Block END_COAL = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 0)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_COPPER = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_IRON = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_GOLD = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_LAPIS = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_REDSTONE = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_DIAMOND = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_EMERALD = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static final Block END_QUARTZ = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 0)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );


    public static void registerBlocks() {
        {
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

    public static void registerBlockItems() {
        {
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_coal"), new BlockItem(END_COAL, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_copper"), new BlockItem(END_COPPER, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_iron"), new BlockItem(END_IRON, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_gold"), new BlockItem(END_GOLD, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_lapis"), new BlockItem(END_LAPIS, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_redstone"), new BlockItem(END_REDSTONE, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_diamond"), new BlockItem(END_DIAMOND, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_emerald"), new BlockItem(END_EMERALD, new FabricItemSettings().group(DimOres.MAIN_TAB)));
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_quartz"), new BlockItem(END_QUARTZ, new FabricItemSettings().group(DimOres.MAIN_TAB)));
        }
    }
}
