package com.anthonyacetate.greedygoblins.item;

import com.anthonyacetate.greedygoblins.GreedyGoblins;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //New Items are registered here
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreedyGoblins.MODID);


    public static final RegistryObject<Item> ESHIRUS_INGOT = ITEMS.register("eshirus_ingot",
            () -> new Item(new Item.Properties())   );



    //method to register ITEMS to the event Bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
