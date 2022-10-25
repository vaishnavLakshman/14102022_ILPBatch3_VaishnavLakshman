package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNum;
		int secondNum;
		int tempNum;
		
		System.out.println("Enter the first Number : ");
		firstNum = scanner.nextInt();
		System.out.println("Enter the second Number : ");
		secondNum = scanner.nextInt();
		
		System.out.println("The first number is : "+firstNum);
		System.out.println("The second number is : "+secondNum);
		
		tempNum = firstNum;
		firstNum = secondNum;
		secondNum = tempNum;
		
		System.out.println("The first number is : "+firstNum);
		System.out.println("The second number is : "+secondNum);
		

	}

}
