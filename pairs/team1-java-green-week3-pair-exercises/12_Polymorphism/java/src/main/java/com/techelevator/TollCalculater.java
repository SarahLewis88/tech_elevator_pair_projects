package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculater {

	public static void main(String[] args) {

		List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
		int min = 10;
		int max = 240;
		int totalMilesTraveled = 0;
		double totalTollBoothRevenue = 0.00;
		
		Car firstCar = new Car(false);
		Car secondCar = new Car(true);
		Tank firstTank = new Tank();
		Truck firstTruck = new Truck(4);
		Truck secondTruck = new Truck(6);
		Truck thirdTruck = new Truck(8);
		
		listOfVehicles.add(firstCar);
		listOfVehicles.add(secondCar);
		listOfVehicles.add(firstTank);
		listOfVehicles.add(firstTruck);
		listOfVehicles.add(secondTruck);
		listOfVehicles.add(thirdTruck);
		
		for (Vehicle v : listOfVehicles) {
			int randomDistance = (int)(Math.random() * (max - min + 1) + min);
			totalMilesTraveled += randomDistance;
			totalTollBoothRevenue += v.calculateToll(randomDistance);
			System.out.println(v.getType() + " " + randomDistance + " " + v.calculateToll(randomDistance));
		}
		
		System.out.println (totalMilesTraveled + " " + totalTollBoothRevenue);

	}

}
