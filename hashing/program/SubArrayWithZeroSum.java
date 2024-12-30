package hashing.program;

import java.util.HashSet;
import java.util.Set;

/**
 * Time complexity : O(n)
 * Space complexity : O(n)
 */
public class SubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] input = {-3, 4, -3, -1, 1};

        boolean result = subArrayWithZeroSum(input);
        System.out.println(result);
    }

    /** PreFix sum + hashing question
     * int[] = {a,b,c,d,e};
     *     a + b + c + d + e = totalSum
     *     a + b + c = currentSum
     *     d + e = zeroSum
     *     so => totalSum = currentSum + zeroSum
     */
    public static boolean subArrayWithZeroSum(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;

            if (set.contains(currentSum)) {
                return true;
            }

            if (currentSum == 0) {
                return true;
            }

            set.add(currentSum);
        }

        return false;
    }
}
