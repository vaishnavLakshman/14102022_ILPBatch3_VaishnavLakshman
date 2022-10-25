package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int firstNum;
		int secondNum;
		int thirdNum;
		
		System.out.println("Enter the first Number : ");
		firstNum = scanner.nextInt();
		System.out.println("Enter the second Number : ");
		secondNum = scanner.nextInt();
		System.out.println("Enter the third Number : ");
		thirdNum = scanner.nextInt();
		
		if((firstNum > secondNum) && (firstNum < thirdNum)) {
			System.out.println(firstNum +" is the second smallest number");
			
		}
		else if((secondNum > firstNum) && (secondNum < thirdNum)) {
			System.out.println(secondNum +" is the second smallest number");
		}
		else {
			System.out.println(thirdNum +" is the second smallest number");
		}

	}

}
