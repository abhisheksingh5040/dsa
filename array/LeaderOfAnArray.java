package array;

import java.util.ArrayList;
import java.util.List;

public class LeaderOfAnArray {
    public static void main(String[] args) {
        int[] input = {7, 10, 4, 3, 6, 5, 2};
        int[] input2 = {10, 20, 30};
        int[] input3 = {30, 20, 10};
        int n = input.length;

        List<Integer> naiveSolution = optimizeSolution(input, n);
        System.out.println(naiveSolution);
    }

    public static List<Integer> optimizeSolution(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        int max = arr[n - 1];
        list.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(max);
            }
        }
        return list;
    }
}
