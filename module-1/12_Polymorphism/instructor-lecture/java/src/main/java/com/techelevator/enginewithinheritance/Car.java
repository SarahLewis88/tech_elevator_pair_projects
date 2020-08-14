package com.techelevator.enginewithinheritance;

public class Car {
	
	Engine engine;
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	public boolean startCar() {
		
		
		return engine.start();
		
	}
	
	

}
