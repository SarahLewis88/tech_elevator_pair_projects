package com.techelevator.view;

import java.util.List;
import java.util.Scanner;

import com.techelevator.Account;

// print menu and collect user response
public class Menu {
	
	private Scanner scanner = new Scanner(System.in);

	public String mainMenu() {
		System.out.println("(1) Display Catering Items");
		System.out.println("(2) Order");
		System.out.println("(3) Quit");
		return scanner.nextLine();
	}
	
	public String subMenu(Account account) {
		System.out.println("(1) Add money");
		System.out.println("(2) Select Products");
		System.out.println("(3) Complete Transaction");
	
		System.out.println("Current Account Balance: $" + account.getBalance());
		
		return scanner.nextLine();
	}
	
	public void displayCateringItems(List<Item> itemList) {
		for (Item item : itemList) {
			System.out.println(item.getProductID() + " " + item.getProductName() + " $" + item.getProductPrice() + " " +  item.getProductType() + " " + item.getProductQty());
		}
	}
	
	public void finalTransaction(List<Item> itemList, double accountBalance) {
		int totalProductPurchased;
		String typeOfProduct; // convert prdouctID to product type; 
		String nameOfProduct; // convert prdouctID to product name
		double pricePerItem;
		Double totalAmountSpentPerItem;
		Double overallTotal = 0.0;
		for (Item item : itemList) {
			totalProductPurchased = 50 - item.getProductQty();
			typeOfProduct = item.getProductType(); // convert prdouctID to product type; 
			nameOfProduct = item.getProductName(); // convert prdouctID to product name
			pricePerItem = item.getProductPrice();
			totalAmountSpentPerItem = (double) totalProductPurchased * pricePerItem;
			if (totalProductPurchased > 0) {
				System.out.println(totalProductPurchased + " " + typeOfProduct + " " + nameOfProduct + " $" + pricePerItem + " $" + totalAmountSpentPerItem);
				overallTotal += totalAmountSpentPerItem;
			}
		}
		
		System.out.println("Total: $" + overallTotal);
		ChangeCalculator changeCalculator = new ChangeCalculator();
		System.out.println("Your remaining balance is: $" + accountBalance + ". Here's your change back: \n" + changeCalculator.changeCalculator(accountBalance));
	}
}