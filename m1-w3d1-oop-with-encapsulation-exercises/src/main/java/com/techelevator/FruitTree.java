package com.techelevator;

public class FruitTree {
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			this.piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
		else {
			return false;
		}
	}
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		 this.typeOfFruit = typeOfFruit;
		 this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	

}
