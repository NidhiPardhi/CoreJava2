package com.rays.basics;

import java.util.Calendar;
import java.util.Date;

public class SetTimeToday {
	
	public static void main(String[] args) {
		
		Date today= new Date();
		
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(today);
		
		Date d= cal.getTime();
		
		System.out.println(d);
	}
	

}
