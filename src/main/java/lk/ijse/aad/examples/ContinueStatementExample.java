package lk.ijse.aad.examples;

public class ContinueStatementExample {

    public static void main(String[] args) {


        // Example 1: Print only odd numbers from 1 to 10

        System.out.println("Odd numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // If the number is even, skip this iteration
                continue;
            }
            // This will only execute for odd numbers
            System.out.println(i);
        }

        System.out.println(); // Blank line for separation


        // Example 2: Skip specific values (skip i = 3)

        System.out.println("Processing numbers 1 to 5, skipping 3:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // Skip the iteration when i is 3
                continue;
            }
            System.out.println("Processing: " + i);
        }
    }
}

