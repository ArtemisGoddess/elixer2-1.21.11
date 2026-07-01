package com.xpyz.items;

import java.util.function.Function;

import com.xpyz.Elixer2;
import com.xpyz.types.CustomTypes;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.ArmorType;

public class ItemInit {
    public static final Item ELIXER_HAT = register("elixer_hat", settings -> new ElixerHatItem(settings.humanoidArmor(CustomTypes.WitchArmorMaterial, ArmorType.HELMET)));

    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory) {
		// Create the item key.
		ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Elixer2.id(name));

		// Create the item instance.
		T item = itemFactory.apply(new Item.Properties().setId(itemKey));

		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register((entries) -> {
            entries.addBefore(Items.LEATHER_HELMET, ELIXER_HAT);
        });
    }
}
