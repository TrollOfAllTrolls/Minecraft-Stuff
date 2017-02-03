package com.camp.block;

import com.camp.lib.Strings;

import javafx.scene.control.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SuperStone extends Block {

	protected SuperStone(Material SuperStoneMaterial) {
		super(SuperStoneMaterial);
		this.setBlockName("Super Stone");
		this.setBlockTextureName(Strings.MODID + ":" + "SuperStoneMaterial");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
