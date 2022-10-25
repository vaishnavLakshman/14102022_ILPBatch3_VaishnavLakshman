package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Accounts;
import com.experion.entity.Customer;
import com.experion.service.AccountService;

public class AccountUtility {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String customerId;
		System.out.println("******Welcome To Bank******");
		ArrayList<Accounts>accountList=new ArrayList<Accounts>();
		ArrayList<Customer>customerList = new ArrayList<Customer>();
		
		System.out.println("1.Create Accounts\n2.Manage Accounts\n3.Exit");
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
		switch(choice)
		{
		
		case 1 : 
				System.out.println("Enter Customer Id: ");
				customerId = scanner.nextLine();
				if(customerId != accountList.getCustomerId())
				{
					System.out.println("Customer Id not available. Create new account");
					accountList.add(AccountService.createAccount());
				}
				else
				{
					System.out.println("Welcome back, "+accountList.getCustomerName()+"\n");
					accountList.add(AccountService.createAccount());
					
				}
				break;
		case 2 :
				System.out.println("Enter Customer Id: ");
				customerId = scanner.nextLine();
				AccountService.manageAccount();
				break;
				
		default :System.out.println("Thank you for visiting");
		}
		

	}

}
