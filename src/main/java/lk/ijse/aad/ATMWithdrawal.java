package lk.ijse.aad;

// Import Scanner class to get user input
import java.util.Scanner;

class ATMWithdrawal {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Ask user to enter withdrawal amount
        System.out.println("Enter withdrawal amount: RS.");
        int amount = sc.nextInt();   // Read entered amount

        // Call withdrawCash method and pass amount
        withdrawCash(amount);
    }

    // Method to calculate and display note breakdown
    private static void withdrawCash(int amount) {

        // Available ATM notes
        int[] notes = {1000, 500, 100, 50, 20, 10};

        // Array to store number of notes for each denomination
        int[] noteCount = new int[notes.length];

        // Display withdrawal amount
        System.out.println("Withdrawal amount: RS." + amount);

        // Loop through each note denomination
        for (int i = 0; i < noteCount.length; i++) {

            // Check if current note can be used
            if (amount >= notes[i]) {

                // Calculate number of notes needed
                noteCount[i] = amount / notes[i];

                // Update remaining amount
                amount = amount % notes[i];
            }
        }

        // Display note breakdown
        System.out.println("\nNotes breakdown: ");

        // Loop to print only used notes
        for (int i = 0; i < noteCount.length; i++) {

            // Print only if at least one note is used
            if (noteCount[i] > 0) {

                // Print note value, count, and total value
                System.out.println(
                        "RS. " + notes[i] + " x " + noteCount[i]
                                + " = RS." + (notes[i] * noteCount[i])
                );
            }
        }
    }
}
