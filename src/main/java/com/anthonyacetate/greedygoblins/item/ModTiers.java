package com.anthonyacetate.greedygoblins.item;

import com.anthonyacetate.greedygoblins.GreedyGoblins;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {

    public static final Tier SPECIAL = TierSortingRegistry.registerTier(
            new ForgeTier(5,9999,5f,10f,25,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(ModItems.ESHIRUS_INGOT.get())),
            new ResourceLocation(GreedyGoblins.MODID, "eshirus_ingot"), List.of(Tiers.NETHERITE), List.of()
            );
}
