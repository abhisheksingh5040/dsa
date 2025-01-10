package array;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] input = {2, 3, -8, 7, -1, 2, 3};
        int n = input.length;
        naiveSolution(input, n);
        optimizeSolution(input, n);
    }

    /**
     * Time complexity : O(N ^ 2)
     * Space complexity : O(1)
     */
    public static void naiveSolution(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            int current = 0;
            for (int j = i; j < n; j++) {
                current += arr[j];
                max = Math.max(current, max);
            }
        }
        System.out.println(max);
    }

    /**
     * Time Complexity : O(N)
     * Space Complexity : O(1)
     */
    public static void optimizeSolution(int[] arr, int n) {
        int max = arr[0], res = 0;

        for (int i = 1; i < n; i++) {
            max = Math.max(max + arr[i], arr[i]);
            res = Math.max(res, max);
        }

        System.out.println(res);
    }
}
