package com.techelevator;

public class RectangleWall extends Wall { // added extends wall
	
	private int length; // unique rectangle wall variables
	private int height;
	
	public RectangleWall(String name, String color, int length, int height) { // parent constructor with unique rectangle elements
		 super(name, color);
		 this.length = length;
		 this.height = height;
	}

	public int getLength() { // get
		return length;
	}
	public void setLength(int length) { // set
		this.length = length;
	}
	public int getHeight() { // get
		return height;
	}
	public void setHeight(int height) { // set
		this.height = height;
	}

	@Override
	public int getArea() { // calculates area
		return length*height;
		
	}
		
	public String toString(){ // toString() method to create string 
		return getName() + " (" + length + "x" + height + ") rectangle";
	}  
	
}
