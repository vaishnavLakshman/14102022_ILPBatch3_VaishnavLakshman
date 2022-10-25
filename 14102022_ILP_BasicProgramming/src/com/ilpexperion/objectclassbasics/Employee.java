package com.ilpexperion.objectclassbasics;

public class Employee {
	
	String employeeName = "Vaishnav Lakshman";
	int employeeAge = 22;
	char employeeGender = 'M';
	double employeeCgpa = 7.0;
	
	public void displayEmployeeDetails() {
		System.out.println("*************Welcome to ILP Program*************");
		System.out.println("Name"+"		       "+"Age"+"	"+"Gender"+"	"+"CGPA");
		System.out.println(employeeName+"	"+employeeAge+"	"+employeeGender+"	"+employeeCgpa);

	}

}
