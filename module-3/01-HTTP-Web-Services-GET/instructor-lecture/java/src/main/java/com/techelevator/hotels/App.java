package com.techelevator.hotels;

import org.springframework.web.client.RestTemplate;

import com.techelevator.city.City;

public class App {
	
	private UserInterface ui;
	private final String API_BASE_URL = "http://localhost:3000/";
	private RestTemplate restTemplate = new RestTemplate();


    public static void main(String[] args) {
    	App app = new App();
        app.run();
    }

    private void run() {
    	
    	ui = new UserInterface();
        Hotel[] hotels = null;
        boolean isFinished = false;
        String menuSelection;
        

        while(!isFinished) {
  
            menuSelection = ui.printGreeting();
 
            if (menuSelection.equals("1")) {
                ui.printHotels(requestHotels());
            } 
            else if (menuSelection.equals("2")) {
                ui.printReviews(requestReviews());
            } 
            else if (menuSelection.equals("3")) {
                int id = ui.askForHotelId();
                Hotel h = requestHotelById(id);
                System.out.println(h.toString());
                
            } 
            else if (menuSelection.equals("4")) {
                System.out.println("Not implemented");
            } 
            else if (menuSelection.equals("5")) {
                System.out.println("Not implemented");
            } 
            else if (menuSelection.equals("6")) {
                System.out.println(requestCity());
            } 
            else if (menuSelection.equals("0")) {
            	isFinished = true;
            } 
            else {
                System.out.println("Invalid Selection");
            }
 
        }
        
        System.out.println("Goodbye!");
        
       

    }
    
    
    private Hotel[] requestHotels() {
    	return restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
    }
    
    private Review[] requestReviews() {
    	return restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
    }
    
    private Hotel requestHotelById(int id) {
    	
    	return restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
    }

    private City requestCity() {
    	return restTemplate.getForObject("https://api.teleport.org/api/cities/geonameid:5128581/", City.class);
    }
}
