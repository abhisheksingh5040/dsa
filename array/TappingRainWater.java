package array;

import java.util.Arrays;

public class TappingRainWater {
    public static void main(String[] args) {
        //int[] input = {3, 0, 1, 2, 5};
        int[] input = {1, 2, 3};
        int n = input.length;

        int rainWater = naiveSolution(input, n);
        int optimizeSolution = optimizeSolution(input, n);
        System.out.println(rainWater);
        System.out.println(optimizeSolution);
    }

    public static int naiveSolution(int[] arr, int n) {
        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];

            //check left side max
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            //check right side max
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            result += Math.min(leftMax, rightMax) - arr[i];
        }

        return result;
    }

    public static int optimizeSolution(int[] arr, int n) {
        int result = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i], left[i - 1]);
        }

        for (int i = n - 2; i > 0; i--) {
            right[i] = Math.max(right[i], right[i + 1]);
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for (int i = 1; i < n - 1; i++) {
            result += Math.min(left[i],right[i]) - arr[i];
        }
        return result;
    }
}
