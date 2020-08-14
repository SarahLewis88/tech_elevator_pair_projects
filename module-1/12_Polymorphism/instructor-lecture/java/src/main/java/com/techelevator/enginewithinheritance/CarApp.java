package com.techelevator.enginewithinheritance;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(new GasEngine());
		
		Car oldCar = new Car(new SteamEngine());
		
		Car solarCar = new Car(new SolarEngine());

	}

}
