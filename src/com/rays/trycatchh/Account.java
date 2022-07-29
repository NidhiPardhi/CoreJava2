package com.rays.trycatchh;

public class Account {

	private String number;
	private String type;
	private double balance = 0;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amt) {

		double bal = getBalance() + amt;

		setBalance(bal);

	}

	public void withdrawl(double amt)  {

		double with = getBalance() - amt;

			try {
				if (with < 2000) {
				throw new OutOfBudget();
				
			}
				setBalance(with);	
			}
			catch (OutOfBudget e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			

		}
		

	}


