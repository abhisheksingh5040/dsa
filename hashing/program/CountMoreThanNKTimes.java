package hashing.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMoreThanNKTimes {
    public static void main(String[] args) {
        int[] input = {30, 10, 20, 20, 10, 20, 30, 30};
        int n = input.length;
        int k = 4;

        List<Integer> count = count(input, n, k);
        System.out.println(count);
    }

    public static List<Integer> count(int[] arr, int n, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Integer temp = n / k;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > temp) {
                list.add(entry.getKey());
            }
        }

        return list;
    }
}
