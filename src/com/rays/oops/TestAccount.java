package com.rays.oops;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setNumber("123456");
		System.out.println("Account Numbera-----"+a.getNumber());

		a.setAccountType("saving account");
		System.out.println("Account Type-----"+a.getAccountType());

		a.setBalance(5000);
		System.out.println("Balance-----"+a.getBalance());

		a.deposite(2000);
		System.out.println("After Deposite-----"+a.getBalance());

		a.withdrawl(3000);
		System.out.println("After Withdrawl-----"+a.getBalance());

		a.fundTransfer("123456", 4000);
		System.out.print("Account num  "+a.getNumber() + " //  " +"After Fund transfer  "+ a.getBalance());
	}

}
