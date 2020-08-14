package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) { 
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}

	public boolean pickFruit(int numberOfPiecesToRemove) {
		
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {

			piecesOfFruitLeft-=numberOfPiecesToRemove; // pieces of fruit equals pieces of fruit minus pieces of fruit to remove
			
			return true;

		}
		else {
			return false;
		}
	}

	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
}
