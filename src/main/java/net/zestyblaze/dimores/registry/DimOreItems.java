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
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_coal_ore"), new BlockItem(DimOreBlocks.NETHER_COAL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_copper_ore"), new BlockItem(DimOreBlocks.NETHER_COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_iron_ore"), new BlockItem(DimOreBlocks.NETHER_IRON_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_lapis_ore"), new BlockItem(DimOreBlocks.NETHER_LAPIS_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_redstone_ore"), new BlockItem(DimOreBlocks.NETHER_REDSTONE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_diamond_ore"), new BlockItem(DimOreBlocks.NETHER_DIAMOND_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "nether_emerald_ore"), new BlockItem(DimOreBlocks.NETHER_EMERALD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_coal_ore"), new BlockItem(DimOreBlocks.END_COAL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_copper_ore"), new BlockItem(DimOreBlocks.END_COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_iron_ore"), new BlockItem(DimOreBlocks.END_IRON_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_gold_ore"), new BlockItem(DimOreBlocks.END_GOLD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_lapis_ore"), new BlockItem(DimOreBlocks.END_LAPIS_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_redstone_ore"), new BlockItem(DimOreBlocks.END_REDSTONE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_diamond_ore"), new BlockItem(DimOreBlocks.END_DIAMOND_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_emerald_ore"), new BlockItem(DimOreBlocks.END_EMERALD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "end_quartz_ore"), new BlockItem(DimOreBlocks.END_QUARTZ_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
