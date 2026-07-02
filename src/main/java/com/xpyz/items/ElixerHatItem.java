package com.xpyz.items;

import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;

public class ElixerHatItem extends Item {
    public static final Identifier ARMOR_ADDITION_ID = Identifier.withDefaultNamespace("armor_addition");
    public ElixerHatItem(Properties properties) {
        super(properties);
    }

    public static ItemAttributeModifiers createAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ADDITION_ID, 1.0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }
}
