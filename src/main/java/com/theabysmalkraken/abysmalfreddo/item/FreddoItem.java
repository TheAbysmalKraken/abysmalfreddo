package com.theabysmalkraken.abysmalfreddo.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraft.item.Food;


public class FreddoItem extends Item{
	@ObjectHolder("abysmalfreddo:freddo")
	public static final Food freddo = (new Food.Builder()).hunger(2).saturation(0.5F).setAlwaysEdible().fastToEat().build();

	public FreddoItem() {
		super(new Item.Properties().food(freddo));
	}

}
