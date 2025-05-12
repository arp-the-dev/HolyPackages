package com.arp.holycube_packages;

import com.arp.holycube_packages.content.ModPackages;
import net.neoforged.bus.api.IEventBus;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(HolycubePackages.MOD_ID)
public class HolycubePackages {
    public static final String MOD_ID = "holycube_packages";

    public HolycubePackages(IEventBus modEventBus) {
        ModPackages.ITEMS.register(modEventBus);

        modEventBus.addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModPackages::registerPackageStyles);
    }
}