package net.blcktrunks.tutorialmod.block;

import net.blcktrunks.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
  public static final Block RUBY_BLOCK = registerBlock("ruby_block",
      new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
  public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
      new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));


  private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
  }

  private static Item registerBlockItem(String name, Block block) {
    return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
  }

  public static void registerModBlocks() {
    TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);
  }
}
