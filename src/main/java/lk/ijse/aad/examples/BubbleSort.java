package lk.ijse.aad.examples;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        // Bubble Sort using nested loops
        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;
            // Tracks if any swap happens in this pass

            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Compare adjacent elements

                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if the array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Method to print the array elements
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

