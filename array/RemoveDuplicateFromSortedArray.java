package array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] input = {10, 20, 20, 30, 30, 30, 30, 90};
        int n = input.length;
        int naiveMethod = naiveMethod(input, n);
        int efficientMethod = efficientMethod(input, n);
        System.out.println(naiveMethod);
        System.out.println(efficientMethod);
    }

    public static int naiveMethod(int[] arr, int n) {
        int[] temp = new int[n];
        int res = 1;
        temp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] != temp[res - 1]) {
                temp[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static int efficientMethod(int[] arr, int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
