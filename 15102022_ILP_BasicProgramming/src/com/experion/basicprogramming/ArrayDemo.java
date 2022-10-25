package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];
		
		System.out.println("Enter five product names: ");
		for(i=0; i<productNames.length; i++) {
			productNames[i] = scanner.nextLine();
		}
		
		for(i=0; i<productNames.length; i++) {
			System.out.println(productNames[i]);
		}
		
	}

}
