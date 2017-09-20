package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {
	
	private static String result = "";
	// private int number = 0;

	public static void main(String[] args) {
		
		fizzBuzzOutput(300);
		
	}

	public static String fizzBuzz(int number) {
		
		if (number >= 1 && number <= 300) {
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
	
	public static void fizzBuzzOutput(int number) {
		File newFile = new File("FizzBuzz.txt");
		
		try(PrintWriter newWriter = new PrintWriter(newFile)) {
			for (int i = 0; i <= number; i++) {
				newWriter.println(fizzBuzz(i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
