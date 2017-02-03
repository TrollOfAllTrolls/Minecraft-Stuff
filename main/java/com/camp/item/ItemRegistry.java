package com.camp.item;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry {

	static SuperSword aSword;

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}

	static ArrayList<Item> itemList;

	public static void initializeItem() {
		itemList = ItemMaker.itemListMaker();
		aSword = new SuperSword(ToolMaterial.STONE);
	}

	public static void registerItem() {
		for (Item each : itemList)
			GameRegistry.registerItem(each, each.getUnlocalizedName());
		GameRegistry.registerItem(aSword, aSword.getUnlocalizedName());
	}
}
