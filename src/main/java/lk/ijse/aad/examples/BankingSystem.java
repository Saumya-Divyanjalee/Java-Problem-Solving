package lk.ijse.aad.examples;

import java.util.*;

// Class to represent a banking transaction
class Transaction {
    String type;    // Type of transaction: "deposit" or "withdrawal"
    double amount;  // Amount of the transaction

    // Constructor to initialize transaction
    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        // Create a list of sample transactions
        List<Transaction> transactions = Arrays.asList(
                new Transaction("deposit", 1000),
                new Transaction("withdrawal", 500),
                new Transaction("deposit", 200),
                new Transaction("withdrawal", 300)
        );

        double balance = 0;  // Initial balance

        // Process each transaction
        for (Transaction t : transactions) {
            if (t.type.equals("deposit")) {
                balance += t.amount;  // Add deposit amount
            } else if (t.type.equals("withdrawal")) {
                balance -= t.amount;  // Subtract withdrawal amount
            } else {
                System.out.println("Unknown transaction type: " + t.type);
            }

            // Print the balance after each transaction
            System.out.println("After " + t.type + " of Rs." + t.amount +
                    ", balance: Rs." + balance);
        }
    }
}
