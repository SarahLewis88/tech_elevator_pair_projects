package com.techelevator.constructortest;

public class Tester {

	public static void main(String[] args) {
		
		ClassA a = new ClassA(2,3);
		System.out.println(a.write("Steve"));
		
		ClassB b = new ClassB(3,4);
		System.out.println(b.write("Steve"));

	}

}
