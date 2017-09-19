package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz sut;
	
	@Before
	public void setup() {
		sut = new KataFizzBuzz();
	}

	@Test
	public void testGreaterThanZero() {
		String result = sut.fizzBuzz(0);
		assertEquals("Not a valid entry.", result);
	}
	
	@Test
	public void testOne() {
		String result = sut.fizzBuzz(1);
		assertEquals("1", result);
	}
	
	@Test
	public void testUpperLimit() {
		String result = sut.fizzBuzz(100);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void testPastUpperLimit() {
		String result = sut.fizzBuzz(101);
		assertEquals("Not a valid entry.", result);
	}
	
	@Test
	public void testFizzBuzzOutput() {
		sut.fizzBuzzOutput(53);
	}
}
