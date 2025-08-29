package com.jules.stuffandmiscsdfrpg.core;

import com.jules.stuffandmiscsdfrpg.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(StuffAndMiscsDFRPG.MODID)
public class StuffAndMiscsDFRPG {
    public static final String MODID = "stuffandmiscsdfrpg";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> DFRPG_TAB = CREATIVE_MODE_TABS.register("dfrpg_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.SAPPHIRE.get().getDefaultInstance())
            .title(Component.literal("DFRPG"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.SAPPHIRE.get());
                output.accept(ModItems.SAPPHIRE_HELMET.get());
                output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                output.accept(ModItems.SAPPHIRE_BOOTS.get());
                output.accept(ModItems.SAPPHIRE_SWORD.get());
                output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                output.accept(ModItems.SAPPHIRE_AXE.get());
                output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                output.accept(ModItems.SAPPHIRE_HOE.get());

                output.accept(ModItems.BRONZE_INGOT.get());
                output.accept(ModItems.BRONZE_HELMET.get());
                output.accept(ModItems.BRONZE_CHESTPLATE.get());
                output.accept(ModItems.BRONZE_LEGGINGS.get());
                output.accept(ModItems.BRONZE_BOOTS.get());
                output.accept(ModItems.BRONZE_SWORD.get());
                output.accept(ModItems.BRONZE_PICKAXE.get());
                output.accept(ModItems.BRONZE_AXE.get());
                output.accept(ModItems.BRONZE_SHOVEL.get());
                output.accept(ModItems.BRONZE_HOE.get());

                output.accept(ModItems.STEEL_INGOT.get());
                output.accept(ModItems.STEEL_HELMET.get());
                output.accept(ModItems.STEEL_CHESTPLATE.get());
                output.accept(ModItems.STEEL_LEGGINGS.get());
                output.accept(ModItems.STEEL_BOOTS.get());
                output.accept(ModItems.STEEL_SWORD.get());
                output.accept(ModItems.STEEL_PICKAXE.get());
                output.accept(ModItems.STEEL_AXE.get());
                output.accept(ModItems.STEEL_SHOVEL.get());
                output.accept(ModItems.STEEL_HOE.get());

                output.accept(ModItems.MITHRIL_INGOT.get());
                output.accept(ModItems.MITHRIL_HELMET.get());
                output.accept(ModItems.MITHRIL_CHESTPLATE.get());
                output.accept(ModItems.MITHRIL_LEGGINGS.get());
                output.accept(ModItems.MITHRIL_BOOTS.get());
                output.accept(ModItems.MITHRIL_SWORD.get());
                output.accept(ModItems.MITHRIL_PICKAXE.get());
                output.accept(ModItems.MITHRIL_AXE.get());
                output.accept(ModItems.MITHRIL_SHOVEL.get());
                output.accept(ModItems.MITHRIL_HOE.get());

                output.accept(ModItems.ADAMANTINE_INGOT.get());
                output.accept(ModItems.ADAMANTINE_HELMET.get());
                output.accept(ModItems.ADAMANTINE_CHESTPLATE.get());
                output.accept(ModItems.ADAMANTINE_LEGGINGS.get());
                output.accept(ModItems.ADAMANTINE_BOOTS.get());
                output.accept(ModItems.ADAMANTINE_SWORD.get());
                output.accept(ModItems.ADAMANTINE_PICKAXE.get());
                output.accept(ModItems.ADAMANTINE_AXE.get());
                output.accept(ModItems.ADAMANTINE_SHOVEL.get());
                output.accept(ModItems.ADAMANTINE_HOE.get());

                output.accept(ModItems.ORICHALCUM_INGOT.get());
                output.accept(ModItems.ORICHALCUM_HELMET.get());
                output.accept(ModItems.ORICHALCUM_CHESTPLATE.get());
                output.accept(ModItems.ORICHALCUM_LEGGINGS.get());
                output.accept(ModItems.ORICHALCUM_BOOTS.get());
                output.accept(ModItems.ORICHALCUM_SWORD.get());
                output.accept(ModItems.ORICHALCUM_PICKAXE.get());
                output.accept(ModItems.ORICHALCUM_AXE.get());
                output.accept(ModItems.ORICHALCUM_SHOVEL.get());
                output.accept(ModItems.ORICHALCUM_HOE.get());
            }).build());

    public StuffAndMiscsDFRPG() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
