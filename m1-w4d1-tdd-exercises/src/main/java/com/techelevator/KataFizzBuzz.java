package com.techelevator;

public class KataFizzBuzz {
	private String result = "";
	// private int number = 0;
	
	public String fizzBuzz(int number) {
		
		if (number >= 1 && number <= 100) {
			if (number % 3 == 0 || number % 5 == 0 || Integer.toString(number).contains("3") || Integer.toString(number).contains("5")) {
				if (number % 3 == 0 || Integer.toString(number).contains("3")) {
					if (number % 5 == 0) {
						result = "FizzBuzz";
						return result;
					}
					else{
					result = "Fizz";
					return result;
					}
				}
				else {
					if (number % 3 == 0) {
						result = "FizzBuzz";
						return result;
					}
					else {
						if (Integer.toString(number).contains("5")) {
							result = "Buzz";
							return result;
						}
						else {
					result = "Buzz";
					return result;
						}
					}
				}
			}
			else {
				result = Integer.toString(number);
				// System.out.println(result);
				return  result;
			}	
		}
		else {
			return "Not a valid entry.";
		}
	}
	
	public void fizzBuzzOutput(int number) {
		for (int i = 0; i <= number; i++) {
			System.out.println(fizzBuzz(i));
		}
	}

}
