package com.arp.holycube_packages.content;

import com.arp.holycube_packages.HolycubePackages;
import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.logistics.box.PackageStyles;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.minecraft.resources.ResourceLocation;

public class ModPartialModels {

    public static void register(){
        ModPackages.PACKAGE_STYLES.forEach(ModPartialModels::registerPackageStyle);
    }

    private static void registerPackageStyle(PackageStyles.PackageStyle style){
        ResourceLocation key = ResourceLocation.fromNamespaceAndPath(HolycubePackages.MOD_ID,style.getItemId().getPath());
        PartialModel model = PartialModel.of(ResourceLocation.fromNamespaceAndPath(HolycubePackages.MOD_ID,"item/" + key.getPath()));
        AllPartialModels.PACKAGES.put(key, model);
        if (!style.rare())
            AllPartialModels.PACKAGES_TO_HIDE_AS.add(model);
        AllPartialModels.PACKAGE_RIGGING.put(key, PartialModel.of(style.getRiggingModel()));
    }


}
