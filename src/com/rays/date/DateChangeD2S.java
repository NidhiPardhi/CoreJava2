package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChangeD2S {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		String s=sdf.format(d);
		
		System.out.println(s);
		
		
	}

}
