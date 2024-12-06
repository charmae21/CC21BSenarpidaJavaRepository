package com.mycompany.cc21brestaurantordersystem;

/* Senarpida, Charmae A.
   CC2-1B
   Laboratory Challenge No. 5: Restaurant Order System
   Submitted on October 14, 2024
*/

import java.util.Scanner;

public class CC21BRestaurantOrderSystem {
    
public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Declaration
        int quantity;
        double price = 0, totalAmount;
        String item = "";
        
        // Display the menu
        System.out.println("MENU");
        System.out.println("1. Burger    - PHP 100");
        System.out.println("2. Fries     - PHP  50");
        System.out.println("3. Soda      - PHP  30");
        System.out.println("4. Ice Cream - PHP  45");
        System.out.println("5. Exit");
        
        // Ask the user for their menu selection
        System.out.print("Enter the menu number of your choice: ");
        int choice = sc.nextInt();
        
        // Switch statement
        switch (choice) {
            case 1:
                item = "Burger";
                price = 100;
                break;
            case 2:
                item = "Fries";
                price = 50;
                break;
            case 3:
                item = "Soda";
                price = 30;
                break;
            case 4:
                item = "Ice Cream";
                price = 45;
                break;
            case 5:
                System.out.println("Exiting...");
                return;  // Exit the program
            default:
                System.out.println("Invalid choice.");
                return;  // Exit the program if an invalid choice is made
        }
        
        // Quantity
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();
        
        // Calculate the total amount
        totalAmount = price * quantity;
        
        // Order details and total amount
        System.out.println("You ordered " + quantity + " " + item + ".");
        System.out.printf("Total amount: %.0f PHP%n", totalAmount);
        
        // Close the scanner
        sc.close();
    }
}
