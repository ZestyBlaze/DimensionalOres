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

public class OverworldOres {

    public static final Block QUARTZ_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3, 3)
            .breakByTool(FabricToolTags.PICKAXES, 0)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
    );

    public static void registerBlocks() {
        {
            Registry.register(Registry.BLOCK, new Identifier(DimOres.MOD_ID, "quartz_ore"), QUARTZ_ORE);
        }
    }

    public static void registerBlockItems() {
        {
            Registry.register(Registry.ITEM, new Identifier(DimOres.MOD_ID, "quartz_ore"), new BlockItem(QUARTZ_ORE, new FabricItemSettings().group(DimOres.MAIN_TAB)));
        }
    }

}
