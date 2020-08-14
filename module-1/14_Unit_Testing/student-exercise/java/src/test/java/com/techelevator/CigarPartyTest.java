package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

	public CigarParty party = new CigarParty();

	@Test
	public void havePartyTrue() {
		Assert.assertEquals("testing for successful", true, party.haveParty(107, true));
		Assert.assertEquals("testing for successful", true, party.haveParty(60, false));
		Assert.assertEquals("testing for successful", true, party.haveParty(40, true));
		Assert.assertEquals("testing for successful", true, party.haveParty(40, false));
	}
	
	@Test
	public void havePartyFalse() {
		Assert.assertEquals("testing for not successful", false, party.haveParty(39, true));
		Assert.assertEquals("testing for not successful", false, party.haveParty(70, false));
		Assert.assertEquals("testing for not successful", false, party.haveParty(16, true));
		Assert.assertEquals("testing for not successful", false, party.haveParty(61, false));
	}

}
