package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50, 60};
        int n = input.length;
        int target = 20;
        int index = binarySearch(input, n, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
