package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// reads file to get inventory and puts it into list
public class FileLoader {
	
	private String fileName = null;
	
	public FileLoader(String fileName) {
		this.fileName = fileName;
	}

	public List<Item> loadData() throws FileNotFoundException { // method 
		List<Item> cateringItems = new ArrayList<Item>();
 
		try (Scanner scanner = new Scanner(new File(fileName))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] categories = line.split("\\|");
				String productID = categories[0];
				String productName = categories[1];
				double productPrice = (Double.parseDouble(categories[2]));
				String productType = categories[3];

				Item item = new Item(productID, productName, productPrice, productType);
				cateringItems.add(item);
			}
		}
		return cateringItems;
	}
}
