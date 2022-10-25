package com.experion.entity;

import java.util.Scanner;

public class Product {

	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;

	public void inputProductDetails() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code: ");
		productCode = scanner.nextLine();
		System.out.println("Enter Product Name: ");
		productName = scanner.nextLine();
		System.out.println("Enter Product Description: ");
		productDescription = scanner.nextLine();
		System.out.println("Enter Product Price: ");
		productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Open Date: ");
		openDate = scanner.nextLine();
		System.out.println("Enter Validity Date: ");
		validityDate = scanner.nextLine();
		System.out.println("Enter Expiry Date: ");
		expiryDate = scanner.nextLine();
		System.out.println("Enter Status (True or False): ");
		active = scanner.nextBoolean();
	}

	public void displayProductDetails() {

		System.out.println("Product Name" + "   " + "Product Description" + "   " + "Product Price" + "   "
				+ "Open Date" + "   " + "Expiry Date");

		System.out.println(productName + "         " + productDescription + "   " + productPrice + "   " + openDate + "   "
				+ expiryDate);
	}

}
