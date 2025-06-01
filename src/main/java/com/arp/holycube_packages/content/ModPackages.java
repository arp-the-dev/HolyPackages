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

    public static final List<PackageStyles.PackageStyle> PACKAGE_STYLES = new ArrayList<>();
    private static final List<Supplier<PackageItem>> PACKAGE_ITEMS = new ArrayList<>();


    public static final PackageStyles.PackageStyle RARE_AEKEEP_PACKAGE = registerPackage("rare_aekeep");
    public static final PackageStyles.PackageStyle RARE_AGRAIC_PACKAGE = registerPackage("rare_agraic");
    public static final PackageStyles.PackageStyle RARE_ALKASYM_PACKAGE = registerPackage("rare_alkasym");
    public static final PackageStyles.PackageStyle RARE_ALPZZ_PACKAGE = registerPackage("rare_alpzz");
    public static final PackageStyles.PackageStyle RARE_ANAEY_PACKAGE = registerPackage("rare_anaey");
    public static final PackageStyles.PackageStyle RARE_ARIUX_PACKAGE = registerPackage("rare_ariux");
    public static final PackageStyles.PackageStyle RARE_AURELIEN_SAMA_PACKAGE = registerPackage("rare_aurelien_sama");
    public static final PackageStyles.PackageStyle RARE_AYPIERRE_PACKAGE = registerPackage("rare_aypierre");
    public static final PackageStyles.PackageStyle RARE_BAHASON_PACKAGE = registerPackage("rare_bahason");
    public static final PackageStyles.PackageStyle RARE_BILL_PACKAGE = registerPackage("rare_bill");
    public static final PackageStyles.PackageStyle RARE_BOITAMEU_PACKAGE = registerPackage("rare_boitameu");
    public static final PackageStyles.PackageStyle RARE_BOUNE_PACKAGE = registerPackage("rare_boune");
    public static final PackageStyles.PackageStyle RARE_DAFTGUY_PACKAGE = registerPackage("rare_daftguy");
    public static final PackageStyles.PackageStyle RARE_DEMAZELLE_PACKAGE = registerPackage("rare_demazelle");
    public static final PackageStyles.PackageStyle RARE_EDOROCK_PACKAGE = registerPackage("rare_edorock");
    public static final PackageStyles.PackageStyle RARE_FLANNOU_PACKAGE = registerPackage("rare_flannou");
    public static final PackageStyles.PackageStyle RARE_GOLDAWN_PACKAGE = registerPackage("rare_goldawn");
    public static final PackageStyles.PackageStyle RARE_GUEP_PACKAGE = registerPackage("rare_guep");
    public static final PackageStyles.PackageStyle RARE_GUILL_PACKAGE = registerPackage("rare_guill");
    public static final PackageStyles.PackageStyle RARE_IKA_PACKAGE = registerPackage("rare_ika");
    public static final PackageStyles.PackageStyle RARE_JIMMY_PACKAGE = registerPackage("rare_jimmy");
    public static final PackageStyles.PackageStyle RARE_KEYOPS_PACKAGE = registerPackage("rare_keyops");
    public static final PackageStyles.PackageStyle RARE_KOLD_PACKAGE = registerPackage("rare_kold");
    public static final PackageStyles.PackageStyle RARE_KYRIA_PACKAGE = registerPackage("rare_kyria");
    public static final PackageStyles.PackageStyle RARE_LAFAMILLE_PACKAGE = registerPackage("rare_lafamille");
    public static final PackageStyles.PackageStyle RARE_LERELO_PACKAGE = registerPackage("rare_lerelo");
    public static final PackageStyles.PackageStyle RARE_LINCA_PACKAGE = registerPackage("rare_linca");
    public static final PackageStyles.PackageStyle RARE_LOUSERON_PACKAGE = registerPackage("rare_louseron");
    public static final PackageStyles.PackageStyle RARE_LVCYD_PACKAGE = registerPackage("rare_lvcyd");
    public static final PackageStyles.PackageStyle RARE_MAPPER_PACKAGE = registerPackage("rare_mapper");
    public static final PackageStyles.PackageStyle RARE_MARTINPONK_PACKAGE = registerPackage("rare_martinponk");
    public static final PackageStyles.PackageStyle RARE_MAX_PACKAGE = registerPackage("rare_max");
    public static final PackageStyles.PackageStyle RARE_MAYLEENOR_PACKAGE = registerPackage("rare_mayleenor");
    public static final PackageStyles.PackageStyle RARE_MAYUKOW_PACKAGE = registerPackage("rare_mayukow");
    public static final PackageStyles.PackageStyle RARE_MEW_PACKAGE = registerPackage("rare_mew");
    public static final PackageStyles.PackageStyle RARE_MLDEG_PACKAGE = registerPackage("rare_mldeg");
    public static final PackageStyles.PackageStyle RARE_NEMS_PACKAGE = registerPackage("rare_nems");
    public static final PackageStyles.PackageStyle RARE_NIMBUS_PACKAGE = registerPackage("rare_nimbus");
    public static final PackageStyles.PackageStyle RARE_OMEEGA_PACKAGE = registerPackage("rare_omeega");
    public static final PackageStyles.PackageStyle RARE_ORANN_PACKAGE = registerPackage("rare_orann");
    public static final PackageStyles.PackageStyle RARE_REDTOXX_PACKAGE = registerPackage("rare_redtoxx");
    public static final PackageStyles.PackageStyle RARE_ROIS_LOUIS_PACKAGE = registerPackage("rare_roi_louis");
    public static final PackageStyles.PackageStyle RARE_SHOUKA_PACKAGE = registerPackage("rare_shouka");
    public static final PackageStyles.PackageStyle RARE_SMITTIES_PACKAGE = registerPackage("rare_smitties");
    public static final PackageStyles.PackageStyle RARE_TADJIN_PACKAGE = registerPackage("rare_tadjin");
    public static final PackageStyles.PackageStyle RARE_THATDANMGIRLL_PACKAGE = registerPackage("rare_thatdanmgirll");
    public static final PackageStyles.PackageStyle RARE_TUNGSTENE_PACKAGE = registerPackage("rare_tungstene");
    public static final PackageStyles.PackageStyle RARE_VARTAC_PACKAGE = registerPackage("rare_vartac");
    public static final PackageStyles.PackageStyle RARE_WOTAN_PACKAGE = registerPackage("rare_wotan");
    public static final PackageStyles.PackageStyle RARE_YASSOU_PACKAGE = registerPackage("rare_yassou");
    public static final PackageStyles.PackageStyle RARE_ZANZAG_PACKAGE = registerPackage("rare_zanzag");
    public static final PackageStyles.PackageStyle RARE_ZEDH_PACKAGE = registerPackage("rare_zedh");
    public static final PackageStyles.PackageStyle RARE_ZEPTUNA_PACKAGE = registerPackage("rare_zeptuna");


    public static final PackageStyles.PackageStyle RARE_GNOME_PACKAGE = registerPackage("rare_gnome");
    public static final PackageStyles.PackageStyle RARE_HOLYCUBE_PACKAGE = registerPackage("rare_holycube");
    public static final PackageStyles.PackageStyle RARE_LAG_POLICE_PACKAGE = registerPackage("rare_lag_police");
    public static final PackageStyles.PackageStyle RARE_PERDU_PACKAGE = registerPackage("rare_perdu");
    public static final PackageStyles.PackageStyle RARE_SIPHANO_PACKAGE = registerPackage("rare_siphano");
    public static final PackageStyles.PackageStyle RARE_STONKS_PACKAGE = registerPackage("rare_stonks");
    public static final PackageStyles.PackageStyle RARE_WINX_PACKAGE = registerPackage("rare_winx");
    public static final PackageStyles.PackageStyle RARE_ZARY_PACKAGE = registerPackage("rare_zary");

    public static final PackageStyles.PackageStyle RARE_THE_GOLDEN_PACKAGE = registerPackage("rare_the_golden");
    public static final PackageStyles.PackageStyle RARE_KIRBY_PACKAGE = registerPackage("rare_kirby");

    public static final PackageStyles.PackageStyle RARE_ARP_PACKAGE = registerPackage("rare_arp");


    private static PackageStyles.PackageStyle registerPackage(String styleId) {
        PackageStyles.PackageStyle style = new PackageStyles.PackageStyle(styleId,12,10,21f,true);
        Supplier<PackageItem> supplier = ITEMS.register(style.getItemId().getPath(), () ->
                new PackageItem(new Item.Properties().stacksTo(1), style)
        );
        PACKAGE_STYLES.add(style);
        PACKAGE_ITEMS.add(supplier);
        return style;
    }

    public static PackageItem getItemByStyle(PackageStyles.PackageStyle style){
        return PACKAGE_ITEMS.stream().filter(p->p.get().style.equals(style)).findFirst().orElse(()-> (PackageItem) PackageStyles.getDefaultBox().getItem()).get();
    }

}
