package com.experion.assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class SumOfSeriesFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter the limit: ");
		n = scanner.nextInt();
		int firstTerm = 1, secondTerm = 1;
		int tempSum = 1;
	    for (int nextTerm = 0; nextTerm < n;) 
	    {
	      
	      nextTerm = firstTerm + secondTerm;
	      tempSum += Math.pow(nextTerm, 3);
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	    
	    System.out.println(tempSum);

	}
}
