package com.integral.examplemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class ring extends Item {

    public ring() {
        this.setRegistryName("examplemod","ring");
        this.setTranslationKey("ring");
        this.setCreativeTab(CreativeTabs.FOOD);
    }
}
