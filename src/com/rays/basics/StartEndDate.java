package com.rays.basics;

import java.util.Calendar;
import java.util.Date;

public class StartEndDate {
	
	public static void main(String[] args) {
		
		Date today= new Date();
		
		Calendar c= Calendar.getInstance();
		
		c.setTime(today);
		
		c.add(Calendar.DATE, -1);
		
		Date yesterday= c.getTime();
		
	if(today.getTime()<yesterday.getTime()) {
		
		System.out.println("no error");
		System.out.println(today);
		System.out.println(yesterday);
	}else {
		System.err.println("error");
	}
	
	if(yesterday.compareTo(today)==-1) {
		
		System.out.println("correct");
	}
	else {
		
		System.out.println("incorrect");
	}

}
}
