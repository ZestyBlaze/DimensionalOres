package net.zestyblaze.dimensionalores.setup;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

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

}