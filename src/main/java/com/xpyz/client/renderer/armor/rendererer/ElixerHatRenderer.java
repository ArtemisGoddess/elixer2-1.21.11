package com.xpyz.client.renderer.armor.rendererer;

import com.xpyz.items.ItemInit;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.item.ItemModels;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ItemOwner;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

import java.util.function.Function;

import org.jetbrains.annotations.NotNull;

import com.mojang.blaze3d.vertex.PoseStack;
import com.xpyz.Elixer2;
import com.xpyz.client.renderer.armor.model.ElixerHatModel;

import net.fabricmc.api.EnvType;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class ElixerHatRenderer implements ArmorRenderer {
    private static final Identifier TEXTURE = Elixer2.id("textures/item/armor/elixer_hat.png");
    public static final Function<Boolean, RenderType> RENDER_LAYER = Util.memoize(slim -> RenderTypes.armorCutoutNoCull(TEXTURE));
    public final ItemModelResolver itemModelManager;

    public ElixerHatRenderer(EntityRendererProvider.Context context) {
        this.itemModelManager = context.getItemModelResolver();
    }

    @Override
    public void render(PoseStack matrices, SubmitNodeCollector orderedRenderCommandQueue, ItemStack stack, HumanoidRenderState bipedEntityRenderState, EquipmentSlot slot, int light, HumanoidModel<HumanoidRenderState> contextModel) {

    }

    public static class Factory implements ArmorRenderer.Factory {
        @Override
        public @NotNull ArmorRenderer createArmorRenderer(EntityRendererProvider.@NotNull Context context) {
            return new ElixerHatRenderer(context);
        }
    }

}
