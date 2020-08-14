package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems = 0; // attribute
	private double totalAmountOwed = 0.0; // attribute
	private double averagePricePerItem = 0.0; // attribute
	
	public int getTotalNumberOfItems() { // get
		return totalNumberOfItems;
	}
	
	public double getTotalAmountOwed() { // get
		return totalAmountOwed;
	}
	
	public double getAveragePricePerItem() { // method
		return averagePricePerItem = totalAmountOwed / (double)totalNumberOfItems;
	}

	public void addItems(int numberOfItems, double pricePerItem) { // method
		totalNumberOfItems += numberOfItems;
		totalAmountOwed += pricePerItem * numberOfItems;
	}
	
	public void empty() { // method
		totalNumberOfItems = 0;
		totalAmountOwed = 0;
	}
}
