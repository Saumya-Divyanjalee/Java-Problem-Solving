package lk.ijse.aad.examples;

public class PrimeNumbers {

    // Method to check whether a number is prime
    public static boolean isPrime(int num) {

        // Numbers less than or equal to 1 are not prime
        if (num <= 1) return false;

        // 2 is the only even prime number
        if (num == 2) return true;

        // Eliminate other even numbers
        if (num % 2 == 0) return false;

        // Check only odd divisors up to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }

    public static void main(String[] args) {

        System.out.println("First 20 prime numbers:");

        int count = 0; // Counts how many primes are found
        int num = 2;   // Starting number to check

        // Continue until 20 prime numbers are printed
        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

