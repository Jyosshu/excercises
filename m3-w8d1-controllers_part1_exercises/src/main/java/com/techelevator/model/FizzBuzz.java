package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	private Integer divisorOne;
	private Integer divisorTwo;
	private String altFizz;
	private String altBuzz;
	private Integer numOne;
	private Integer numTwo;
	private Integer numThree;
	private Integer numFour;
	private Integer numFive;
	private List<Object> fizzBuzz;
	
	public List<Object> doFizzBuzz() {
		List<Integer> intArray = new ArrayList<>();
		intArray.add(numOne);
		intArray.add(numTwo);
		intArray.add(numThree);
		intArray.add(numFour);
		intArray.add(numFive);
		
		fizzBuzz = new ArrayList<>();
		
		for (Integer entry: intArray ) {
			if (entry % (divisorOne * divisorTwo) == 0) {
				fizzBuzz.add(entry + " " + altFizz + altBuzz);
			}
			else if (entry % divisorOne == 0) {
				fizzBuzz.add(entry + " " + altFizz);
			}
			else if (entry % divisorTwo == 0) {
				fizzBuzz.add(entry + " " + altBuzz);
			}
			else {
				fizzBuzz.add(entry);
			}
		}
		
		return fizzBuzz;
	}

	public Integer getDivisorOne() {
		return divisorOne;
	}

	public void setDivisorOne(Integer divisorOne) {
		this.divisorOne = divisorOne;
	}

	public Integer getDivisorTwo() {
		return divisorTwo;
	}

	public void setDivisorTwo(Integer divisorTwo) {
		this.divisorTwo = divisorTwo;
	}

	public String getAltFizz() {
		return altFizz;
	}

	public void setAltFizz(String altFizz) {
		this.altFizz = altFizz;
	}

	public String getAltBuzz() {
		return altBuzz;
	}

	public void setAltBuzz(String altBuzz) {
		this.altBuzz = altBuzz;
	}

	public Integer getNumOne() {
		return numOne;
	}

	public void setNumOne(Integer numOne) {
		this.numOne = numOne;
	}

	public Integer getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(Integer numTwo) {
		this.numTwo = numTwo;
	}

	public Integer getNumThree() {
		return numThree;
	}

	public void setNumThree(Integer numThree) {
		this.numThree = numThree;
	}

	public Integer getNumFour() {
		return numFour;
	}

	public void setNumFour(Integer numFour) {
		this.numFour = numFour;
	}

	public Integer getNumFive() {
		return numFive;
	}

	public void setNumFive(Integer numFive) {
		this.numFive = numFive;
	}

	public List<Object> getFizzBuzz() {
		return fizzBuzz;
	}

	public void setFizzBuzz(List<Object> fizzBuzz) {
		this.fizzBuzz = fizzBuzz;
	}
	
	
}
