package com.experion.assignment;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		int temp;
		
		System.out.println("Enter 3 numbers: ");
		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {     
            for (int j = i+1; j < array.length; j++) {     
               if(array[i] < array[j]) {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;   
               }
            }
        }
		System.out.print("Descending Order : ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}
}
