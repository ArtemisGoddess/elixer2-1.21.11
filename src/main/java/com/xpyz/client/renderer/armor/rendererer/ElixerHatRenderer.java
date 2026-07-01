package com.xpyz.client.renderer.armor.rendererer;

import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;

import java.util.function.Function;

import org.jetbrains.annotations.NotNull;

import com.mojang.blaze3d.vertex.PoseStack;
import com.xpyz.Elixer2;
import com.xpyz.client.renderer.armor.model.ElixerHatModel;

import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class ElixerHatRenderer implements ArmorRenderer {
    private static final Identifier TEXTURE = Elixer2.id("textures/item/armor/elixer_hat.png");
    public static final Function<Boolean, RenderType> RENDER_LAYER = Util.memoize(slim -> RenderTypes.armorCutoutNoCull(TEXTURE));

    private final ElixerHatModel<@NotNull HumanoidRenderState> model;

    public ElixerHatRenderer(EntityRendererProvider.Context context) {
        this.model = new ElixerHatModel<>(context.getModelSet().bakeLayer(ElixerHatModel.LAYER_LOCATION));
    }

    @Override
    public void render(PoseStack matrices, SubmitNodeCollector orderedRenderCommandQueue, ItemStack stack, HumanoidRenderState bipedEntityRenderState, EquipmentSlot slot, int light, HumanoidModel<HumanoidRenderState> contextModel) {
        ArmorRenderer.submitTransformCopyingModel(
                contextModel,
                bipedEntityRenderState,
                model,
                bipedEntityRenderState,
                true,
                orderedRenderCommandQueue,
                matrices,
                RENDER_LAYER.apply(true),
                light,
                OverlayTexture.NO_OVERLAY,
                bipedEntityRenderState.outlineColor,
                null
        );
    }

    public static class Factory implements ArmorRenderer.Factory {
        @Override
        public @NotNull ArmorRenderer createArmorRenderer(EntityRendererProvider.@NotNull Context context) {
            return new ElixerHatRenderer(context);
        }
    }
    
}
