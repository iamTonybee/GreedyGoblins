package com.anthonyacetate.greedygoblins.item;

import com.anthonyacetate.greedygoblins.GreedyGoblins;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GreedyGoblins.MODID);
    public static final RegistryObject<CreativeModeTab> GREEDY_GOBLINS_TAB = CREATIVE_MODE_TABS.register("greedygoblins_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ESHIRUS_INGOT.get()))
                    .title(Component.translatable("creativetab.greedygoblins_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ESHIRUS_INGOT.get());
                        pOutput.accept(ModItems.POTION_TANK.get());

                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
