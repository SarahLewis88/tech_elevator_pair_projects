package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

	public DateFashion fashion = new DateFashion();

	@Test
	public void getTableTrue() {
		Assert.assertEquals("testing for won't get table", 0, fashion.getATable(2, 2));
		Assert.assertEquals("testing for won't get table", 0, fashion.getATable(2, 10));
		Assert.assertEquals("testing for won't get table", 0, fashion.getATable(2, 8));
	}
		
	@Test
	public void getTableMaybe() {
		Assert.assertEquals("testing for maybe get table", 1, fashion.getATable(5, 5));
		Assert.assertEquals("testing for maybe get table", 1, fashion.getATable(3, 3));
		Assert.assertEquals("testing for maybe get table", 1, fashion.getATable(3, 7));
	}
		
	@Test
	public void getTableFalse() {
		Assert.assertEquals("testing for will get table", 2, fashion.getATable(8, 8));
		Assert.assertEquals("testing for will get table", 2, fashion.getATable(10, 10));
		Assert.assertEquals("testing for will get table", 2, fashion.getATable(3, 8));
	}
	
}
