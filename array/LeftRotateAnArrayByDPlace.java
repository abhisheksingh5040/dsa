package array;

import java.util.Arrays;

public class LeftRotateAnArrayByDPlace {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int n = input.length;
        int d = 2;

        rotate(input,n,d);
        System.out.println(Arrays.toString(input));
    }

    public static void rotate(int[] arr, int n, int d) {
        swap(arr, 0, d - 1);
        System.out.println(Arrays.toString(arr));
        swap(arr, d, n - 1);
        System.out.println(Arrays.toString(arr));
//        swap(arr, 0, n - 1);
//        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int start, int end) {

        for (int i = start; i <= (end - start) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[end - start];
            arr[end - start] = temp;
        }
    }
}
