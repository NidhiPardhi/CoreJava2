package com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDoctor {
	public static void main(String[] args) throws ParseException {
		
		Doctor d= new Doctor();
		
		d.setName("Doctor Strange");
		d.setAddress("USA");
		d.setRegistrationNo("103467");
		
		String s="12/10/1985";
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(s);
		String s1= sdf.format(d1);
		
		System.out.println("Name .."+d.getName());
		System.out.println("Add. .."+d.getAddress());
		System.out.println("DoB .."+s1);
		System.out.println("RegNo. .."+d.getRegistrationNo());
	}

}
