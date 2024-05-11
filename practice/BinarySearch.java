package practice;

public class BinarySearch {

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearchRecursive(arr, target, mid + 1, right); // Search in the right half
        }
    }

    // Iterative implementation of binary search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] > target) {
                right = mid - 1; // Search in the left half
            } else {
                left = mid + 1; // Search in the right half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;

        int indexRecursive = binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("Using Recursive Binary Search:");
        if (indexRecursive != -1) {
            System.out.println("Element " + target + " found at index " + indexRecursive);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        int indexIterative = binarySearchIterative(arr, target);
        System.out.println("Using Iterative Binary Search:");
        if (indexIterative != -1) {
            System.out.println("Element " + target + " found at index " + indexIterative);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
