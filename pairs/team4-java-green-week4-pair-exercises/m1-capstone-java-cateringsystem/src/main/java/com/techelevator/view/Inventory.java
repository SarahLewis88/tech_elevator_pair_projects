package com.techelevator.view;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Inventory {
	
	private Map<String, Item> itemInventory = new HashMap<String, Item>();
	
	//constructor
	public Inventory(String fileName) {
		try {
			loadItemData(fileName);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// sorts product by product ID as key
	private void loadItemData(String fileName) throws FileNotFoundException {
		FileLoader fileLoader = new FileLoader(fileName);	
		List<Item> itemList = fileLoader.loadData();
		for (Item item : itemList) {
			this.itemInventory.put(item.getProductID(), item);
		}
	}

	//sorts all item in a list
	public List<Item> getAllItems() {
		List<Item> listOfItems = new ArrayList<Item>();
		Set<String> setOfItems = itemInventory.keySet();
		for (String key : setOfItems) {
			listOfItems.add(itemInventory.get(key));
		}
		return listOfItems;
	}
	
	//allows access to item inventory by productID
	public Map<String, Item> getItemInventory() {
		return itemInventory;
	}
}
