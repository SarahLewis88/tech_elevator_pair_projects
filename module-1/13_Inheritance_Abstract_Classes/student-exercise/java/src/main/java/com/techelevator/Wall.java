package com.techelevator;

public abstract class Wall { // added abstract
	
	private String name; // variables
	private String color;
	
	public Wall(String name, String color) { // constructors
		this.name = name;
		this.color = color;
	}

	public abstract int getArea(); // abstract area method

	public String getName() { // get
		return name;
	}
	public void setName(String name) { // set
		this.name = name;
	}
	public String getColor() { // get
		return color;
	}
	public void setColor(String color) { // set
		this.color = color;
	}

}
