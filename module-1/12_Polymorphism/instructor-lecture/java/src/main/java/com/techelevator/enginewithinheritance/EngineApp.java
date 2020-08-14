package com.techelevator.enginewithinheritance;

import java.util.ArrayList;
import java.util.List;


public class EngineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;

		List<Engine> engineList = new ArrayList<Engine>();

		ElectricEngine electric = new ElectricEngine();

		Engine solar = new SolarEngine();

		engineList.add(electric);
		engineList.add(solar);

		for (Engine e : engineList) {

			if (e instanceof SolarEngine) {
				System.out.println("Cloudy day won't start!!!");
			} else {
				System.out.println(e.start());
			}

		}

//		System.out.println(electric.start());
//		
//		
//		
//		System.out.println(electric.shutOff());
//		
//		System.out.println(electric.calculateHorsePower(4, 4));

	}

}
