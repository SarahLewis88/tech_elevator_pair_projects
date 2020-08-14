package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JGRealtorApp {

	public static void main(String[] args) {
		
		
		House house = new House();
		
		house.setNumberOfBedrooms(4);
		house.setGarageSize(3);
		house.setNumberOfBathrooms(5);
		house.setSquareFootage(12000);
		house.setYearBuilt(2020);
		house.setPrice("1000000");
		
		Address address = new Address();
		address.setCity("Columbus");
		address.setState("OHIO");
		address.setStreetName("123 Oak Street");
		address.setZip("43013");
		
		house.setAddress(address);
		
	
		
//		System.out.println("This house has " + house.getNumberOfBedrooms() + " bedrooms!");
//		System.out.println("This house has " + house.getGarageSize() + " car garage");
//		System.out.println("This house has " + house.getSquareFootage() + " sq ft.!");
//		System.out.println("This house has " + house.getNumberOfBathrooms() + " bathrooms!");
		
	
	    House house2 = new House();
		house2.setNumberOfBedrooms(3);
		house2.setGarageSize(1);
		house2.setNumberOfBathrooms(2);
		house2.setSquareFootage(2000);
		house2.setYearBuilt(2017);
		house2.setPrice("10000");
		
	
		
//		System.out.println("This house2 has " + house2.getNumberOfBedrooms() + " bedrooms!");
//		System.out.println("This house2 has " + house2.getGarageSize() + " car garage");
//		System.out.println("This house2 has " + house2.getSquareFootage() + " sq ft.!");
//		System.out.println("This house2 has " + house2.getNumberOfBathrooms() + " bathrooms!");
		
     
		Buyer buyer = new Buyer();
		buyer.setFirstName("Joe");
		buyer.setLastName("Smith");;
		System.out.println(buyer.getFullName());
		
		Agent agent = new Agent(1);
		
		agent.setFirstName("Bob");
        agent.setLastName("Villa");	
       
        
        
        List<House> homesForSale = new ArrayList<House>();
        homesForSale.add(house);
        homesForSale.add(house2);
        
        Map<Integer, List<House>> homeInventoryMap = new HashMap<Integer, List<House>>();
        homeInventoryMap.put(1, homesForSale);
        
        
        //find the list of homes for agent 1
        List<House> agentOnesList = homeInventoryMap.get(1);
        
        for (House h : agentOnesList) {
        	
        	System.out.println(h.toString());
//        	System.out.println(h.getGarageSize() + ",");
//        	System.out.println(h.getNumberOfBathrooms() + ",");
//        	System.out.println(h.getNumberOfBedrooms()+ ",");
//        	System.out.println(h.getPrice()); 
        	
        	System.out.println("_____________________");
        }
        
        
 
		
	}

}
