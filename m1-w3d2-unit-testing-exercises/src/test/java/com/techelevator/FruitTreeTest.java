package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	FruitTree sut = new FruitTree("apple", 10);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testPickingFewer() {
		//Arrange
		
		//Act
		boolean result = sut.pickFruit(9);
		
		//Assert
		assertEquals(true, result);
		assertEquals(1, sut.getPiecesOfFruitLeft());
	}
	@Test
	public void testPickingAll() {
		//Arrange
		
		//Act
		boolean result = sut.pickFruit(10);
		
		//Assert
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	}

	@Test
	public void testPickingMore() {
		//Arrange
		
		//Act
		boolean result = sut.pickFruit(11);
		
		//Assert
		assertEquals(false, result);
		assertEquals(10, sut.getPiecesOfFruitLeft());
	}

	@Test
	public void testPickingAllInParts() {
		//Arrange
		
		//Act
		boolean result = sut.pickFruit(5);
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
		
		//Assert
		result = sut.pickFruit(5);
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	}

	@Test
	public void testPickingNotEnough() {
		//Arrange
		
		//Act
		boolean result = sut.pickFruit(11);
		
		//Assert
		assertEquals(false, result);
		assertEquals(10, sut.getPiecesOfFruitLeft());
	}

}
