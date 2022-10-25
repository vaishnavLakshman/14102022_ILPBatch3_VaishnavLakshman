package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	static Product productList[] = new Product[3];

	public static void inputProductDetails() {
		String userChoice;
		int index = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Valdity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) - ");
		boolean active = scanner.nextBoolean();

//		product.setProductCode(productCode);
//		product.setProductName(productName);
//		product.setProductDescription(productDescription);
//		product.setProductPrice(productPrice);
//		product.setOpenDate(openDate);
//		product.setExpiryDate(expiryDate);
//		product.setValidityDate(validityDate);

		productList[index] = new Product(productCode, productName, productDescription, productPrice, openDate,
				validityDate, expiryDate, active);
		index++;
	}

	public static void displayProductDetails() {

		for (int count = 0; count < productList.length; count++) {
			if (productList[count]!= null) {

				System.out.println("Product Name " + "		" + "Product Description" + "		" + "Product Price"
						+ "			" + "Open Date" + "		" + "Expiry Date");
				System.out.println(
						productList[count].getProductName() + "				" + productList[count].getProductDescription()
								+ "				" + productList[count].getProductPrice() + "		"
								+ productList[count].getOpenDate() + "		" + productList[count].getExpiryDate());
			}

		}
	}

}
