package com.theabysmalkraken.abysmalfreddo;

import com.theabysmalkraken.abysmalfreddo.item.FreddoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.*;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.item.Item;

@Mod(value = AbysmalFreddo.MOD_ID)
public class AbysmalFreddo {
	public static AbysmalFreddo instance;
	public static final String MOD_ID = "abysmalfreddo";
	
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	public static final RegistryObject<Item> FREDDO_ITEM = ITEMS.register("freddo", () -> new FreddoItem());
	
	public AbysmalFreddo() {
		instance = this;
		final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		modBus.addListener(this::commonSetup);
	}
	
	private void commonSetup(FMLCommonSetupEvent event) {
		
	}
}
