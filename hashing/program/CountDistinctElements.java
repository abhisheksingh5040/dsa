package hashing.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {

    public static void main(String[] args) {
        int[] input = {15, 12, 13, 12, 13, 13, 18};
        int countDistinctElement = countDistinctElement(input, input.length);
        System.out.println(countDistinctElement);
    }

    public static int countDistinctElement(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++)
            set.add(arr[i]);

        return set.size();
    }

    public static int countDistinctElement2(Integer[] arr,int n) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size();
    }
}
