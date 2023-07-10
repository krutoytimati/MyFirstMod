package com.integral.examplemod;

import com.integral.examplemod.items.ring;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import com.integral.examplemod.lib.LibMisc;

@Mod.EventBusSubscriber(modid = LibMisc.MOD_ID)
public final class registry {
    public static final Item ring = new ring();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> evt) {
        IForgeRegistry<Item> r = evt.getRegistry();

        r.register(ring);
    }
}