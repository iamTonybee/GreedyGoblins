package com.anthonyacetate.greedygoblins.item;

import com.anthonyacetate.greedygoblins.GreedyGoblins;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Tiers.NETHERITE;

public class ModItems {
    //New Items are registered here
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreedyGoblins.MODID);


    public static final RegistryObject<Item> ESHIRUS_INGOT = ITEMS.register("eshirus_ingot",
            () -> new Item(new Item.Properties())   );

    public static final RegistryObject<Item> POTION_TANK = ITEMS.register("potion_tank",
            () -> new Item(new Item.Properties())   );

    public static final RegistryObject<SwordItem> ROSE_PETAL_BLADE = ITEMS.register("rose_petal_blade",
            () -> new SwordItem(ModTiers.SPECIAL,10,1.6f, new Item.Properties()));


    //method to register ITEMS to the event Bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
