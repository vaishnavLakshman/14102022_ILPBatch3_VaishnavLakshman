package com.experion.service;

import com.experion.entity.Account;

public class AccountServices {

	public void depositCash(Account account, double amount)
	{
		System.out.println("Depositing money via the counter");
	}
	public void depositCash(Account account, String chequeNumber,double amount)
	{
		System.out.println("Depositing money via cheque");
	}
	public void depositCash(Account account, double amount, String upiCode)
	{
		System.out.println("Depositing money via online transfer");
	}
	
	
	

}
