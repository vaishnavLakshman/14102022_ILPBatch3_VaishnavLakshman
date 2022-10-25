package com.experion.basicprogramming;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		char variable;
		System.out.println("Enter the character : ");
		variable = scanner.next().charAt(0);
		
		switch(variable) {
		
			case 'a' : System.out.println(variable +" is a vowel");
			break;
			case 'e' : System.out.println(variable +" is a vowel");
			break;
			case 'i' : System.out.println(variable +" is a vowel");
			break;
			case 'o' : System.out.println(variable +" is a vowel");
			break;
			case 'u' : System.out.println(variable +" is a vowel");
			break;
			default : System.out.println("Not a vowel");
		}
		//use fall through and replace all s.o.ps with a single s.o.p
		

	}

}
