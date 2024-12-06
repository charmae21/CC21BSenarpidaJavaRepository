public class SimpleConsoleBasedInvoice {
    public static void main(String[] args) {
        // Store information
        System.out.println("Charmae's Coffee Shop\n44 Liteng Pacdal\nBaguio City\n");

        // Itemized list of purchased items
        System.out.println("Item\t\tQuantity\tPrice");
        System.out.println("-----------------------------------------");
        System.out.println("Espresso\t2\t\t$5.00");
        System.out.println("Latte\t\t1\t\t$4.50");
        System.out.println("Cappuccino\t1\t\t$4.75");
        System.out.println("Muffin\t\t3\t\t$9.00\n");

        // Total amount due
        System.out.print("Total Amount Due:\t\t");
        System.out.println("$23.25\n");

        // Thank you message
        System.out.println("Thank you!");
    }
}
  