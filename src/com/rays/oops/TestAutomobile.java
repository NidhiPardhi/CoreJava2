package com.rays.oops;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile a= new Automobile();
		
		a.setColor("Black");
		System.out.println("color...."+a.getColor());
		
		a.setMake("2010");
		System.out.println("making....."+a.getMake());
		
		a.setGear(2);
		System.out.println("Starting gear....."+a.getGear());
		
		a.changeGear(2);
		System.out.println("changed gear....."+a.getGear());
		
		a.setSpeed(120);
		System.out.println("initial speed...."+a.getSpeed());
		
		a.accelerator(30);
		System.out.println("Speed up...."+a.getSpeed());
		
		a.breakk(50);
		System.out.println("Speed down....."+a.getSpeed());
		
	}

}
