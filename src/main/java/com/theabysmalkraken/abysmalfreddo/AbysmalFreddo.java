package com.theabysmalkraken.abysmalfreddo;

import org.apache.logging.log4j.LogManager;

import com.theabysmalkraken.abysmalfreddo.item.FreddoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.*;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;

@Mod(AbysmalFreddo.MOD_ID)
public class AbysmalFreddo {
	public static AbysmalFreddo instance;
	public static final String MOD_ID = "abysmalfreddo";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
	public static final RegistryObject<Item> FREDDO_ITEM = ITEMS.register("freddo", FreddoItem::new);
	
	public AbysmalFreddo() {
		instance = this;
		final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		modBus.addListener(this::commonSetup);
		modBus.addListener(this::clientSetup);
		
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void commonSetup(FMLCommonSetupEvent event) {
		
	}
	
	private void clientSetup(FMLClientSetupEvent event) {
		
	}
}
