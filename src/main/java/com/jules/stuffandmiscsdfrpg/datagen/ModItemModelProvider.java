package com.jules.stuffandmiscsdfrpg.datagen;

import com.jules.stuffandmiscsdfrpg.core.StuffAndMiscsDFRPG;
import com.jules.stuffandmiscsdfrpg.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StuffAndMiscsDFRPG.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);
        handheldItem(ModItems.SAPPHIRE_HOE);
        simpleItem(ModItems.SAPPHIRE_HELMET);
        simpleItem(ModItems.SAPPHIRE_CHESTPLATE);
        simpleItem(ModItems.SAPPHIRE_LEGGINGS);
        simpleItem(ModItems.SAPPHIRE_BOOTS);

        simpleItem(ModItems.BRONZE_INGOT);
        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_AXE);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_HOE);
        simpleItem(ModItems.BRONZE_HELMET);
        simpleItem(ModItems.BRONZE_CHESTPLATE);
        simpleItem(ModItems.BRONZE_LEGGINGS);
        simpleItem(ModItems.BRONZE_BOOTS);

        simpleItem(ModItems.STEEL_INGOT);
        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_HOE);
        simpleItem(ModItems.STEEL_HELMET);
        simpleItem(ModItems.STEEL_CHESTPLATE);
        simpleItem(ModItems.STEEL_LEGGINGS);
        simpleItem(ModItems.STEEL_BOOTS);

        simpleItem(ModItems.MITHRIL_INGOT);
        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_HOE);
        simpleItem(ModItems.MITHRIL_HELMET);
        simpleItem(ModItems.MITHRIL_CHESTPLATE);
        simpleItem(ModItems.MITHRIL_LEGGINGS);
        simpleItem(ModItems.MITHRIL_BOOTS);

        simpleItem(ModItems.ADAMANTINE_INGOT);
        handheldItem(ModItems.ADAMANTINE_SWORD);
        handheldItem(ModItems.ADAMANTINE_PICKAXE);
        handheldItem(ModItems.ADAMANTINE_AXE);
        handheldItem(ModItems.ADAMANTINE_SHOVEL);
        handheldItem(ModItems.ADAMANTINE_HOE);
        simpleItem(ModItems.ADAMANTINE_HELMET);
        simpleItem(ModItems.ADAMANTINE_CHESTPLATE);
        simpleItem(ModItems.ADAMANTINE_LEGGINGS);
        simpleItem(ModItems.ADAMANTINE_BOOTS);

        simpleItem(ModItems.ORICHALCUM_INGOT);
        handheldItem(ModItems.ORICHALCUM_SWORD);
        handheldItem(ModItems.ORICHALCUM_PICKAXE);
        handheldItem(ModItems.ORICHALCUM_AXE);
        handheldItem(ModItems.ORICHALCUM_SHOVEL);
        handheldItem(ModItems.ORICHALCUM_HOE);
        simpleItem(ModItems.ORICHALCUM_HELMET);
        simpleItem(ModItems.ORICHALCUM_CHESTPLATE);
        simpleItem(ModItems.ORICHALCUM_LEGGINGS);
        simpleItem(ModItems.ORICHALCUM_BOOTS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StuffAndMiscsDFRPG.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(StuffAndMiscsDFRPG.MODID,"item/" + item.getId().getPath()));
    }
}
