package binarySearch;

public class CountOccurrenceInSorted {
    public static void main(String[] args) {
        int[] input = {1, 10, 10, 10, 20, 20, 40};
        int target = 10;
        int n = input.length;
        int occurrence = countOccurrence(input, n, target);
        System.out.println(occurrence);
    }

    public static int countOccurrence(int[] arr, int n, int target) {
        int indexOfFirstOccurrence = indexOfFirstOccurrence(arr, n, target);
        int indexOfLastOccurrence = indexOfLastOccurrence(arr, n, target);

        return indexOfLastOccurrence - indexOfFirstOccurrence + 1;
    }

    public static int indexOfFirstOccurrence(int[] arr, int n, int target) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int indexOfLastOccurrence(int[] arr, int n, int target) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
