package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReserveFirstTrue() {
		Airplane sut = new Airplane(10, 10);
		
		sut.reserveSeats(true, 10);
		
		assertEquals(0, sut.getAvailableFirstClassSeats());
	}

	@Test
	public void testFirstLow() {
		Airplane sut = new Airplane(10, 10);
		
		sut.reserveSeats(true, 1);
		
		assertEquals(9, sut.getAvailableFirstClassSeats());
	}

	@Test
	public void testFirstOverbook() {
		Airplane sut = new Airplane(10, 10);
		
		sut.reserveSeats(true, 15);
		
		assertEquals(10, sut.getAvailableFirstClassSeats());
	}

	@Test
	public void testReserveCoachTrue() {
		Airplane sut = new Airplane(10, 10);
		
		sut.reserveSeats(false, 10);
		
		assertEquals(0, sut.getAvailableCoachSeats());
	}

	@Test
	public void testCoachLow() {
		Airplane sut = new Airplane(10, 10);
		
		sut.reserveSeats(false, 1);
		
		assertEquals(9, sut.getAvailableCoachSeats());
	}

	@Test
	public void testCoachOverbook() {
		Airplane sut = new Airplane(10, 10);
		
		sut.reserveSeats(false, 15);
		
		assertEquals(10, sut.getAvailableCoachSeats());
	}

}
