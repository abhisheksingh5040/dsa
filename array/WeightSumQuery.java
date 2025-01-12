package array;

import java.util.Arrays;

public class WeightSumQuery {
    public static void main(String[] args) {
        int[] input = {2, 3, 5, 4, 6, 1};
        int n = input.length;
        int[] prefix = new int[n];

        prefix[0] = input[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] +(i + 1) * input[i];
        }

        int sum = getWSum(prefix, 2, 3);
        System.out.println(sum);
    }

    public static int getWSum(int[] arr, int start, int end) {
        return start == 0 ? arr[end] : arr[end] - arr[start - 1];
    }
}
