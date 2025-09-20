package practice.day2;

import java.util.LinkedHashSet;
import java.util.Set;

//Q08 Remove duplicates from an array.
public class Q08 {
    public static void main(String[] args) {
        int[] input = {1, 6, 4, 3, 8, 9, 3, 8, 9, 7};
        int n = input.length;

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(input[i]);
        }

        System.out.println(set);
    }
}
