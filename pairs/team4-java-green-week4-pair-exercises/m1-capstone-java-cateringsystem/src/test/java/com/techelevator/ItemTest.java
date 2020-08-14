package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.view.Item;

public class ItemTest {
	
	private Item item;

	@Before
	public void preTest() {
		Item item = new Item(50);
	}

	@Test
	public void updatedProductQty() {
		item = new Item(50); // reset item quantity
		Assert.assertEquals(30, item.updatedProductQty(20));
		item = new Item(50); // reset item quantity
		Assert.assertEquals(50, item.updatedProductQty(0));
		item = new Item(50); // reset item quantity
		Assert.assertEquals(50, item.updatedProductQty(51));
		item = new Item(50); // reset item quantity
		Assert.assertEquals(0, item.updatedProductQty(50));
	}
}