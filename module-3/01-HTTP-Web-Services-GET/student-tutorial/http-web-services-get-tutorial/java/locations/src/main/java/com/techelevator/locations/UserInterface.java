package com.techelevator.locations;

import java.util.Scanner;

public class UserInterface {

	private Scanner scanner;

	public UserInterface() {
		scanner = new Scanner(System.in);
	}

	public String printGreeting() {
		System.out.println("");
		System.out.println("Welcome to Tech Elevator Locations. Please make a selection: ");
		System.out.println("1: List Tech Elevator Locations");
		System.out.println("2: Exit");
		System.out.println("");
		System.out.print("Please choose an option: ");

		return scanner.nextLine();
	}

	public String printLocations(Location[] locations) {
		System.out.println("--------------------------------------------");
		System.out.println("Locations");
		System.out.println("--------------------------------------------");
		for (Location location : locations) {
			System.out.println(location.getId() + ": " + location.getName());
		}
		System.out.println("");
		System.out.print("Please enter a location id to get the details: ");
		
		return scanner.nextLine();
	}

	public void printLocation(Location location) {
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Location Details");
		System.out.println("--------------------------------------------");
		System.out.println("Id: " + location.getId());
		System.out.println("Name: " + location.getName());
		System.out.println("Address: " + location.getAddress());
		System.out.println("City: " + location.getCity());
		System.out.println("State: " + location.getState());
		System.out.println("Zip: " + location.getZip());
	}

}
