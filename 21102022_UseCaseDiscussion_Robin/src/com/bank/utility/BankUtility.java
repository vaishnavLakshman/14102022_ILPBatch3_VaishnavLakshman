package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.service.MisService;
import com.bank.service.Service;

public class BankUtility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		Customer customer = null;
		char choice ;
		String accountChoice = null;
		System.out.println("******Welcome To Bank******");
		do {
			System.out.println("1.Create Account\n2.Manage Accounts\n3.Exit");
			int mainChoice = scanner.nextInt();
			scanner.nextLine();
			switch (mainChoice) {
			case 1:
				customer = Service.createCustomer(accountList);
				char extraChoice;
				do 
					{
						int customerAccountChoice = MisService.enterAccountChoice();
						accountList.add(Service.createAccount(customerAccountChoice));
						if (customerAccountChoice == 1) 
						{
						System.out.print("Savings Max Account");
						} 
						else if (customerAccountChoice == 2) 
						{
						System.out.print("Current Account");
						}
						else if (customerAccountChoice == 3) 
						{
						System.out.print("Loan Account");
						}
	
					System.out.println(" created for " + customer.getCustomerName());
					System.out.println("Account is active!!");

					System.out.println("Would you like to create another account?(y/n)");
					extraChoice = scanner.next().charAt(0);
					}
				while(extraChoice =='y');
					
				break;
			case 2:
					if(customer != null)
					{
						System.out.println("Enter Customer ID: ");
						String customerId = scanner.nextLine();
						if(customerId.equals(customer.getCustomerId()))
						{
							System.out.println(customer.getCustomerName()+" has the following accounts: ");
							Service.displayAccounts(accountList);
							System.out.println("Enter the name of required account: ");
							accountChoice = scanner.nextLine();
							char newChoice;
							do 
								{
								System.out.println("1.Deposit\n2.Withdraw\n3.Display Accounts");
								int choiceOfAction = scanner.nextInt();
								if(choiceOfAction == 1)
								{
									Service.depositMoney(accountChoice,customer);
								}
								else if(choiceOfAction == 2)
								{
									Service.withdrawMoney(accountChoice,customer);
								}
								else if(choiceOfAction == 3)
								{
									Service.displayAccountDetails(customer,accountList);
								}
								System.out.println("Do you want to continue managing "+accountChoice+"? (y/n): ");
								newChoice = scanner.next().charAt(0);
								}
							while(newChoice == 'y');
						}
						else
						{
							System.out.println("Enter valid customer ID");
						}
					}
					else 
					{
						System.out.println("No accounts to manage\nCreate an account.\n");
					}
					
				break;
			default:
				//System.out.println("You will be exiting the menu");
			}

			System.out.println("Do you want to continue to Main menu? (y/n): ");
			choice = scanner.next().charAt(0);

		} while (choice == 'y');
		System.out.println("Thank you for visiting");

	}

}
