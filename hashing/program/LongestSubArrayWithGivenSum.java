package hashing.program;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] input = {8, 3, 1, 5, -6, 6, 2, 2};
        int sum = 4;

        int naiveSolution = naiveSolution(input, sum);
        System.out.println(naiveSolution);

        int optimizeApproach = optimizeApproach(input, sum);
        System.out.println(optimizeApproach);
    }

    /**
     * Time complexity : Theta(n^2)
     * Space complexity : Theta(1)
     */
    public static int naiveSolution(int[] arr, int sum) {
        int n = arr.length;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];

                if (currentSum == sum) {
                    int count = j - i + 1;
                    maxCount = Math.max(count, maxCount);
                }
            }
        }

        return maxCount;
    }

    public static int optimizeApproach(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == sum) result = i + 1;

            //if prefix sum is already resent we are not going to replace it
            if (!map.containsKey(prefixSum)) map.put(prefixSum, i);
            if (map.containsKey(prefixSum - sum)) {
                Integer index = map.get(prefixSum - sum);
                result = Math.max(result, i - index);
            }
        }

        return result;
    }
}
