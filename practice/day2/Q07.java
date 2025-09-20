package practice.day2;

import java.util.Arrays;

//Q07 Reverse an array in place.
public class Q07 {
    public static void main(String[] args) {
        int[] input = {1, 6, 4, 3, 8, 9, 3};
        reverseArray(input);
        System.out.println(Arrays.toString(input));
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
