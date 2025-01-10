package binarySearch;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        int[] input = {1, 10, 10, 10, 20, 20, 40};
        int target = 20;
        int index = indexOfFirstOccurrence(input, target);
        System.out.println(index);
    }

    public static int indexOfFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
