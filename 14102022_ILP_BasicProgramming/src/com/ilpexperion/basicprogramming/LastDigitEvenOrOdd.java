package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class LastDigitEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int Number;
		
		System.out.println("Enter the Number : ");
		Number = scanner.nextInt();
		
		
		if(Number%2 == 0) {
			System.out.println("The last digit is Even");
		}
		else {
			System.out.println("The last digit is Odd");
		}

	}

}
