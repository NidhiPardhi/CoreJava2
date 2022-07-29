package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeDateS2D {
	
	public static void main(String[] args) throws ParseException {
		
		String s= "08/07/2022";
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		Date d= sdf.parse(s);
		
		System.out.println(d);
		
		}
		
		
	}




