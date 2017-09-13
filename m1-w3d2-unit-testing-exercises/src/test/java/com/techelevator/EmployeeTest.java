package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSalaryUpper() {
		//Arrange
		Employee sut = new Employee(1, "John", "Smith", 10000.00);
		
		//Act
		sut.RaiseSalary(10.0);
		
		//Assert
		assertEquals(11000.0, sut.getAnnualSalary(), 0D);
	}
	
	@Test
	public void testSalaryLower() {
		//Arrange
		Employee sut = new Employee(1, "John", "Smith", 10000.00);
		
		//Act
		sut.RaiseSalary(1.0);
		double result = sut.getAnnualSalary();
		
		//Assert
		assertEquals(10100.0, result, 0D);
	}
	
	@Test
	public void testSalaryNegative() {
		//Arrange
		Employee sut = new Employee(1, "John", "Smith", 10000.00);
		
		//Act
		sut.RaiseSalary(-20.0);
		double result = sut.getAnnualSalary();
		
		//Assert
		assertEquals(8000.0, result, 0D);
	}

	@Test
	public void testConstructor() {
		Employee sut = new Employee(1, "John", "Smith", 10000.00);
		
		assertEquals(1, sut.getEmployeeId());
		assertEquals("Smith, John", sut.FullName());
		assertEquals(10000.00, sut.getAnnualSalary(), 0D);
	}
	
}
