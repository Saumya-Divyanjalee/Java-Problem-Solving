package lk.ijse.aad.examples;
// Package declaration – used to organize classes into a namespace

import java.util.Scanner;
// Import Scanner class to read user input from the keyboard

public class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Create a Scanner object to read input from System.in

        int choice;
        // Variable to store the user's menu choice

        do {
            // do-while loop ensures the menu is displayed at least once

            System.out.println("\n===== MENU =====");
            // Display menu title

            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Exit");
            // Display menu options

            System.out.print("Enter choice: ");
            // Prompt the user to enter a choice

            choice = scanner.nextInt();
            // Read the user's choice as an integer

            switch (choice) {
                // Switch statement to execute code based on user choice

                case 1:
                    System.out.println("Adding...");
                    // Code executed when user selects option 1
                    break;

                case 2:
                    System.out.println("Deleting...");
                    // Code executed when user selects option 2
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    // Code executed when user selects option 3 (exit)
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    // Executed when user enters an invalid option
            }

        } while (choice != 3);
        // Loop continues until the user selects option 3 (Exit)

        // End of program
    }
}
