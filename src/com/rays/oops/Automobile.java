package com.rays.oops;

public class Automobile {
	
	private String color;
	private int speed=10;
	private int gear;
	private String make;
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
		
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	
	}
    public int getSpeed() {
		return speed;
    	
    }
    public void setGear(int gear) {
    	this.gear=gear;
    }
    public int getGear() {
	     return gear;
	    
    }
    public void setMake(String make) {
    	this.make=make;
    }
    public String getMake() {
		return make;
    	
    }
    public void changeGear(int changeGear) {
    	int gearChange= getGear()+changeGear;
    	setGear(gearChange);
    }
    public void accelerator(int accelerator) {
    	int speedUp = getSpeed() + accelerator;
    	setSpeed(speedUp);
    }
    public void breakk (int breakk) {
    	int speedLow=getSpeed()-breakk;
    	setSpeed(speedLow);
    }
}

