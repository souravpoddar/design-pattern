package com.learning.designpattern.adapter;

public class GroceryItemAdapter implements Item{

	private GroceryItem item;
	
	public GroceryItemAdapter(GroceryItem item) {
		this.item = item;
	}
	
	@Override
	public String getItemName() {
		return this.item.getName();
	}

	@Override
	public String getPrice() {
		return this.item.getPrice();
	}

	@Override
	public String getRestaurantName() {
		return this.item.getStoreName();
	}

}
