package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemoAdvancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];
		
		System.out.println("Enter five product names: ");
		for(i=0; i<productNames.length; i++) {
			productNames[i] = scanner.nextLine();
		}
		
		for(String productName : productNames) {
			System.out.println(productName+",length is "+productName.length());
		}
		
	}

}
