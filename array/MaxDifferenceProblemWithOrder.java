package array;

import java.util.Arrays;

/**
 * Maximum value of arr[j] - arr[i] such that j > i
 */
public class MaxDifferenceProblemWithOrder {
    public static void main(String[] args) {
        int[] input = {2, 3, 10, 6, 4, 8, 1};
        int[] input2 = {10, 20, 30};
        int n = input2.length;

        naiveSolution(input2, n);
    }

    //Time complexity : Theta(n)
    public static void naiveSolution(int[] arr, int n) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[j] - arr[i];

                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }

    public static void optimizeSolution(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.println(arr[n - 1] - arr[0]);
    }
}
