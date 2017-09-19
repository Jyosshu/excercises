package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	static String userSearch = null;
	static String caseSensitive = "N";
	// /Users/joshwygle/workspace/team6-java-week-4-pair-exercises/m1-w4d2-file-io-part1-exercises-pair/alices_adventures_in_wonderland.txt
	
	
	public static void main(String[] args) {
		File userFilePath = getUserInput();

		fileTitle(userFilePath);  // Prints out the file's Title, author, etc
		
		userSearch(userFilePath); // calls search method to search for the user's word.

	}
	
	private static void fileTitle(File userFilePath) {
		
		try(Scanner fileScanner = new Scanner(userFilePath)) {
			
			int lineCounter = 1;
			
			while (fileScanner.hasNextLine() && lineCounter <= 43) {
				String line = fileScanner.nextLine();
				if (lineCounter == 1 || lineCounter == 9 || lineCounter == 43) {
					System.out.println(line);
				}
				lineCounter++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Your file does not exist.");
			e.printStackTrace();
			}
		System.out.println();
	}
	
	public static void userSearch(File userFilePath) {
		try(Scanner fileScanner = new Scanner(userFilePath)) {
				
			int lineCounter = 1;
			
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				
				if (caseSensitive.equalsIgnoreCase("Y")) {
					if (line.toUpperCase().contains(userSearch.toUpperCase())) {
						System.out.println(String.format("%-10s %-30s", lineCounter, line));
					}
					lineCounter++;
					}
				else {
					if (line.contains(userSearch)) {
						System.out.println(String.format("%-10s %-30s", lineCounter, line));
						lineCounter++;
						}
					
				}
				
			}
					
		} catch (FileNotFoundException e) {
			System.out.println("Your file does not exist.");
			e.printStackTrace();
			}
	}

	@SuppressWarnings("resource")
	private static File getUserInput() {
		String path = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word that you would like to search: ");
		userSearch = input.nextLine();
		System.out.println("Enter the path for the file that you wish to search: ");
		path = input.nextLine();
		System.out.println("Do you want this search to be case sensitive? (Y or N) ");
		caseSensitive = input.nextLine();
		
		File userFilePath = new File(path);
		return userFilePath;
	}
}
