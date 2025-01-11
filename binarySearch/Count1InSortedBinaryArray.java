package binarySearch;

public class Count1InSortedBinaryArray {
    public static void main(String[] args) {
        int[] input = {0, 0, 0, 1, 1, 1, 1, 1};
        int n = input.length;
        int occurrence = countOccurrence(input, n);
        System.out.println(occurrence);
    }

    public static int countOccurrence(int[] arr, int n) {
        int indexOfFirstOccurrence = indexOfFirstOccurrence(arr, n);
        return n - indexOfFirstOccurrence;
    }

    public static int indexOfFirstOccurrence(int[] arr, int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                if (mid == 0 || arr[mid - 1] == 0) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}
