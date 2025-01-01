package array;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int[] input = {8, 5, 35, 10, 30, 20};
        int n = input.length;

        rotate(input, input.length);
        System.out.println(Arrays.toString(input));
    }

    public static void rotate(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }
}
