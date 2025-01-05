package hashing.program;

import java.util.*;

public class CountDistinctElementInEveryWindow {
    public static void main(String[] args) {
        int[] input = {10, 20, 20, 10, 30, 40, 10}; // output = [2,3,4,3]
        int k = 4;
        int n = input.length;

        int[] naiveSolution = naiveSolution(input, n, k);
        int[] optimizeSolution = optimizeSolution(input, n, k);
        System.out.println(Arrays.toString(naiveSolution));
        System.out.println(Arrays.toString(optimizeSolution));
    }

    public static int[] naiveSolution(int[] arr, int n, int k) {
        int[] result = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }
            result[i] = set.size();
        }

        return result;
    }

    public static int[] optimizeSolution(int[] arr, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[n - k + 1];

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result[0] = map.keySet().size();
        int m = 0;
        for (int i = k; i < n; i++) {
            Integer count = map.get(arr[m]);

            if (count == 1) {
                map.remove(arr[m]);
            } else {
                map.put(arr[m], count - 1);
            }
            m++;
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            result[m] = map.keySet().size();
        }

        return result;
    }
}
