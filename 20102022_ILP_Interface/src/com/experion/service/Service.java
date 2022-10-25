package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	
	public static Product createProduct(String productType) {
		// TODO Auto-generated method stub
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100", "Online Banking"));
		bankServices.add(new BankServices("SDD100", "Demand Draft"));
		bankServices.add(new BankServices("SCB100", "Cheque Book"));
		Product product = null;
		if (productType.compareTo("Cards") == 0) {
			product = new Card("PRDMC100", "MasterCard", "Cards", "Global");
		} else if (productType.compareTo("Accounts") == 0) {
			product = new Account("WSA100", "Women's Savings Account", "Accounts", "Savings",bankServices);
		}
		return product;
	}

	public static void createAccountProduct() {
		// TODO Auto-generated method stub

	}

	public static void displayProductDetails(ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		Card card = null;
		Account account = null;
		System.out.println("Product Code:" + "  " + "Product Type" + "  " + "Account/Card"+"  "+"Banking Services(if any)");
		for (Product product : productList) {

			if (product instanceof Card) {

				card = (Card) product;
				System.out.println(card.getProductCode() + "  " + card.getProductName() + "  " + card.getProductType()
						+ "  " + card.getCardType());
			} else if (product instanceof Account) {

				account = (Account) product;
				System.out.println(account.getProductCode() + "  " + account.getProductName() + "  "
						+ account.getProductType() + "  " + account.getAccountType()+"  "+account.getBankServices());
				System.out.println("The list of services are given below: ");
				for(BankServices bankServices : account.getBankServices())
					System.out.println(bankServices.getServiceName());
			}
		
		}
	
	}

}
