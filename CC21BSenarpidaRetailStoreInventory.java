
package com.mycompany.cc21bsenarpidaretailstoreinventory;

/* Senarpida, Charmae A.
   CC2-1B
   11/20/2024
   Final Challenge No. 1: Retail Store Inventory Management (1D array)
*/

public class CC21BSenarpidaRetailStoreInventory {
    public static void main(String[] args) {
        // Array for product names
        String[] productNames = {
            "Apples 1000g", "Bananas 1000g", "Goya Rich Choco Spread 350g", "Pride Detergent Powder 2000g", 
            "Bounty Fresh Medium Premium Eggs 12s", "Magnolia All-Purpose Flour 800g", 
            "Grapes 1000g", "Clara Ole Original Pancake Syrup 355mL", 
            "Selecta Cookies & Cream Ice Cream 1400mL", "Tang Orange Juice 375g"
        };

        // Array for stock levels (how many are available)
        int[] stockLevels = {30, 20, 50, 10, 60, 15, 40, 25, 18, 12};

        // Array for product prices (in pesos)
        double[] productPrices = {150.0, 75.0, 154.0, 195.0, 135.0, 100.0, 270.0, 139.0, 250.0, 333.0};

        // Variable to hold the total value of all products
        double totalStockValue = 0;

        // Calculate the total value by multiplying stock with price for each product
        for (int i = 0; i < stockLevels.length; i++) {
            totalStockValue += stockLevels[i] * productPrices[i];
        }

        // Print the header
        System.out.println("===========================================================================");
        System.out.println("\t          CHARMAE'S RETAIL STORE INVENTORY          \t");
        System.out.println("===========================================================================");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "Product Name", "Stock", "Price", "Value");
        System.out.println("---------------------------------------------------------------------------");

        // Print the stock, price, and value for each product
        for (int i = 0; i < stockLevels.length; i++) {
            System.out.printf("%-40s %-10d %-10.2f %-10.2f\n",
                productNames[i], stockLevels[i], productPrices[i], stockLevels[i] * productPrices[i]);
        }

        // Print the footer with total value of all items in stock
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-40s %-10s %-10s %-10.2f\n", "TOTAL", "", "", totalStockValue);
        System.out.println("===========================================================================");
    }
}

