package com.rays.exercise97;

public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person(String firstName,String lastName) {
		
		this.firstName= firstName;
		this.lastName=lastName;
	}
	public String toString() {
		return (firstName + lastName);	

}
}