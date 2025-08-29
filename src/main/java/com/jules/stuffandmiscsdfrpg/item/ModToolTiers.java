package com.jules.stuffandmiscsdfrpg.item;

import com.jules.stuffandmiscsdfrpg.core.StuffAndMiscsDFRPG;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    null, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(StuffAndMiscsDFRPG.MODID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 200, 5f, 1.5f, 12,
                    null, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(StuffAndMiscsDFRPG.MODID, "bronze"), List.of(Tiers.IRON), List.of());

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 500, 6f, 2.0f, 14,
                    null, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(StuffAndMiscsDFRPG.MODID, "steel"), List.of(Tiers.IRON), List.of());

    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1000, 7f, 2.5f, 16,
                    null, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
            new ResourceLocation(StuffAndMiscsDFRPG.MODID, "mithril"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier ADAMANTINE = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2000, 8f, 3.0f, 18,
                    null, () -> Ingredient.of(ModItems.ADAMANTINE_INGOT.get())),
            new ResourceLocation(StuffAndMiscsDFRPG.MODID, "adamantine"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2500, 9f, 3.5f, 25,
                    null, () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
            new ResourceLocation(StuffAndMiscsDFRPG.MODID, "orichalcum"), List.of(Tiers.NETHERITE), List.of());
}
