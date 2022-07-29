package com.rays.oops;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double deposite) {
		double currentbal = getBalance() + deposite;
		setBalance(currentbal);

	}

	public void withdrawl(double withdrawl) {
		double aftrwd = getBalance() - withdrawl;
		setBalance(aftrwd);
	}

	public void fundTransfer(String accNumber, double amount) {
		double ft = getBalance() - amount;
		setBalance(ft);
	}
}