package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
				
		boolean userChoice;
		Scanner scanner = new Scanner(System.in);
        int choice;
        int x=0;
        System.out.println("********SUPER MARKET MANAGEMENT************");
        System.out.println("MENU\n 1.ADD STOCK\n 2.DISPLAY STOCK\n 3.EXIT");
        System.out.println("Enter Choice =");
        choice=scanner.nextInt();
        
 
           switch(choice){
	           
	        	   
	           
	           case 1:
	            	do {
	            		Service.inputProductDetails();
	            		System.out.println("Do you want to continue adding products?(true(1)/false(0))");
	        			userChoice = scanner.nextBoolean();
	        		
	            		}
	            	while (userChoice==true);
	                break;
	            case 2:
	                Service.displayProductDetails();
	                break;
	            default:System.out.println("Invalid Choice");
	                break;
	           } 
        

	}

}
