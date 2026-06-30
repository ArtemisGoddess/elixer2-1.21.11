package com.xpyz.client.renderer.armor;

import com.xpyz.Elixer2;
import com.xpyz.items.ElixerHatItem;

import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public final class ElixerHatRenderer<R extends BipedEntityRenderState & GeoRenderState> extends GeoArmorRenderer<ElixerHatItem, R> {
    public ElixerHatRenderer() {
        super(new DefaultedItemGeoModel<>(Elixer2.id("armor/elixer_hat")));
    }
}
