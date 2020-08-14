package com.techelevator.realtor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class will manage the inventory of all homes on the market
 * @author Java Green Class
 */
public class Inventory {
	
    private Map<Long, House> homeInventory = new HashMap<Long, House>();


    
    public void addHouseToInventory (House house) {
    	
    	homeInventory.put(house.getMlsListingNumber(), house);
    	
    }
    
    public void removeHouseFromInventory(Long mlsNumber) {
    	homeInventory.remove(mlsNumber);
    }
    
    public House retrieveHouseByMLSNumber (Long mlsNumber) {
    	return homeInventory.get(mlsNumber);
    }
    
    
    //TODO
   public House retrieveHouseByAddress(Address searchAddress) {
	   
	   //loop through all the items in map, pull out each House, look inside it at the 
	   //address fields and see if there is a match
	   
	   
	   
	  return null;   
   }
   
   //TODO
  public List<House> retrieveHomesByZipCode(String zipCode) {
	   
	   //loop through all the items in map, pull out each House, look inside it at the 
	   //address fields and see if there is a match
	   
	   
	   
	  return null;   
  }
   
   
    
    

}
