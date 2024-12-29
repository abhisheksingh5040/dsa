package hashing.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoUnsortedArray {

    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 30, 50};
        int[] b = {30, 5, 15, 80};

        int count = unionOfTwoUnsortedArray(a, b);
        System.out.println(count);
    }

    public static int unionOfTwoUnsortedArray(int[] a, int[] b) {
        Set<Integer> result = new HashSet<>();

        for (int num : a) {
            result.add(num);
        }

        for (int num : b) {
            result.add(num);
        }

        return result.size();
    }
}
