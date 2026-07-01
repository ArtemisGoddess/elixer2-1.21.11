package com.xpyz.types;

import java.util.Map;

import com.xpyz.Elixer2;

import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class CustomTypes implements ArmorMaterials {
    private static ResourceKey<EquipmentAsset> REGISTRY_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Elixer2.id("elixer_hat")); //WHAT AM I DOINGGGGGG

    public static ArmorMaterial WitchArmorMaterial = new ArmorMaterial(-1, Map.of(ArmorType.HELMET, 1), 1, SoundEvents.ARMOR_EQUIP_LEATHER, 0, 0, ItemTags.REPAIRS_LEATHER_ARMOR, REGISTRY_KEY);
}
