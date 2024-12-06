package com.mycompany.cc21bgrocerystorediscountcalculator;

/* Senarpida, Charmae A.
   CC2-1B
   Laboratory Challenge No. 4: Grocery Store Discount Calculator (Using if-else)
   Submitted on October 14, 2024
*/

import java.util.Scanner;

public class CC21BGroceryStoreDiscountCalculator {
    public static void main(String[] args) {
        // Declaration
        double Amount, discount;
        
        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
 
        // Ask the user for the total purchase amount
        System.out.print("Enter the total purchase amount: PHP ");
        Amount = sc.nextDouble();

        // Variables for discount and final price
        discount = 0;
        double finalPrice;

        // Apply discount based on the purchase amount
        if (Amount >= 1000 && Amount <= 5000) {
            discount = 5;
        } else if (Amount > 5000 && Amount <= 10000) {
            discount = 10;
        } else if (Amount > 10000) {
            discount = 15;
        }

        // Calculate the final price after applying the discount
        finalPrice = Amount - (Amount * discount / 100);

        // Display the discount and final price
        if (discount > 0) {
            System.out.printf("Discount applied: %.0f%%%n", discount);
        } else {
            System.out.println("No discount applied.");
        }
        
        // Use printf to format the output without .0 if the number is whole
        System.out.printf("Final price after discount: PHP %.0f%n", finalPrice);
        
        System.out.println("-------------------------------------------------");
        
        // Close the scanner
        sc.close();
    }
}


