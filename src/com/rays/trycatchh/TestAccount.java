package com.rays.trycatchh;

public class TestAccount {

	public static void main(String[] args)  {

		Account a = new Account();
		a.setBalance(1000);
		System.out.println("Balance = " + a.getBalance());

		a.deposite(5000);
		System.out.println("Balnce after Deposite = " + a.getBalance());

		a.withdrawl(5000);
		System.out.println("Balnce after Withdrawl = " + a.getBalance());

	}
}
