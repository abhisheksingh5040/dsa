package hashing.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Time complexity : O(m + n)
 * Space complexity : O(n)
 */
public class IntersectionOfTwoUnsortedArray {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 30, 50};
        int[] b = {30, 5, 15, 80};

        List<Integer> union = unionOfTwoUnsortedArray(a, b);
        System.out.println(union);
    }

    public static List<Integer> unionOfTwoUnsortedArray(int[] a, int[] b) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (!set.add(num)) {
                result.add(num);
            }
        }

        return new ArrayList<>(result);
    }
}
