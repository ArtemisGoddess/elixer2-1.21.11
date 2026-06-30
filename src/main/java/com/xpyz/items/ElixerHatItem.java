package com.xpyz.items;

import java.util.function.Consumer;
import java.util.function.Supplier;
import com.google.common.base.Suppliers;
import com.llamalad7.mixinextras.lib.apache.commons.mutable.MutableObject;
import com.xpyz.client.renderer.armor.ElixerHatRenderer;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

public class ElixerHatItem extends Item implements GeoItem {
    public final MutableObject<GeoRenderProvider> geoRenderProvider = new MutableObject<>();
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public ElixerHatItem(ArmorMaterial material, EquipmentType type, Item.Settings properties) {
        super(properties.armor(material, type));
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private final Supplier<ElixerHatRenderer<?>> renderer = Suppliers.memoize(ElixerHatRenderer::new);

			@Override
            public GeoArmorRenderer<?, ?> getGeoArmorRenderer(ItemStack itemStack, EquipmentSlot equipmentSlot) {
				return this.renderer.get();
			}
        });
    }

    @Override
    public void registerControllers(ControllerRegistrar arg0) { //Shouldn't need this
        
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }
}
