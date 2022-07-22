package com.rays.exercise97;

public class TestPerson {
	
	public static void main(String[] args) {
		 
		Person p = new Person("NIDHI","Pardhi");
		
		String s=p.toString();
		
		System.out.println(p.getFirstName()+" "+ p.getLastName());
	}

}
