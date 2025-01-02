package array;

import java.util.ArrayList;
import java.util.List;

public class LeaderOfAnArray {
    public static void main(String[] args) {
        int[] input = {7, 10, 4, 3, 6, 5, 2};
        int[] input2 = {10, 20, 30};
        int[] input3 = {30, 20, 10};
        int n = input2.length;

        List<Integer> naiveSolution = naiveSolution(input2, n);
        System.out.println(naiveSolution);
    }

    public static List<Integer> naiveSolution(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                list.add(arr[i + 1]);
            }
        }
        return list;
    }
}
