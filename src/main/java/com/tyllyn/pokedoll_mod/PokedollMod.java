package com.tyllyn.pokedoll_mod;

import com.tyllyn.pokedoll_mod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokedollMod implements ModInitializer {

	public static final String MOD_ID = "pokedoll_mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//public static final Block EXAMPLE_BLOCK  = new Block(FabricBlockSettings.create().strength(4.0f));

	@Override
	public void onInitialize() {

		//ModBlocks.RegisterModBlocks();

		LOGGER.info("Initializing mod");

		ModBlocks.RegisterModBlocks();

	}
}