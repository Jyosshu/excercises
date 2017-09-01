package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (seperated by spaces): ");
		
		String decToConvert = input.nextLine();
		String[] parts = decToConvert.split(" ");
		
		for (int i = 0; i < parts.length; i++) {
			int number = Integer.parseInt(parts[i]);
			
			System.out.print(number + " in binary is "); decimalToBinary(number);
			System.out.println();
		}
		
		
	}
	
	public static void decimalToBinary(int number) {
		int index = 0;
		int binaryArray[] = new int[40];
		
		while (number > 0) {
			binaryArray[index++] = number % 2;
			number = number / 2;
		}
		for (int i = index - 1; i >= 0; i-- ) {
			System.out.print(binaryArray[i]);
		}
	}

}
