package com.rays.oops;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDateOfBirth(Date dob) {
		this.dob = dob;
	}

	public Date getDateOfBirth() {
		return dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
