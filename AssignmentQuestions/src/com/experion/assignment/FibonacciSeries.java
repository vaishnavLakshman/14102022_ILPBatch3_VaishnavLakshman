	package com.experion.assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter the limit: ");
		n = scanner.nextInt();
		ArrayList<Integer> fibonacciSeries = new ArrayList<Integer>();
		int firstTerm = 0, secondTerm = 1;
		fibonacciSeries.add(firstTerm);
		fibonacciSeries.add(secondTerm);
	    for (int nextTerm = 0; nextTerm < n;) 
	    {	      
	      nextTerm = firstTerm + secondTerm;
	      fibonacciSeries.add(nextTerm);
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	    
	    System.out.println(fibonacciSeries);

	}
}
