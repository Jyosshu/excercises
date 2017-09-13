package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	HomeworkAssignment sut;
	
	@Before
	public void setUp() throws Exception {
		//Arrange for every test
		sut = new HomeworkAssignment(100);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLetterGradeAHigh() {
		//Arrange
		sut.setTotalMarks(100);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("A", grade);
	}

	@Test
	public void testLetterGradeALow() {
		//Arrange
		sut.setTotalMarks(90);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("A", grade);
	}
	
	@Test
	public void testLetterGradeBHigh() {
		//Arrange
		sut.setTotalMarks(89);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("B", grade);
	}
	
	@Test
	public void testLetterGradeBLow() {
		//Arrange
		sut.setTotalMarks(80);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("B", grade);
	}
	
	@Test
	public void testLetterGradeCHigh() {
		//Arrange
		sut.setTotalMarks(79);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("C", grade);
	}
	
	@Test
	public void testLetterGradeCLow() {
		//Arrange
		sut.setTotalMarks(70);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("C", grade);
	}
	
	@Test
	public void testLetterGradeDHigh() {
		//Arrange
		sut.setTotalMarks(69);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("D", grade);
	}
	
	@Test
	public void testLetterGradeDLow() {
		//Arrange
		sut.setTotalMarks(60);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("D", grade);
	}	
	
	@Test
	public void testLetterGradeFHigh() {
		//Arrange
		sut.setTotalMarks(59);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("F", grade);
	}	

	@Test
	public void testLetterGradeFLow() {
		//Arrange
		sut.setTotalMarks(0);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("F", grade);
	}
	
	@Test
	public void testLetterGradeNegative() {
		//Arrange
		sut.setTotalMarks(-5);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("F", grade);
	}
	
	@Test
	public void testLetterGradeTooHigh() {
		//Arrange
		sut.setTotalMarks(1000);
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("A", grade);
	}
	
}
