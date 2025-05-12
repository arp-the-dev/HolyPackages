package com.arp.holycube_packages.content;

import com.arp.holycube_packages.HolycubePackages;
import com.simibubi.create.content.logistics.box.PackageItem;
import com.simibubi.create.content.logistics.box.PackageStyles;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModPackages {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, HolycubePackages.MOD_ID);

    private static final List<Supplier<PackageItem>> REGISTERED_PACKAGES = new ArrayList<>();


    public static final Supplier<PackageItem> RARE_MLDEG_PACKAGE = registerPackage("rare_mldeg_package", "rare_mldeg");
    public static final Supplier<PackageItem> RARE_SMITTIES_PACKAGE = registerPackage("rare_smitties_package", "rare_smitties");


    private static Supplier<PackageItem> registerPackage(String id, String styleId) {
        Supplier<PackageItem> supplier = ITEMS.register(id, () ->
                new PackageItem(
                        new Item.Properties(),
                        new PackageStyles.PackageStyle(styleId, 12, 10, 21f, true)
                )
        );
        REGISTERED_PACKAGES.add(supplier);
        return supplier;
    }

    public static void registerPackageStyles() {
        for (Supplier<PackageItem> s : REGISTERED_PACKAGES) {
            PackageItem item = s.get();
            PackageStyles.ALL_BOXES.add(item);
            PackageStyles.RARE_BOXES.add(item);
        }
    }
}
