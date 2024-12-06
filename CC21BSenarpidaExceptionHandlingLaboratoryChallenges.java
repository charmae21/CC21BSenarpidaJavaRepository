
package com.mycompany.cc21bsenarpidaexceptionhandlinglaboratorychallenges;

/* Senarpida, Charmae A.
   CC2-1B
   Final Challenge No. 5: Exception Handling Laboratory Challenges
*/

import java.util.Scanner;

// Custom Exception: InvalidQuantityException
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class ShoppingCart {
    private int availableStock;

    // Constructor to initialize the available stock
    public ShoppingCart(int availableStock) {
        this.availableStock = availableStock;
    }

    // Method to process the order
    public void processOrder(int quantity) throws InvalidQuantityException {
        // Check if quantity is negative
        if (quantity < 0) {
            throw new InvalidQuantityException("Quantity cannot be negative.");
        } 
        // Check if quantity exceeds available stock
        else if (quantity > availableStock) {
            throw new InvalidQuantityException("Not enough stock available. Only " + availableStock + " items left.");
        }
        // If valid, process the order
        System.out.println("Order processed for quantity: " + quantity);
    }

    // Method to check available stock
    public void checkStock() {
        System.out.println("Available stock: " + availableStock);
    }
}

public class CC21BSenarpidaExceptionHandlingLaboratoryChallenges {
    public static void main(String[] args) {
        // Create a shopping cart with 10 available items
        ShoppingCart cart = new ShoppingCart(10);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for product quantity
        System.out.print("Enter the quantity of items you want to buy: ");
        int quantity = scanner.nextInt();

        // Example of valid and invalid order processing
        try {
            cart.checkStock();
            cart.processOrder(quantity);  // Valid or invalid order based on input
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}

