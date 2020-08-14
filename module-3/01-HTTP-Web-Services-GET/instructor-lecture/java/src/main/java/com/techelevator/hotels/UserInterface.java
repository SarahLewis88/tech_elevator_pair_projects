package com.techelevator.hotels;

import java.util.Scanner;

public class UserInterface {
	
	private Scanner scanner;
	
	public UserInterface() {
		scanner = new Scanner(System.in);
	}
	
	
    public String printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Tech Elevator Hotels. Please make a selection: ");
        System.out.println("1: List Hotels");
        System.out.println("2: List Reviews");
        System.out.println("3: Show Details for Hotel ID 1");
        System.out.println("4: List Reviews for Hotel ID 1");
        System.out.println("5: List Hotels with star rating 3");
        System.out.println("6: Custom Query");
        System.out.println("0: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
        
        return scanner.nextLine();
    }

   public void printHotels(Hotel[] hotels) {
        System.out.println("--------------------------------------------");
        System.out.println("Hotels");
        System.out.println("--------------------------------------------");
        for (Hotel hotel : hotels) {
            System.out.println(hotel.getId() + ": " + hotel.getName());
        }
    }
   
   public int askForHotelId() {
	   System.out.println("Please enter id of hotel: \n\n");
	   int x =  scanner.nextInt();
	   scanner.nextLine();
	   return x;
   }

    public void printHotel(Hotel hotel) {
        System.out.println(hotel.toString());
    }

    public void printReviews(Review[] reviews) {
        for (Review review : reviews) {
            System.out.println(review.toString());
        }
    }	

}
