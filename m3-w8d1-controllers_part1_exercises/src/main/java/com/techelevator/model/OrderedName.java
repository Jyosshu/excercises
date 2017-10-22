package com.techelevator.model;

import java.util.HashMap;
import java.util.Map;

public class OrderedName {

	private String firstName;
	private String middleName;
	private String lastName;
	private String order;
	private Map<String, String> orderedNameMap;
	
	public OrderedName(String firstName, String middleName, String lastName, String order) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.order = order;
	}
	
	public OrderedName() {
		
	}
	
	public String getOrderedName() {
		orderedNameMap = new HashMap<>();
		orderedNameMap.put("firstMiLast", firstName+" "+middleName+" "+lastName);
		orderedNameMap.put("firstLast", firstName+" "+lastName);
		orderedNameMap.put("lastFirstMi", lastName+" "+firstName+" "+middleName);
		orderedNameMap.put("lastFirst", lastName+" "+firstName);
		
		String arrangedName = orderedNameMap.get(order);
		return arrangedName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

	public Map<String, String> getOrderedNameMap() {
		return orderedNameMap;
	}
	
	
	
}
