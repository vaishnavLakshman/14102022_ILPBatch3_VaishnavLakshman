package com.experion.assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class SumOfSeries_Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit = scanner.nextInt();
		double sum = 0;
		
		for(int i=1;i<=limit;i++)
		{    
			sum+= i/Factorial((i*i));
		}    
		  System.out.println(sum);    
	}

	public static int Factorial(int tempNum)
	{
		int fact = 1;
		for(int i=1; i<=tempNum; i++) 
		{
			fact = fact*i;
		}
		return fact;
	}
}
