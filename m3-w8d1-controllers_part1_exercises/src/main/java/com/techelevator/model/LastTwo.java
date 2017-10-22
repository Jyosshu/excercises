package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class LastTwo {
	private String wordOne;
	private String wordTwo;
	private String wordThree;
	private String wordFour;
	private String wordFive;
	private String wordSix;
	private String wordSeven;
	private String wordEight;
	private String wordNine;
	private String wordTen;
	List<String> wordList;
	
	public String getLastTwo() {
		
		wordList = new ArrayList<>();
		wordList.add(wordOne);
		wordList.add(wordTwo);
		wordList.add(wordThree);
		wordList.add(wordFour);
		wordList.add(wordFive);
		wordList.add(wordSix);
		wordList.add(wordSeven);
		wordList.add(wordEight);
		wordList.add(wordNine);
		wordList.add(wordTen);
		
		for (String entry : wordList) {
			if (entry == null){
				return "No value given";
			}
			else if (entry.length() <= 1) {
				return entry;
			}
			else if (entry.length() == 2) {
				entry = entry.substring(0, 1) + entry.substring(1,2);
				return entry;
			}
			else {
				entry = entry.substring(0, entry.length() - 2) + entry.charAt(entry.length() - 1) + entry.charAt(entry.length() - 2);
				return entry;
			}
		}
		
	}
	
	public String getWordOne() {
		return wordOne;
	}
	public void setWordOne(String wordOne) {
		this.wordOne = wordOne;
	}
	public String getWordTwo() {
		return wordTwo;
	}
	public void setWordTwo(String wordTwo) {
		this.wordTwo = wordTwo;
	}
	public String getWordThree() {
		return wordThree;
	}
	public void setWordThree(String wordThree) {
		this.wordThree = wordThree;
	}
	public String getWordFour() {
		return wordFour;
	}
	public void setWordFour(String wordFour) {
		this.wordFour = wordFour;
	}
	public String getWordFive() {
		return wordFive;
	}
	public void setWordFive(String wordFive) {
		this.wordFive = wordFive;
	}
	public String getWordSix() {
		return wordSix;
	}
	public void setWordSix(String wordSix) {
		this.wordSix = wordSix;
	}
	public String getWordSeven() {
		return wordSeven;
	}
	public void setWordSeven(String wordSeven) {
		this.wordSeven = wordSeven;
	}
	public String getWordEight() {
		return wordEight;
	}
	public void setWordEight(String wordEight) {
		this.wordEight = wordEight;
	}
	public String getWordNine() {
		return wordNine;
	}
	public void setWordNine(String wordNine) {
		this.wordNine = wordNine;
	}
	public String getWordTen() {
		return wordTen;
	}
	public void setWordTen(String wordTen) {
		this.wordTen = wordTen;
	}
	
}
