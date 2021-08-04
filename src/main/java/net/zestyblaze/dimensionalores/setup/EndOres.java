package net.zestyblaze.dimensionalores.setup;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

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
}
