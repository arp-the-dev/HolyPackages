package com.arp.holycube_packages.content;

import com.arp.holycube_packages.HolycubePackages;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.logistics.box.PackageItem;
import com.simibubi.create.content.logistics.box.PackageStyles;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModPackages {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, HolycubePackages.MOD_ID);

    public static final List<PackageStyles.PackageStyle> PACKAGE_STYLES = new ArrayList<>();
    private static final List<Supplier<PackageItem>> PACKAGE_ITEMS = new ArrayList<>();


    public static final PackageStyles.PackageStyle RARE_MLDEG_PACKAGE = registerPackage("rare_mldeg");
    public static final PackageStyles.PackageStyle RARE_SMITTIES_PACKAGE = registerPackage("rare_smitties");


    private static PackageStyles.PackageStyle registerPackage(String styleId) {
        PackageStyles.PackageStyle style = new PackageStyles.PackageStyle(styleId,12,10,21f,true);
        Supplier<PackageItem> supplier = ITEMS.register(style.getItemId().getPath(), () ->
                new PackageItem(new Item.Properties(), style)
        );
        PACKAGE_STYLES.add(style);
        PACKAGE_ITEMS.add(supplier);
        return style;
    }

    public static PackageItem getItemByStyle(PackageStyles.PackageStyle style){
        return PACKAGE_ITEMS.stream().filter(p->p.get().style.equals(style)).findFirst().orElse(()-> (PackageItem) PackageStyles.getDefaultBox().getItem()).get();
    }

}
