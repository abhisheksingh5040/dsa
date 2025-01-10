package binarySearch;

/**
 * Time complexity : O(log(N))
 * Space complexity : O(log(N))
 */
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50, 60};
        int target = 20;
        int low = 0, high = input.length - 1;
        int index = binarySearch(input, low, high, target);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
        // base condition
        if (low > high) return -1;

        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return binarySearch(arr, low, mid - 1, target);
        else return binarySearch(arr, mid + 1, high, target);
    }
}
