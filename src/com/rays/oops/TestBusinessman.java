package com.rays.oops;

public class TestBusinessman {
	public static void main(String[] args) {
		
		Businessman bm=new Businessman();
		
		bm.setName("Mamaearth");
		bm.setAddress("GuruGram");
		bm.setIncome(150000000);
		
		System.out.println("Name...."+bm.getName());
		System.out.println("Address......"+bm.getAddress());
		System.out.println("Turn over..."+bm.getIncome());
	}

}
