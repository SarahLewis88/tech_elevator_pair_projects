package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	private String name;
	private String address;
	private String phoneNumber;
	private Accountable[] accounts;
	private List<Accountable> accountList;
	
	public BankCustomer() { // constructor
		List<Accountable> accountList = new ArrayList<Accountable> (); // array list to array
		this.accountList = accountList;
	}
	
	public void addAccount(Accountable newAccount) {
		accountList.add(newAccount);
	}
	
	public String getName() { // get
		return name;
	}
	public void setName(String name) { // set
		this.name = name;
	}
	public String getAddress() { // get
		return address;
	}
	public void setAddress(String address) { // set
		this.address = address;
	}
	public String getPhoneNumber() { // get
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) { // set
		this.phoneNumber = phoneNumber;
	}
	public Accountable[] getAccounts() { // creates array list
		this.accounts = accountList.toArray(new Accountable [accountList.size()]);
		return accounts;
	}

	public Boolean isVip() { // combines balance with for loop and tests for vip
		int combinedBalance = 0;
		for(Accountable a : accountList) {
			combinedBalance += a.getBalance();
		}
		if (combinedBalance >= 25000) {
			return true;
		}
		else {
			return false;
		}
	}

}
