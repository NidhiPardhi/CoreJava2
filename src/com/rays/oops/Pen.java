package com.rays.oops;

public class Pen {
	
	private String color;
	private String type;
	private int speed;
	
	Pen(String color,String type){
		this.color=color;
		this.type=type;
		
	}
	public String getColor() {
		return color;
	}
    public String getType() {
		return type;
    	
    }
    Pen (int speed)       {
    	this.speed=speed;
    }
    public int getSpeed() {
		return speed;
    	
    }
}
