package com.experion.entity;

import java.util.ArrayList;

public class Customer {
	
	private String customerName;
	private ArrayList<Accounts> accountList;
	
	public Customer(String customerName, ArrayList<Accounts> accountList) {
		this.customerName = customerName;
		this.accountList = accountList;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Accounts> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<Accounts> accountList) {
		this.accountList = accountList;
	}
}
