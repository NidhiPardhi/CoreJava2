package com.rays.date;

import java.util.Calendar;
import java.util.Date;

public class OneYearMaintenance {
	
	public static void main(String[] args) {
		
		Date today= new Date();
		
		Calendar cal= Calendar.getInstance();
		cal.setTime(today);
		for(int i =1;i<=12;i++){
			
		
		//30 days after maintenance date
		cal.add(Calendar.DATE, 30);
		
		Date after= cal.getTime();
		
		System.out.println(after);
		
		
		}
	}

}
