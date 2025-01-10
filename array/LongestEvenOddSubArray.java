package array;

/**
 * Alternate element have to be even then odd
 */
public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int[] input = {10, 12, 14, 7, 8, 8};
//        int[] input = {10, 12, 8, 4};
        int n = input.length;
        naiveSolution(input, n);
        optimizeSolution(input, n);
    }

    /**
     * Time complexity : O(N ^ 2)
     * Space complexity : O(1)
     */
    public static void naiveSolution(int[] arr, int n) {
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            boolean flag = arr[i] % 2 == 0 ? true : false;
            for (int j = i + 1; j < n; j++) {
                if (flag) {
                    if (arr[j] % 2 != 0) {
                        count++;
                        flag = false;
                    } else {
                        break;
                    }
                } else {
                    if (arr[j] % 2 == 0) {
                        count++;
                        flag = true;
                    } else {
                        break;
                    }
                }
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }

    /**
     * Time Complexity : O(N)
     * Space complexity : O(1)
     */
    public static void optimizeSolution(int[] arr, int n) {
        int count = 1, maxCount = 1;

        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 1;
            }
        }

        System.out.println(maxCount);
    }
}
