package com.techelevator.bank;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {

		
	//	BankAccount bankAccount = new BankAccount();
		
		
		CheckingAccount checking = new CheckingAccount("12345", 150.00, "5000");
		System.out.println(checking.getBalance());
		
		System.out.println(checking.deposit(50.00));


		

		
		SavingsAccount savings = new SavingsAccount("45637", 150.00);
		savings.deposit(50.00);
		System.out.println(savings.getBalance());
		
		BuckeyeChecking buckeye = new BuckeyeChecking("12345", 0, "3530");
		
		List<BankAccount> accountList = new ArrayList<BankAccount>();
		accountList.add(checking);
		accountList.add(savings);
		accountList.add(buckeye);
		
		System.out.println("********************");
		
		for (BankAccount b : accountList) {
			
			System.out.println(b.getBalance());
			
			if (b instanceof CheckingAccount) {
				System.out.println(b.getBalance());
				((CheckingAccount) b).writeCheck();
				
			}

		}
		
//		BigDecimal amountOne = new BigDecimal(100.50);
//		BigDecimal amountTwo = new BigDecimal(200.25);
//		amountTwo.add(amountOne);
//		
//	
//		
//		
//		amountO = amountOne.add(amountTwo);

	}

}
