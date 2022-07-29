package com.rays.collectionsframework;

import java.util.Comparator;

public class Marksheet implements Comparable<Marksheet>{

	public String rollNo;
	public String name;
	public int marks;
	
	public Marksheet() {
		
	}
	public Marksheet(String rollNo,String name,int marks) {
		
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public int compareTo(Marksheet m) {
		return 0;
	}
	
	
	}
