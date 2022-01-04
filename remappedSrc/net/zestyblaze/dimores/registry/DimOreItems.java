package net.zestyblaze.dimores.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.dimores.DimOres;

public class DimOreItems {

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "quartz_ore"), new BlockItem(DimOreBlocks.QUARTZ_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_coal"), new BlockItem(DimOreBlocks.NETHER_COAL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_copper"), new BlockItem(DimOreBlocks.NETHER_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_iron"), new BlockItem(DimOreBlocks.NETHER_IRON, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_lapis"), new BlockItem(DimOreBlocks.NETHER_LAPIS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_redstone"), new BlockItem(DimOreBlocks.NETHER_REDSTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_diamond"), new BlockItem(DimOreBlocks.NETHER_DIAMOND, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_emerald"), new BlockItem(DimOreBlocks.NETHER_EMERALD, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_coal"), new BlockItem(DimOreBlocks.END_COAL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_copper"), new BlockItem(DimOreBlocks.END_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_iron"), new BlockItem(DimOreBlocks.END_IRON, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_gold"), new BlockItem(DimOreBlocks.END_GOLD, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_lapis"), new BlockItem(DimOreBlocks.END_LAPIS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_redstone"), new BlockItem(DimOreBlocks.END_REDSTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_diamond"), new BlockItem(DimOreBlocks.END_DIAMOND, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_emerald"), new BlockItem(DimOreBlocks.END_EMERALD, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_quartz"), new BlockItem(DimOreBlocks.END_QUARTZ, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}
