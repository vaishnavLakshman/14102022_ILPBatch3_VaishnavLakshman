package com.experion.utililty;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class BankUtility {

	public static void main(String[] args) {
		
		/*Account account = new Account("Women's Savings Account","ACC1968",1200);
		AccountServices accountService = new AccountServices();
		accountService.depositCash(account, 20000);
		accountService.depositCash(account, 20000, "823@upi");
		accountService.depositCash(account, "che187800", 20000);*/
		
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account\n2.Card\n3.Loan");
		Loan loan = null;
		int choice = scanner.nextInt();
		if(choice == 1)
		{
			product = new Account("Women's Savings Account","ACC1968",1200);
			Account account = (Account)product;
			account.cashWithdrawal();
			account.checkBalance();
			
		}
		else if(choice == 2) 
		{
			product = new Card("MasterCard","CAR1561",12000);
			
		}
		else if(choice == 3)
		{
			product = new Loan("Home Loan", "LO210", 25000);
			loan = (Loan)product;
		}
		product.checkProductValidity();
		//System.out.println(loan.getLoanAmount());
		
		
	}

}
