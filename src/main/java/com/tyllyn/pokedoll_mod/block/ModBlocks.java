package com.tyllyn.pokedoll_mod.block;

import com.tyllyn.pokedoll_mod.PokedollMod;
import com.tyllyn.pokedoll_mod.block.pokedolls.Tepig;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

// Ref: https://www.youtube.com/watch?v=5VEh1dDngd8&ab_channel=ModdingbyKaupenjoe

public class ModBlocks {

    //public static final Block POKEDOLL_TEPIG_BLOCK =

    public static Block BASE_BLOCK = new Block(GetBlockSettings());
    //public static Block BASE_BLOCK = new Tepig(GetBlockSettings());
    public static String NAMESPACE = "pokedoll_mod";
    public static String BLOCK_NAME_PREFIX = "pokedoll_";

    public static FabricBlockSettings GetBlockSettings() {
        return FabricBlockSettings
                .copyOf(Blocks.GLASS)
                .sounds(BlockSoundGroup.GRASS)
                .noBlockBreakParticles();
    }

    public static Block GetBaseBlock(String name) {

        PokedollMod.LOGGER.info("Looking up base block for " + name);

        switch (name) {
            case "Tepig":
                return Tepig.GetInstance(GetBlockSettings());
            default:
                return BASE_BLOCK;
        }

//        Tepig tepig = new Tepig(FabricBlockSettings.copyOf(Blocks.GLASS));
//        return (Block) tepig;

//        FabricBlockSettings settings = FabricBlockSettings.copyOf(BASE_BLOCK);
//        Block tepig = new Tepig(settings);
//        return tepig;

//        try {
//            Class<?> blockClass = Class.forName("com.tyllyn.pokedoll_mod.block.pokedolls." + name);
//            Block inst = (Block) blockClass.getDeclaredConstructor().newInstance(FabricBlockSettings.copyOf(Blocks.GLASS));
//            PokedollMod.LOGGER.info("Block instance found!");
//
//            //Block tepig = new Tepig(FabricBlockSettings.copyOf(Blocks.GLASS));
//
//            return inst;
//        } catch (Exception e) {
//            PokedollMod.LOGGER.info("Block instance not found. Using " + BASE_BLOCK.getName());
//            return BASE_BLOCK;
//        }
    }

    private static void RegisterBlockItem(String name) {

        PokedollMod.LOGGER.info("Registering block-item for " + name + "...");

        Registry.register(
                Registries.ITEM,
                new Identifier(
                        NAMESPACE,
                        BLOCK_NAME_PREFIX + name.toLowerCase()
                ),
                new BlockItem(
                        GetBaseBlock(name),
                        new FabricItemSettings()
                )
        );

        PokedollMod.LOGGER.info("Block-Item registered!");

    }

    private static void RegisterBlock(String name) {

        PokedollMod.LOGGER.info("Register block for " + name + "...");

        Registry.register(
                Registries.BLOCK,
                new Identifier(
                        NAMESPACE,
                        BLOCK_NAME_PREFIX + name.toLowerCase()
                ),
                ModBlocks.GetBaseBlock(name)
        );

        PokedollMod.LOGGER.info("Block registered!");

        RegisterBlockItem(name);

    }

    public static void RegisterModBlocks() {
        PokedollMod.LOGGER.info("Registering ModBlocks for " + PokedollMod.MOD_ID);
        RegisterBlock("Tepig");
        RegisterBlock("Snivy");
    }

}
