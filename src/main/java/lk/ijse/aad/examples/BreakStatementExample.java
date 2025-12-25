package lk.ijse.aad.examples;

public class BreakStatementExample {

    public static void main(String[] args) {
        // Example 1: Find the first number divisible by 7
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                // When the first number divisible by 7 is found
                System.out.println("First number divisible by 7: " + i);
                break; // Exit the loop immediately
            }
        }

        System.out.println(); // Blank line for separation

        // Example 2: Breaking from nested loops using a label

        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    // Break out of both loops when condition is met
                    break outerLoop;
                }

                System.out.println(i + ", " + j);
            }
        }
    }
}

