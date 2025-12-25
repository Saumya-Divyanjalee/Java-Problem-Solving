package lk.ijse.aad;

import java.util.Scanner;               // Import Scanner class to read user input
import static java.lang.Integer.MAX_VALUE; // Import MAX_VALUE for large integer

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.println("Enter units consumed: ");
        int units = sc.nextInt();             // Read the number of units consumed from user

        System.out.println("...........................");
        double total = calculateBill(units);  // Call calculateBill method to get total bill
        System.out.println("............................");
        System.out.println("Total bill is: " + total); // Print the total bill
    }

    // Method to calculate electricity bill based on slabs
    private static double calculateBill(int units) {
        double bill = 0;  // Variable to store total bill

        // Define slabs as 2D array: {upper limit of slab, rate per unit}
        // Last slab uses MAX_VALUE to cover all units above 300
        int[][] slabs = {{100, 0}, {200, 5}, {300, 10}, {MAX_VALUE, 15}};

        int previousLimit = 0;  // Keep track of previous slab limit

        // Loop through each slab
        for (int[] slab : slabs) {
            int limit = slab[0]; // Upper limit of current slab
            int rate = slab[1];  // Rate per unit for current slab

            // Check if there are units to charge in this slab
            if (limit > previousLimit) {
                // Calculate number of units in this slab
                int unitInSlab = Math.min(units, limit) - previousLimit;

                // Add cost of this slab to total bill
                bill += unitInSlab * rate;

                // Print slab-wise breakdown
                System.out.println(unitInSlab + " units @ Rs. " + rate +
                        " = Rs. " + (unitInSlab * rate));
            }

            // Update previous limit for next iteration
            previousLimit = limit;

            // Stop loop if all units are processed
            if (units <= limit) break;
        }

        return bill; // Return total bill
    }

}
