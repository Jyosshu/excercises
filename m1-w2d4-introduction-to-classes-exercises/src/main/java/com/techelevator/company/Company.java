package com.techelevator.company;

public class Company {

private String name;
private int numberOfEmployees = 0;
private double revenue = 0.00;
private double expenses = 0.00;

public String getCompanySize() {
	if (numberOfEmployees > 250) {
		return "large";
	}
	else if (numberOfEmployees > 50 && numberOfEmployees <= 250 ) {
		return "medium";
	}
	else {
		return "small";
	}
}

public double getProfit() {
	return revenue - expenses;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNumberOfEmployees() {
	return numberOfEmployees;
}

public void setNumberOfEmployees(int numberOfEmployees) {
	this.numberOfEmployees = numberOfEmployees;
}

public double getRevenue() {
	return revenue;
}

public void setRevenue(double revenue) {
	this.revenue = revenue;
}

public double getExpenses() {
	return expenses;
}

public void setExpenses(double expenses) {
	this.expenses = expenses;
}
	
}

