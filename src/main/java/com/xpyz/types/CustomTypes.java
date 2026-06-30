package com.xpyz.types;

import java.util.Map;

import com.xpyz.Elixer2;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;

public class CustomTypes implements ArmorMaterials {
    private static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Elixer2.id("equipment_asset")); //WHAT AM I DOINGGGGGG
    private static RegistryKey<EquipmentAsset> WITCH = register("elixer_hat");

    public static ArmorMaterial WitchArmorMaterial = new ArmorMaterial(-1, Map.of(EquipmentType.HELMET, 1), 1, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0, 0, ItemTags.REPAIRS_LEATHER_ARMOR, WITCH);


    static RegistryKey<EquipmentAsset> register(String name) { //Stolen from EquipmentAssetKeys because I am SO CONFUSED AS ALWAYS
        return RegistryKey.of(REGISTRY_KEY, Elixer2.id(name));
    }
}
