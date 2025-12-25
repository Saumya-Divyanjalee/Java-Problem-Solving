package lk.ijse.aad.examples;

public class NestedLoopExamples {

    public static void main(String[] args) {


        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 5; i++) { // Outer loop (rows)
            for (int j = 1; j <= 5; j++) { // Inner loop (columns)
                System.out.print((i * j) + "\t");
            }
            System.out.println();// Move to next line after each row
        }

        System.out.println(); // Blank line


        System.out.println("Star Pattern:");

        for (int i = 1; i <= 5; i++) {// Controls number of rows
            for (int j = 1; j <= i; j++) {// Prints stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}

