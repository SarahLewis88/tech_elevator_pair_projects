package com.techelevator;

import java.util.List;

import com.techelevator.view.Inventory;
import com.techelevator.view.Item;

public class ItemController {
	
	private Inventory inventory;

	
	public ItemController (String dataFile) {
		inventory = new Inventory(dataFile);
	}

	//calls Inventory class to get all items organized in a list
	public List<Item> getAllItems() {
		return inventory.getAllItems();
	}
	
	public Item getItem(String productID) {
		return inventory.getItemInventory().get(productID);
	}
	
	//get price from product ID
	public Item getItemPrice(double productPrice) {
		return inventory.getAllItems().get(2);
	}
}