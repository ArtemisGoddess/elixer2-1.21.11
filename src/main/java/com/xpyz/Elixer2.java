package com.xpyz;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xpyz.items.ItemInit;

public class Elixer2 implements ModInitializer {
	public static final String MOD_ID = "elixer2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		new ItemInit();

		ItemInit.registerModItems();
	}

	public static Identifier id(String path) { //IT DOES THIS FOR FREE???? FABRIC MODDING IN THE LATEST VERSION IS AWESOME LIFE IS BEAUTIFUL
		return Identifier.of(MOD_ID, path);
	}
}
