package com.integral.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class item extends Item {
    public item() {
        this.setRegistryName("item");
        this.setCreativeTab(CreativeTabs.FOOD);
    }
}
