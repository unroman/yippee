package com.ninni.yippee.init;

import com.ninni.yippee.Yippee;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Yippee.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class YippeeSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Yippee.MOD_ID);

    public static final RegistryObject<SoundEvent> ITEM_CREATURE_YIPPEE = SOUND_EVENTS.register("item.tbh.yippee", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "item.tbh.yippee")));
    public static final RegistryObject<SoundEvent> ITEM_MOYAI_BOOM = SOUND_EVENTS.register("item.moyai.boom", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "item.moyai.boom")));
    public static final RegistryObject<SoundEvent> BLOCK_CUSHION_PRESSED = SOUND_EVENTS.register("block.whoopee_cushion.pressed", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "block.whoopee_cushion.pressed")));
    public static final RegistryObject<SoundEvent> BLOCK_CUSHION_UNPRESSED = SOUND_EVENTS.register("block.whoopee_cushion.unpressed", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "block.whoopee_cushion.unpressed")));
    public static final RegistryObject<SoundEvent> BLOCK_TACO_BELL_RING = SOUND_EVENTS.register("block.taco_bell.ring", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "block.taco_bell.ring")));
    public static final RegistryObject<SoundEvent> BLOCK_WEIGHT_FALL = SOUND_EVENTS.register("block.weight.fall", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "block.weight.fall")));
    public static final RegistryObject<SoundEvent> ITEM_RECORD_SCRATCH1 = SOUND_EVENTS.register("item.damaged_disc.scratch", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "item.damaged_disc.scratch")));
    public static final RegistryObject<SoundEvent> ITEM_RECORD_SCRATCH2 = SOUND_EVENTS.register("item.broken_disc.scratch", () -> new SoundEvent(new ResourceLocation(Yippee.MOD_ID, "item.broken_disc.scratch")));

    public static final SoundType WEIGHT = new ForgeSoundType(1.0F, 0.5F, () -> SoundEvents.ANVIL_BREAK, () -> SoundEvents.ANVIL_STEP, () -> SoundEvents.ANVIL_PLACE, () -> SoundEvents.ANVIL_HIT, () -> SoundEvents.ANVIL_FALL);

}