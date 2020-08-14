package com.techelevator.noisy;

public class Bird implements INoise, IFly{

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "chirping";
	}

	@Override
	public void printName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying");
	}
	

}
