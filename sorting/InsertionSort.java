package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 6, 5, 3, 4, 8, 9, 6};
        int n = arr.length;
        naiveSolution(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void naiveSolution(int[] arr, int n) {
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            arr[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
