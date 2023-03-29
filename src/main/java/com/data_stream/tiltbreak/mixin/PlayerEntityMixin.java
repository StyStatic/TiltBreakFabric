package com.data_stream.tiltbreak.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Shadow
    protected float damageTiltYaw;

    /**
     * @author StyStatic
     * @reason Modify tilt function
     */

    @Inject(at = @At("RETURN"), method = "animateDamage")
    private void modifyTiltYaw(float yaw, CallbackInfo ci) {
        this.damageTiltYaw = -10F;
    }
}
