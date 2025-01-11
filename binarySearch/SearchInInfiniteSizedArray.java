package binarySearch;

import java.util.Arrays;

public class SearchInInfiniteSizedArray {
    public static void main(String[] args) {
        int[] input = {1, 10, 15, 20, 40, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170};
        int target = 20;
        int naiveSolution = naiveSolution(input, target);
        System.out.println(naiveSolution);

        int optimizeSolution = optimizeSolution(input, target);
        System.out.println(optimizeSolution);
    }

    /**
     * Time Complexity : O(position)
     */

    public static int naiveSolution(int[] arr, int target) {
        int i = 0;

        while (true) {
            if (arr[i] == target) {
                return i;
            } else if (arr[i] > target) {
                return -1;
            } else {
                i++;
            }
        }
    }

    //unbounded binary search
    public static int optimizeSolution(int[] arr, int target) {
        if (arr[0] == target) return 0;
        int i = 1;
        while (arr[i] <= target) {
            if (arr[i] == target) return i;
            else i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, i, target);
    }
}
