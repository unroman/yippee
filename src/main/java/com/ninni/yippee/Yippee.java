package com.ninni.yippee;

import com.ninni.yippee.block.YippeeBlocks;
import com.ninni.yippee.effects.YippeeMobEffect;
import com.ninni.yippee.effects.YippeeMobEffects;
import com.ninni.yippee.events.MiscEvents;
import com.ninni.yippee.init.YippeeBlockEntityTypes;
import com.ninni.yippee.init.YippeeSoundEvents;
import com.ninni.yippee.item.YippeeItems;
import com.ninni.yippee.network.YippeeNetworkHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Yippee.MOD_ID)
public class Yippee {
	public static final String MOD_ID = "yippee";

	public Yippee() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);

		YippeeBlocks.BLOCKS.register(modEventBus);
		YippeeBlockEntityTypes.BLOCK_ENTITIES.register(modEventBus);
		YippeeItems.ITEMS.register(modEventBus);
		YippeeMobEffects.MOB_EFFECT.register(modEventBus);
		YippeeSoundEvents.SOUND_EVENTS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(new MiscEvents());
	}

	private void setup(final FMLCommonSetupEvent event) {
		event.enqueueWork(YippeeNetworkHandler::init);
	}

}
