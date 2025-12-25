package lk.ijse.aad.examples;

import java.util.Scanner;

public class InputValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner object to read input from the user

        int attempts = 0;
        // Tracks the number of attempts made

        int maxAttempts = 3;
        // Maximum allowed attempts

        boolean isValid = false;
        // Flag to check if the password is valid

        while (attempts < maxAttempts && !isValid) {
          // Loop continues while attempts remain and password is invalid

            System.out.print("Enter password (min 8 characters): ");
            String password = scanner.nextLine();
            // Read password input

            if (password.length() >= 8) {
                // Check password length
                System.out.println("Password accepted!");
                isValid = true;
            } else {
                attempts++;
                System.out.println(
                        "Invalid! Attempts remaining: "
                                + (maxAttempts - attempts)
                );
            }
        }

        if (!isValid) {
            // Executed when all attempts are used
            System.out.println("Maximum attempts reached. Access denied.");
        }


    }
}
