package com.jules.tutorialmod.datagen;

import com.jules.tutorialmod.core.TutorialMod;
import com.jules.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsLanguageProvider extends LanguageProvider {
    public ModEnUsLanguageProvider(PackOutput output, String locale) {
        super(output, TutorialMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModItems.SAPPHIRE.get(), "Sapphire");
        add(ModItems.EXAMPLE_BLOCK_ITEM.get(), "Example Block");
        add(ModItems.SAPPHIRE_SWORD.get(), "Sapphire Sword");
        add(ModItems.SAPPHIRE_PICKAXE.get(), "Sapphire Pickaxe");
        add(ModItems.SAPPHIRE_AXE.get(), "Sapphire Axe");
        add(ModItems.SAPPHIRE_SHOVEL.get(), "Sapphire Shovel");
        add(ModItems.SAPPHIRE_HOE.get(), "Sapphire Hoe");
        add(ModItems.SAPPHIRE_HELMET.get(), "Sapphire Helmet");
        add(ModItems.SAPPHIRE_CHESTPLATE.get(), "Sapphire Chestplate");
        add(ModItems.SAPPHIRE_LEGGINGS.get(), "Sapphire Leggings");
        add(ModItems.SAPPHIRE_BOOTS.get(), "Sapphire Boots");
        add("creativetab.tutorialmod.example_tab", "Sapphire Tab");
    }
}
