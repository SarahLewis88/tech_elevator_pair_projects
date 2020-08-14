package com.techelevator.constructortest;

public class ClassA {
	
	private int a;
	private int b;
	private int c;
	
	
	public ClassA(int a, int b) {
		
	}
	
	public ClassA(int a, int b, int c) {
		
	}
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public String write(String s)  {
		return "Hello " + s;
	}
	
	
	

}
