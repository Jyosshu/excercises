package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	Television sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Television();
	}

	@Test
	public void testConstructor() {
		
		assertEquals(3, sut.getSelectedChannel());
		assertEquals(2, sut.getCurrentVolume());
		assertEquals(false, sut.IsOn());
	}
	
	@Test
	public void testVolumeLowerLimit() {
		sut.TurnOn();
		
		sut.LowerVolume();
		sut.LowerVolume();
		sut.LowerVolume();
		sut.LowerVolume();
		assertEquals(0, sut.getCurrentVolume());
	}
	
	@Test
	public void testVolumeUpperLimit() {
		sut.TurnOn();
		
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		
		assertEquals(10, sut.getCurrentVolume());
	}

	@Test
	public void testTvResetVolume() {
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		
		Television sut = new Television();
		
		assertEquals(2, sut.getCurrentVolume());
	}
	
	@Test
	public void testChannelLowerLimit() {
		sut.TurnOn();	
		
		sut.ChangeChannel(3);
		
		assertEquals(3, sut.getSelectedChannel());
	}
	
	@Test
	public void testChannelUpperLimit() {
		sut.TurnOn();	
		
		sut.ChangeChannel(18);
		
		assertEquals(18, sut.getSelectedChannel());
	}
	
	@Test
	public void testChannelBeyondLowerLimit() {
		sut.TurnOn();	
		
		sut.ChangeChannel(1);
		
		assertEquals(3, sut.getSelectedChannel());
	}
	
	@Test
	public void testChannelBeyondUpperLimit() {
		sut.TurnOn();	
		
		sut.ChangeChannel(20);
		
		assertEquals(3, sut.getSelectedChannel());
	}
	
	@Test
	public void testChangeVolumeAndChannel() {
		sut.TurnOn();
		
		sut.ChangeChannel(5);
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		
		assertEquals(5, sut.getSelectedChannel());
		assertEquals(5, sut.getCurrentVolume());
	}
	
	@Test
	public void testTelevisionOffVolumeChange() {
		sut.LowerVolume();
		sut.LowerVolume();
		sut.LowerVolume();
		sut.LowerVolume();
		
		assertEquals(2, sut.getCurrentVolume());
		
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		
		assertEquals(2, sut.getCurrentVolume());
	}
	
	@Test
	public void testTelevisionOffChangeChannel() {
		sut.ChangeChannel(5);
		assertEquals(3, sut.getSelectedChannel());
		
		sut.ChangeChannel(-5);
		assertEquals(3, sut.getSelectedChannel());
		
	}
	
}

