package com.techelevator.dog;

public class Dog {

	private boolean sleeping = false;
	
	public String makeSound() {
		if (sleeping == true) {
			return "Zzzzz...";
		}
		else {
			return "Woof!";
		}
	}
	
	public boolean isSleeping() {
		if (sleeping == true) {
		return sleeping = true;
		}
		else {
			return false;
		}
	}
	
	public void sleep() {
		sleeping = true;
	}
	
	public void wakeUp() {
		sleeping = false;
	}
}
