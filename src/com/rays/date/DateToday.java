package com.rays.date;

import java.util.Calendar;
import java.util.Date;

public class DateToday {
	
	public static void main(String[] args) {
		
		Date today=new Date();
		//get a for current local time zone
		Calendar cal= Calendar.getInstance();
		//set to the current time 
		cal.setTime(today);
		//get today date
		cal.add(Calendar.DATE, -1);
		//get date of yesterday
		Date yesterday=cal.getTime();
		//get date of tomorrow
		cal.add(Calendar.DATE, 2);
		
		Date tomorrow= cal.getTime();
		//get date after 30 days
		cal.add(Calendar.DATE, 30);
		
		Date after= cal.getTime();
		//get date 30 days before
		cal.add(Calendar.DATE, -30);
		
		Date before=cal.getTime();
		
		System.out.println("today= "+today);
		System.out.println("yesterday= "+ yesterday);
		System.out.println("tomorrow= "+tomorrow);
		System.out.println("30 days after= "+after);
		System.out.println("30 days before= "+before);
		
		
		
		
		
		
		
		
	}

}
