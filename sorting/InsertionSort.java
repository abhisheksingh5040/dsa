package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 8, 7, 6, 1};
        int n = arr.length;

        int[] result = sortWithUsingExtraSpace(arr, n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortWithUsingExtraSpace(int[] arr, int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int minVal = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minVal] < arr[j]) {
                    minVal = j;
                }
            }
            result[i] = arr[minVal];
            arr[minVal] = Integer.MIN_VALUE;
        }
        return result;
    }
}
