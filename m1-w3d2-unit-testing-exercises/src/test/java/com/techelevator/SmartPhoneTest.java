package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBatteryUse() {
		SmartPhone sut = new SmartPhone("3305555555", "ProjectFi");
		
		sut.Call("1234567890", 30);
		
		assertEquals(70, sut.getBatteryCharge());
		
	}

	@Test
	public void testBatteryRecharge() {
		SmartPhone sut = new SmartPhone("3305555555", "ProjectFi");
		
		sut.Call("1234567890", 60);
		sut.RechargeBattery();
		
		assertEquals(100, sut.getBatteryCharge());
		
	}


	@Test
	public void testPhoneBatteryZero() {
		SmartPhone sut = new SmartPhone("3305555555", "ProjectFi");
		
		sut.Call("1234567890", 100);
		assertEquals(0, sut.getBatteryCharge());
		sut.HangUp();
		
		sut.Call("1234567890", 10);
		
		assertEquals(false, sut.isOnCall());
		
	}
	
	@Test
	public void testPhoneNumberLengthNormal() {
		SmartPhone sut = new SmartPhone("3305555555", "ProjectFi");
		
		assertEquals(10, sut.getPhoneNumber().length());
		
	}

	@Test
	public void testPhoneNumberLengthShort() {
		SmartPhone sut = new SmartPhone("33055555555", "ProjectFi");
		
		assertEquals(false, sut.Call("1234567", 40));
		
	}

}
