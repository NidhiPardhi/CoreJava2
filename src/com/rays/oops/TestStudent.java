package com.rays.oops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s= new Student();
		
		s.setName("Anuj");
		System.out.println("Name.."+s.getName());
		
		s.setAddress("Nehru Nagar Bhopal");
		System.out.println("Add.."+s.getAddress());
		
		s.setRollNo("102030");
		System.out.println("RollNo.."+s.getRollNo());
		
		s.setMarks(95);
		System.out.println("Marks.."+s.getMarks());
		
		Date t= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String s1= sdf.format(t);
		System.out.println("DoB.."+sdf.format(t));
		
		
	}

}
