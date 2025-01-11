package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class TripletInSortedArray {
    public static void main(String[] args) {
        int[] input = {2, 3, 3, 4, 8, 9, 20, 20, 40};
        int n = input.length;
        int target = 32;

        List<String> present = isTripletPresent(input, n, target);
        System.out.println(present);
    }

    public static List<String> isTripletPresent(int[] arr, int n, int target) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            int sum = target - arr[i];
            int start = i + 1, end = n - 1;
            while (start < end) {
                int temp = arr[start] + arr[end];

                if (temp == sum) {
                    list.add(arr[i] + " - " + arr[start] + " - " + arr[end]);

                    //count same element at left side
                    while (arr[start] == arr[start + 1]) {
                        list.add(arr[i] + " - " + arr[start] + " - " + arr[end]);
                        start++;
                    }

                    //count same element at right side
                    while (arr[end] == arr[end - 1]) {
                        list.add(arr[i] + " - " + arr[start] + " - " + arr[end]);
                        end--;
                    }
                    start++;
                    end--;
                } else if (temp > sum) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return list;
    }
}
