package com.techelevator;

public class TriangleWall extends Wall {
	
	private int base; // variables
	private int height;
	
	public TriangleWall(String name, String color, int base, int height) { // parent constructor with unique rectangle elements
		 super(name, color);
		 this.base = base;
		 this.height = height;
	}
	
	public int getBase() { // get
		return base;
	}
	public void setBase(int base) { // set
		this.base = base;
	}
	public int getHeight() { // get
		return height;
	}
	public void setHeight(int height) { // set
		this.height = height;
	}

	@Override
	public int getArea() { // calculates area
		return (base*height)/2;
	}
	
	public String toString(){ // toString() method to create string 
		  return (getName() + " (" + base + "x" + height + ") triangle");  
	}  
}
