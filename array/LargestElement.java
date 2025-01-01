package array;

public class LargestElement {
    public static void main(String[] args) {

        int[] input = {5, 8, 20, 10};
        int largestElement = largestElement(input, input.length);
        System.out.println(largestElement);
    }

    /**
     * Time complexity : O(n)
     * Space Complexity : O(1)
     */
    public static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }

        return max;
    }
}
