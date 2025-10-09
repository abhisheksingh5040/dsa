package array;

import java.util.Arrays;

public class MoveZeroToEnd {
    // we have to maintain order of the element as it is
    public static void main(String[] args) {
        int[] input = {8, 5, 0, 10, 0, 20};
        int n = input.length;

        naiveSolution(input, n);
        optimizeSolution1(input, n);
        System.out.println(Arrays.toString(input));
    }

    public static void naiveSolution(int[] arr, int n) {
        int[] res = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                res[k++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(res));
    }

    public static void optimizeSolution(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void optimizeSolution1(int[] arr, int n) {
        int end = n - 1, start = 0;

        while (start <= end) {
            if (arr[start] == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            }else{
                start++;
            }
        }
    }
}
