package binarySearch;

public class IndexOfLastOccurrence {
    public static void main(String[] args) {
        int[] input = {1, 10, 10, 10, 20, 20, 40};
        int target = 1;
        int index = indexOfLastOccurrence(input, target);
        System.out.println(index);
    }

    private static int indexOfLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
