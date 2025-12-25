package lk.ijse.aad.examples;

import java.util.Arrays;
import java.util.List;

public class ForEachLoopExample {
    public static void main(String[] args) {

        // Iterating through a one-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Iterating through array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println();

        // Iterating through a collection (List)
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        System.out.println("Iterating through collection:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        // Iterating through a two-dimensional array
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("Iterating through 2D array:");
        for (int[] row : matrix) { // Outer loop for each row
            for (int value : row) {  // Inner loop for each value in the row
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
