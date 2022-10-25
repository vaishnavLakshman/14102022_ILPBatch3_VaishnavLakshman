package com.experion.utililty;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class productUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		char mainChoice;
		do 
		{
			System.out.println("***MENU***\n1.Add Card\n2.Add Account\n3.Buy Product");
		
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1 : productList.add(Service.createProduct("Cards"));
					break;
			case 2 :  productList.add(Service.createProduct("Accounts"));
					break;
			case 3 : Service.displayProductDetails(productList);
					break;
			default : System.out.println("Invalid Choice");
			}
		
		System.out.println("Do you want to continue?(y/n)");
		mainChoice = scanner.next().charAt(0);
		}while(mainChoice == 'y');
		
}

}
