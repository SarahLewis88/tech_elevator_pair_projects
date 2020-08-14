package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {
	
	public NonStart start = new NonStart();

	@Test
	public void startString() {
		Assert.assertEquals("String combo", new String ("iye") , start.getPartialString(new String ("hi"), ("bye")));
		Assert.assertEquals("String combo", new String ("ongeonsragons") , start.getPartialString(new String ("dongeons"), ("dragons")));
		Assert.assertEquals("String combo", new String ("unteratherer") , start.getPartialString(new String ("hunter"), ("gatherer")));
		Assert.assertEquals("String combo", new String ("a") , start.getPartialString(new String ("a"), ("ha")));
		Assert.assertEquals("String combo", new String ("") , start.getPartialString(new String ("a"), ("a")));
	}

}
