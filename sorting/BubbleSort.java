package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 5, 8, 7, 6, 1};
        int[] arr = {3, 2, 5, 8};
        int n = arr.length;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Time complexity : Theta(N ^ 2)
     *
     */
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] < arr[j + 1]){
                    swap(arr,j,j + 1);
                }
            }
        }
    }

    /**
     * Time complexity : O(N ^ 2)
     *
     */
    public static void bubbleSortOptimize(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] < arr[j + 1]){
                    swap(arr,j,j + 1);
                    flag = true;
                }
            }

            if(!flag){
                return;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
