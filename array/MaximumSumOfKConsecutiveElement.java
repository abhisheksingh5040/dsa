package array;

//sliding window technique
public class MaximumSumOfKConsecutiveElement {
    public static void main(String[] args) {
        int[] input = {1, 8, 30, -5, 20, 7};
        //int[] input = {5, -10, 6, 90, 3};
        int n = input.length;
        int k = 3;
        int sum = maximumConsecutiveSum(input, n, k);
        System.out.println(sum);
    }

    public static int maximumConsecutiveSum(int[] arr, int n, int k) {
        int maxSum = 0, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = Math.max(maxSum, sum);
        int point = 0;
        for (int i = k; i < n; i++) {
            sum -= arr[point];
            point++;
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
