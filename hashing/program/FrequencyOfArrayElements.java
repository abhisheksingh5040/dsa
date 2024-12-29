package hashing.program;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] input = {15, 12, 13, 12, 13, 13, 18};
        Map<Integer, Integer> frequency = frequencyOfArrayElement(input, input.length);
        System.out.println(frequency);
    }

    public static Map<Integer, Integer> frequencyOfArrayElement(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        return map;
    }
}
