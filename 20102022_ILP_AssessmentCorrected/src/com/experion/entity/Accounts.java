package com.experion.entity;

import java.util.ArrayList;

public class Accounts extends Customer {
	
	private double accountBalance;

	

	public Accounts(String customerName, ArrayList<Accounts> accountList, double accountBalance) {
		super(customerName, accountList);
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
		
}
