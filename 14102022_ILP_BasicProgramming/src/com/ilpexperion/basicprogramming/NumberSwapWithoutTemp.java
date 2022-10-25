package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class NumberSwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNum;
		int secondNum;
		
		System.out.println("Enter the first Number : ");
		firstNum = scanner.nextInt();
		System.out.println("Enter the second Number : ");
		secondNum = scanner.nextInt();
		
		System.out.println("The first number is : "+firstNum);
		System.out.println("The second number is : "+secondNum);
		
		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		
		System.out.println("The first number is : "+firstNum);
		System.out.println("The second number is : "+secondNum);
		

	}

}
