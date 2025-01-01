package array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 9};
        int n = input.length;

        reverseArray(input,n);
        System.out.println(Arrays.toString(input));
    }

    public static void reverseArray(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}
