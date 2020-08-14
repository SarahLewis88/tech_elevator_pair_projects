package com.techelevator;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import com.techelevator.view.Item;
import com.techelevator.view.Menu;

public class CateringSystemCLI {

	private Menu menu;
	private ItemController controller;
	private Account account;

	// constructor
	public CateringSystemCLI(Menu menu, String fileName, Account account) {
		this.menu = menu;
		this.controller = new ItemController(fileName);
		this.account = account;
	}

	// main method
	public static void main(String[] args) {
		Menu menu = new Menu();
		String textFile = "cateringsystem.csv";
		Account account = new Account(0);
		CateringSystemCLI cli = new CateringSystemCLI(menu, textFile, account);
		cli.run();
	}

	// method that runs app
	public void run() {
		boolean finished = false;
		while (!finished) {
			String response = menu.mainMenu();
			if (response.equals("1")) {
				menu.displayCateringItems(controller.getAllItems());
			} else if (response.equals("2")) {
				callSubMenu();
			} else if (response.equals("3")) {
				finished = true;
			} else {
				System.out.println("Invalid response, please try again.");
			}
		}
		System.out.println("Goodbye!");
	}

	private void callSubMenu() {
		boolean finished = false;
		while (!finished) {
			String response = menu.subMenu(account);
			if (response.equals("1")) {
				addMoneyToBalance();
			} else if (response.equals("2")) {
				addProductToShoppingCart();
			} else if (response.equals("3")) {
				menu.finalTransaction(controller.getAllItems(), account.getBalance());
				finished = true;
			} else {
				System.out.println("Invalid choice, please try again.");
			}
		}
	}
	Double addedMoney = 0.0;
	// add money to balance
	private void addMoneyToBalance() {
		System.out.println("How much would you like to add? Your account balance can't go over $5,000.");
		Scanner addedMoneyInput = new Scanner(System.in); // user input is amount to add
		addedMoney = (double) addedMoneyInput.nextInt(); // parses user input to double
		this.account.deposit(addedMoney); // puts addedMoney in account object
	}

	// add to shopping cart
	private void addProductToShoppingCart() {
		System.out.println("Please enter item ID: ");
		Scanner productInput = new Scanner(System.in);
		String productID = productInput.nextLine();
		
		// gathering quantity of product
		System.out.println("Please enter item quantity: ");
		Scanner qtyOrder = new Scanner(System.in);

		if (!qtyOrder.hasNextInt()) {
			System.out.println("Invalid quantity!");
		}
		else {
			int qtyRequested = qtyOrder.nextInt();	
			if (controller.getItem(productID) == null) {
				System.out.println("Invalid product ID, please try again!");
			} else {
				menuErrors(productID, qtyRequested);
			}
		}
	}
	
	// if else statements that determines user ability to purchase item based on funds and stock
	private void menuErrors(String productID, int qtyRequested) {
		// does not subtract quantity requested from original
		int remainingQtyOfProductBeforePurchase = controller.getItem(productID).getProductQty();
		// trying to get price
		double netTotalAfterPurchase = netTotalAfterPurchase(productID, qtyRequested);
		// deals with funds
		if (netTotalAfterPurchase > account.getBalance()) {
			System.out.println("Insufficient funds!");
			System.out.println(productID + ", " + remainingQtyOfProductBeforePurchase + ", $" + account.getBalance());
		} // deals with stock
		else if (remainingQtyOfProductBeforePurchase < qtyRequested) {
			System.out.println("Insufficient stock!");
			System.out.println(productID + ", " + remainingQtyOfProductBeforePurchase + ", $" + account.getBalance());
		} else if (remainingQtyOfProductBeforePurchase <= 0) { // work on one if statement at a time
			System.out.println("ITEM IS SOLD OUT!");
			System.out.println(productID + ", " + remainingQtyOfProductBeforePurchase + ", $" + account.getBalance());
		} else {
			int updatedQtyOfProductAfterPurchase = updatedQtyOfProductAfterPurchase(productID, qtyRequested);
			System.out.println(productID + ", " + updatedQtyOfProductAfterPurchase + ", $" + (account.availableBalance(netTotalAfterPurchase)));
		}
	}

	// gets total product quantity
	private int updatedQtyOfProductAfterPurchase(String productID, int qtyRequested) {
		int updatedQtyOfProductAfterPurchase = controller.getItem(productID).updatedProductQty(qtyRequested);
		return updatedQtyOfProductAfterPurchase;
	}

	// called by addProductToShoppingCart method; this method is getting the price of the product by ID
	private double netTotalAfterPurchase(String productID, int qtyRequested) {
		double priceOfProduct = controller.getItem(productID).getProductPrice();
		double netTotal = account.spend(priceOfProduct, qtyRequested);
		return netTotal;
	}
}