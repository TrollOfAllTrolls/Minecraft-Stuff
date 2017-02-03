package com.camp.item;

import com.camp.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SuperSword extends ItemSword {

	public SuperSword(ToolMaterial SuperSword) {
		super(SuperSword);
		this.setUnlocalizedName("Super Sword");
		this.setTextureName(Strings.MODID + ":" + "SuperSwordMaterial");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxDamage(19);
	}

}
