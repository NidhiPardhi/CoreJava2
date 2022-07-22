package com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Person p = new Person();

		String s = "22/10/1990";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(s);

		p.setName("Nidhi");
		p.setDateOfBirth(d1);
		p.setAddress("Bhopal");

		System.out.println(p.getName());
		
		sdf.format(p.getDateOfBirth());
		
		System.out.println(sdf.format(p.getDateOfBirth()));
		System.out.println(p.getAddress());
	}

}
