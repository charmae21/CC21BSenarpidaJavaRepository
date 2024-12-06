package com.mycompany.cc21bpasswordvalidationsystem;

/* Senarpida, Charmae A.
   CC2-1B
   Laboratory Challenge No. 7: Password Validation System
   Submitted on October 14, 2024
*/

import java.util.Scanner;

public class CC21BPasswordValidationSystem {

    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
      
        String password;
        
        // Loop until a valid password is entered
        while (true) {
            // Ask the user to input a password
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            
            // Validate the password based on criteria
            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break;  // Exit the loop when the password is valid
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }
        
        // Close the scanner
        sc.close();
    }

    // Method to check if the password meets the required criteria
    public static boolean isValidPassword(String password) {
        // Check if the password is at least 8 characters long
        if (password.length() < 8) {
            return false;
        }
        
        // Declarations
        boolean hasUppercase = false;
        boolean hasNumber = false;
        
        // Loop through each character to check if it contains an uppercase letter and a number
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            
            // If both conditions are met, no need to continue checking
            if (hasUppercase && hasNumber) {
                return true;
            }
        }

        // Return false if any condition is not met
        return false;
    }
}