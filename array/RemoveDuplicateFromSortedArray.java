package array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] input = {10, 20, 20, 30, 30, 30, 30, 90};
        int n = input.length;
        removeDuplicate(input, n);
        System.out.println(Arrays.toString(input));
    }

    public static void removeDuplicate(int[] arr, int n) {
        int res = 1;

        for (int i = 1; i < n; i++) {
            if (arr[res - 1] != arr[i]) {
               arr[res] = arr[i];
               res++;
            }
        }
    }
}
