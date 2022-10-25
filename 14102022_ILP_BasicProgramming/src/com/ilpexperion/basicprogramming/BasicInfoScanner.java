package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class BasicInfoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String heading = "*************Welcome to ILP Program*************";
		String employeeName;
		int employeeAge;
		char employeeGender;
		double employeeCgpa;
		
		System.out.println("Enter your employee name : ");
		employeeName = scanner.nextLine();
		System.out.println("Enter your age : ");
		employeeAge = scanner.nextInt();
		System.out.println("Enter your gender : ");
		employeeGender = scanner.next().charAt(0);
		System.out.println("Enter your CGPA : ");
		employeeCgpa = scanner.nextDouble();
		System.out.println(heading);
		System.out.println("Name"+"		       "+"Age"+"	"+"Gender"+"	"+"CGPA");
		System.out.println(employeeName+"	"+employeeAge+"	"+employeeGender+"	"+employeeCgpa);

	}

}
