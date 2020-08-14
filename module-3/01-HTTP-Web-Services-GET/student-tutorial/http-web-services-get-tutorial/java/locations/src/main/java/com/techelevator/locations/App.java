package com.techelevator.locations;


import org.springframework.web.client.RestTemplate;


public class App {
	
  private UserInterface ui;
  private static final String API_URL = "http://localhost:3000/locations";
  private static RestTemplate restTemplate = new RestTemplate();

  
  public static void main(String[] args) {
	App app = new App();  
    app.run();
  }

  private void run() {
	  
  	ui = new UserInterface();

    boolean isFinished = false;
    String menuSelection;
	  
    while(!isFinished) {
    	  
        menuSelection = ui.printGreeting();
        
        
        if (menuSelection.equals("1")) {
        	  // list locations
        	  RestTemplate restTemplate = new RestTemplate();
        	  Location[] locations = restTemplate.getForObject(API_URL, Location[].class);     	  
        	  String id = ui.printLocations(locations);
        	  Location location = restTemplate.getForObject(API_URL + "/" + Integer.parseInt(id), Location.class);
        	  ui.printLocation(location);    

        	}
        else if (menuSelection.equals("2")) {
            isFinished = true;
        } 
        else {
            System.out.println("Invalid Selection");
        }

    }
    
    System.out.println("Goodbye!");        
             
	}

}
