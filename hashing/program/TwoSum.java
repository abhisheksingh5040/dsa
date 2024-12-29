package hashing.program;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {8, 4, 3, 9};
        int target = 13;

        boolean sum = twoSum(input, target);
        System.out.println(sum);
    }

    public static boolean twoSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            int current = target - num;

            if (set.contains(current)) {
                return true;
            } else {
                set.add(num);
            }
        }

        return false;
    }
}
