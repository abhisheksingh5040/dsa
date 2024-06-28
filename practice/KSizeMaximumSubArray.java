package practice;

public class KSizeMaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;
        int n = arr.length;
        int maxedSubArray = maxSubArray(arr, k, n);
        System.out.println(maxedSubArray);
    }

    public static int maxSubArray(int[] arr, int k, int n) {
        if (n < k) {
            return -1;
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
