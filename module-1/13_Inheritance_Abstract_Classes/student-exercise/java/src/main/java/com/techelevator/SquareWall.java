package com.techelevator;

public class SquareWall extends RectangleWall {
	
	private int sideLength; // variables

	public SquareWall(String name, String color, int sideLength) { // parent constructor with unique rectangle elements
		 super(name, color, sideLength, sideLength);
		 this.sideLength = sideLength;
	}

	public int getSideLength() { // get
		return sideLength;
	}
	public void setSideLength(int sideLength) { // set
		this.sideLength = sideLength;
	}

	@Override
	public int getArea() { // calculates area
		return sideLength*sideLength;
	}

	public String toString(){ // toString() method to create string 
		  return (getName() + " (" + sideLength + "x" + sideLength + ") square");  
	}  
	
}
