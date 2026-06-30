package com.xpyz.items;

import com.xpyz.Elixer2;
import com.xpyz.types.CustomTypes;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ItemInit {
    public static final Item ELIXER_HAT = registerItem("elixer_hat", 
        new ElixerHatItem(CustomTypes.WitchArmorMaterial, EquipmentType.HELMET, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Elixer2.id("elixer_hat")))));

    private static Item registerItem(String ID, Item item) {
        return Registry.register(Registries.ITEM, Elixer2.id(ID), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((entries) -> {
            entries.addBefore(Items.LEATHER_HELMET, ELIXER_HAT);
        });
    }
}
