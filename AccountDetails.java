package com.elc.exa;

public class AccountDetails {

	public static void main(String[] args) {
	BankAccount acc = new BankAccount();
	acc.setAccountDetails("Rahul", 123456, 50000.0);
	String res = acc.getAccountDetails();
	System.out.println(res);
	}
}
