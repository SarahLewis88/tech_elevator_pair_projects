package com.techelevator.view;

public class Item {
	
	private String productID;
	private String productName;
	private double productPrice;
	private String productType;
	private int productQty = 50;
	
	private final String BEVERAGE = "BEVERAGE";
	private final String APPETIZER = "APPETIZER";
	private final String DESSERT = "DESSERT";
	private final String ENTREE = "ENTREE";
	
	//constructors
	public Item(String productID, String productName, double productPrice, String productType) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType  = productType;
	}
	public Item(int productQty) {
		this.productQty = productQty;
	}
	
	//getters and setters
	public String getProductID() {
		return productID;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public String getProductType() {
		if (productType.equals("B")) {
			return BEVERAGE;
		} else if (productType.equals("A")) {
			return APPETIZER;
		} else if (productType.equals("D")) {
			return DESSERT;
		} else if (productType.equals("E")) {
			return ENTREE;
		}
		return productType;
	}
	public int getProductQty() {
		return productQty;
	}

	// derived method
	public int updatedProductQty(int qtyRequested) {
		if (productQty >= qtyRequested) {
			productQty -= qtyRequested;
			return productQty;
		} else {
			return productQty;
		}
	}
}
