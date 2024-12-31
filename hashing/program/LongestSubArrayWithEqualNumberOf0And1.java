package hashing.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqualNumberOf0And1 {

    public static void main(String[] args) {
        int[] input1 = {1, 0, 1, 1, 1, 0, 0};
        int[] input2 = {1, 1, 1, 1};
        int[] input3 = {0, 0, 1, 1, 1, 1, 1, 0};

        int naiveSolution1 = naiveSolution(input1, input1.length);
        int naiveSolution2 = naiveSolution(input2, input2.length);
        int naiveSolution3 = naiveSolution(input3, input3.length);

        int optimizeSolution1 = optimizeSolution(input1, input1.length);
        int optimizeSolution2 = optimizeSolution(input2, input2.length);
        int optimizeSolution3 = optimizeSolution(input3, input3.length);

        System.out.println(naiveSolution1);
        System.out.println(naiveSolution2);
        System.out.println(naiveSolution3);

        System.out.println("---------------------------");

        System.out.println(optimizeSolution1);
        System.out.println(optimizeSolution2);
        System.out.println(optimizeSolution3);
    }

    public static int naiveSolution(int[] arr, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int zeroCount = 0, oneCount = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) zeroCount++;
                else oneCount++;

                if (zeroCount == oneCount) {
                    result = Math.max(result, zeroCount + oneCount);
                }
            }
        }
        return result;
    }

    public static int optimizeSolution(int[] arr, int n) {
        // 1: Replace every 0 with -1
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        // 2: Now solve the problem same a zero sum
        int result = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0) result = i + 1;
            if (!map.containsKey(prefixSum)) map.put(prefixSum, i);
            else result = Math.max(result, i - map.get(prefixSum));
        }

        return result;
    }
}
