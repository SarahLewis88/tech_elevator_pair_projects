package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	private Account account;
	
	@Before
	public void preTest() {
		account = new Account(0);
	}
	
	@Test
	public void notNull() {
		Assert.assertNotNull(account);
	}
	
	@Test
	public void deposit() {
		account = new Account(10.00); // resets account balance
		Assert.assertEquals("add to account", 110.0, account.deposit(100.0),0.01);
		account = new Account(10.00); // resets account balance
		Assert.assertEquals("add more to account", 1010.0, account.deposit(1000.0),0.01);
		account = new Account(10.00); // resets account balance
		Assert.assertEquals("add more to account to make total more than 5000", 10.0, account.deposit(5000.0),0.01);
	}
	
	@Test
	public void spend() {
		Assert.assertEquals(5, account.spend(2.5, 2), 0.01);
		Assert.assertEquals(378, account.spend(9.45, 40), 0.01);
		Assert.assertEquals(58.25, account.spend(11.65, 5), 0.01);
	}
	
	@Test
	public void availableBalance() {
		account = new Account(100.00); // resets account balance
		Assert.assertEquals(25, account.availableBalance(75), 0.01);
		account = new Account(100.00); // resets account balance
		Assert.assertEquals(60, account.availableBalance(40), 0.01);
		account = new Account(100.00); // resets account balance
		Assert.assertEquals(-10, account.availableBalance(110), 0.01);
	}
}