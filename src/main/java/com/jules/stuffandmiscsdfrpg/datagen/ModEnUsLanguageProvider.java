package com.jules.stuffandmiscsdfrpg.datagen;

import com.jules.stuffandmiscsdfrpg.core.StuffAndMiscsDFRPG;
import com.jules.stuffandmiscsdfrpg.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsLanguageProvider extends LanguageProvider {
    public ModEnUsLanguageProvider(PackOutput output, String locale) {
        super(output, StuffAndMiscsDFRPG.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModItems.SAPPHIRE.get(), "Sapphire");
        add(ModItems.SAPPHIRE_SWORD.get(), "Sapphire Sword");
        add(ModItems.SAPPHIRE_PICKAXE.get(), "Sapphire Pickaxe");
        add(ModItems.SAPPHIRE_AXE.get(), "Sapphire Axe");
        add(ModItems.SAPPHIRE_SHOVEL.get(), "Sapphire Shovel");
        add(ModItems.SAPPHIRE_HOE.get(), "Sapphire Hoe");
        add(ModItems.SAPPHIRE_HELMET.get(), "Sapphire Helmet");
        add(ModItems.SAPPHIRE_CHESTPLATE.get(), "Sapphire Chestplate");
        add(ModItems.SAPPHIRE_LEGGINGS.get(), "Sapphire Leggings");
        add(ModItems.SAPPHIRE_BOOTS.get(), "Sapphire Boots");

        add(ModItems.BRONZE_INGOT.get(), "Bronze Ingot");
        add(ModItems.BRONZE_SWORD.get(), "Bronze Sword");
        add(ModItems.BRONZE_PICKAXE.get(), "Bronze Pickaxe");
        add(ModItems.BRONZE_AXE.get(), "Bronze Axe");
        add(ModItems.BRONZE_SHOVEL.get(), "Bronze Shovel");
        add(ModItems.BRONZE_HOE.get(), "Bronze Hoe");
        add(ModItems.BRONZE_HELMET.get(), "Bronze Helmet");
        add(ModItems.BRONZE_CHESTPLATE.get(), "Bronze Chestplate");
        add(ModItems.BRONZE_LEGGINGS.get(), "Bronze Leggings");
        add(ModItems.BRONZE_BOOTS.get(), "Bronze Boots");

        add(ModItems.STEEL_INGOT.get(), "Steel Ingot");
        add(ModItems.STEEL_SWORD.get(), "Steel Sword");
        add(ModItems.STEEL_PICKAXE.get(), "Steel Pickaxe");
        add(ModItems.STEEL_AXE.get(), "Steel Axe");
        add(ModItems.STEEL_SHOVEL.get(), "Steel Shovel");
        add(ModItems.STEEL_HOE.get(), "Steel Hoe");
        add(ModItems.STEEL_HELMET.get(), "Steel Helmet");
        add(ModItems.STEEL_CHESTPLATE.get(), "Steel Chestplate");
        add(ModItems.STEEL_LEGGINGS.get(), "Steel Leggings");
        add(ModItems.STEEL_BOOTS.get(), "Steel Boots");

        add(ModItems.MITHRIL_INGOT.get(), "Mithril Ingot");
        add(ModItems.MITHRIL_SWORD.get(), "Mithril Sword");
        add(ModItems.MITHRIL_PICKAXE.get(), "Mithril Pickaxe");
        add(ModItems.MITHRIL_AXE.get(), "Mithril Axe");
        add(ModItems.MITHRIL_SHOVEL.get(), "Mithril Shovel");
        add(ModItems.MITHRIL_HOE.get(), "Mithril Hoe");
        add(ModItems.MITHRIL_HELMET.get(), "Mithril Helmet");
        add(ModItems.MITHRIL_CHESTPLATE.get(), "Mithril Chestplate");
        add(ModItems.MITHRIL_LEGGINGS.get(), "Mithril Leggings");
        add(ModItems.MITHRIL_BOOTS.get(), "Mithril Boots");

        add(ModItems.ADAMANTINE_INGOT.get(), "Adamantine Ingot");
        add(ModItems.ADAMANTINE_SWORD.get(), "Adamantine Sword");
        add(ModItems.ADAMANTINE_PICKAXE.get(), "Adamantine Pickaxe");
        add(ModItems.ADAMANTINE_AXE.get(), "Adamantine Axe");
        add(ModItems.ADAMANTINE_SHOVEL.get(), "Adamantine Shovel");
        add(ModItems.ADAMANTINE_HOE.get(), "Adamantine Hoe");
        add(ModItems.ADAMANTINE_HELMET.get(), "Adamantine Helmet");
        add(ModItems.ADAMANTINE_CHESTPLATE.get(), "Adamantine Chestplate");
        add(ModItems.ADAMANTINE_LEGGINGS.get(), "Adamantine Leggings");
        add(ModItems.ADAMANTINE_BOOTS.get(), "Adamantine Boots");

        add(ModItems.ORICHALCUM_INGOT.get(), "Orichalcum Ingot");
        add(ModItems.ORICHALCUM_SWORD.get(), "Orichalcum Sword");
        add(ModItems.ORICHALCUM_PICKAXE.get(), "Orichalcum Pickaxe");
        add(ModItems.ORICHALCUM_AXE.get(), "Orichalcum Axe");
        add(ModItems.ORICHALCUM_SHOVEL.get(), "Orichalcum Shovel");
        add(ModItems.ORICHALCUM_HOE.get(), "Orichalcum Hoe");
        add(ModItems.ORICHALCUM_HELMET.get(), "Orichalcum Helmet");
        add(ModItems.ORICHALCUM_CHESTPLATE.get(), "Orichalcum Chestplate");
        add(ModItems.ORICHALCUM_LEGGINGS.get(), "Orichalcum Leggings");
        add(ModItems.ORICHALCUM_BOOTS.get(), "Orichalcum Boots");

        add("creativetab.stuffandmiscsdfrpg.dfrpg_tab", "DFRPG");
    }
}
