package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Accounts;

public class AccountService {

	public static Accounts createAccount() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("***Accounts Available***");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice: ");
		int accountChoice = scanner.nextInt();

		System.out.println("Enter Customer Id: ");
		String customerId = scanner.nextLine();
		System.out.println("Enter Customer Name: ");
		String customerName = scanner.nextLine();
		double balance = 0; // initialized balance with balance = 0
		String accountType = null; // initialized accountType for further changes.
		if (accountChoice == 1) {
			accountType = "Savings Max Account";
		} else if (accountChoice == 2) {
			accountType = "Current Account";
		} else if (accountChoice == 3) {
			accountType = "Loan Account";
		}
		// enables to store the accountType for later display as that data is not
		// requested from the client.

		Accounts account = new Accounts(customerId, customerName, accountType, balance);
		return account;
	}

	public static void manageAccount(ArrayList<Accounts> accountList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(/*getCustomerName + */"Arjun Mohan has the following accounts"); // prints the client name along with the
																				// statement
		for (Accounts accountTypes : accountList.getAccountType()) {
			if (accountTypes != null) {
				System.out.println(accountTypes); // prints only the accountTypes that have been created by the above
													// called client
			}

		}
		System.out.println("Enter your choice: ");
		String choiceOfAccount = scanner.nextLine();

	}

}
