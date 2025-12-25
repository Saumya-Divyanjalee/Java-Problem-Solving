package lk.ijse.aad.examples;

public class FindElementExample {

    // Method to find the index of a target element in an array
    public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // Element found, return its index
                return i; // Exits both method and loop
            }
        }
        // Element not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int target = 30;
        int index = findElement(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Test with an element that does not exist
        target = 60;
        index = findElement(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

