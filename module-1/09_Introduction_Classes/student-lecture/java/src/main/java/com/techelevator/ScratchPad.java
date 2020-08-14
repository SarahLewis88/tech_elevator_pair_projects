package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScratchPad {

	public static void main(String[] args) {
		
		House house = new House();
		house.setNumberOfBedrooms(4);
		house.setGarageSize(3);
		house.setNumberOfBathrooms(5);
		house.setSquareFootage(12000);
		house.setYearBuilt(2020);
		
		
//		System.out.println("This house has " + house.getNumberOfBedrooms() + " bedrooms!");
//		System.out.println("This house has " + house.getGarageSize() + " care garage!");
//		System.out.println("This house has " + house.getSquareFootage() + " sq ft.!");

		
		House house2 = new House();
		house.setNumberOfBedrooms(3);
		house.setGarageSize(1);
		house.setNumberOfBathrooms(2);
		house.setSquareFootage(2000);
		house.setYearBuilt(2017);
		
//		System.out.println("This house has " + house2.getNumberOfBedrooms() + " bedrooms!");
//		System.out.println("This house has " + house2.getGarageSize() + " care garage!");
//		System.out.println("This house has " + house2.getSquareFootage() + " sq ft.!");
		
		Buyer buyer = new Buyer();
		buyer.setFirstName("Joe");
		buyer.setLastName("Smith");

		Agent agent = new Agent();
		
		agent.setFirstName("Bob");
		agent.setLastName("Villa");
		agent.setAgentId(1);
		
		List<House> homesForSale = new ArrayList<House>();
		homesForSale.add(house);
		homesForSale.add(house2);
		
		Map<Integer, List<House>> homeInventoryMap = new HashMap<Integer, List<House>>();
		homeInventoryMap.put(1, homesForSale);
		
		List<House> agentOnesList = homeInventoryMap.get(1);
		
		for(House h : agentOnesList) {
			System.out.println(h);
			System.out.println(h.getGarageSize());
			System.out.println(h.getNumberOfBathrooms());
			System.out.println(h.getNumberOfBedrooms());

		}

	}

}
