package com.rays.oops;

public class Shapeee {
	
	private String color;
	private int borderWidth;
	private String type;
	private int size;
	
	public Shapeee(String color,int borderWidth) {
	        this.color=color;
	        this.borderWidth=borderWidth;
	}
	public String getColor() {
		return color;
		
	}
	public int getBorderWidth() {
		return borderWidth;
		
	}
	public Shapeee(String color,int size,String type ) {
		this.color=color;
		this.size=size;
		this.type=type;
	}
	public String getType() {
		return type;
		
	}
	public int getSize() {
		return size;
		
	}
    
}
