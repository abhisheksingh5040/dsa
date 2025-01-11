package binarySearch;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] input = {10, 20, 40, 60, 5, 8};
        int target = 5;

        int search = search(input, target);
        System.out.println(search);
    }

    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[low] <= arr[mid]) { // left half is sorted
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {//right half is sorted
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
