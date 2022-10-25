package com.experion.utility;



import java.util.ArrayList;
import java.util.Scanner;



import com.experion.entity.Product;
import com.experion.service.Service;



public class ProductUtility {



   public static void main(String[] args)throws Exception {
        char mainChoice;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<Product>();
        do {
            System.out.println("1.Create product     2.Display product    3.Purchase Product");
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
                productList.add(Service.createProduct());
                break;
            case 2:
                Service.displayProductDetails(productList);
                break;
            case 3:
                 Service.purchaseProduct(productList);
                    break;
            }
            System.out.println("Do you want to contine(y/n)");
            mainChoice = scanner.next().charAt(0);
        } while (mainChoice == 'y');



   }



}