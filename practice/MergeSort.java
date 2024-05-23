package practice;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] result = new Integer[n];
        int[] indexes = new int[n];

        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        mergeSort(nums, indexes, result, 0, n - 1);

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resultList.add(result[i]);
        }

        return resultList;
    }

    private static void mergeSort(int[] nums, int[] indexes, Integer[] result, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(nums, indexes, result, left, mid);
        mergeSort(nums, indexes, result, mid + 1, right);
        merge(nums, indexes, result, left, mid, right);
    }

    private static void merge(int[] nums, int[] indexes, Integer[] result, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int[] tempIndexes = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0, count = 0;

        while (i <= mid && j <= right) {
            if (nums[indexes[i]] <= nums[indexes[j]]) {
                tempIndexes[k] = indexes[i];
                result[indexes[i]] = (result[indexes[i]] == null ? 0 : result[indexes[i]]) + count;
                i++;
            } else {
                tempIndexes[k] = indexes[j];
                count++;
                j++;
            }
            k++;
        }

        while (i <= mid) {
            tempIndexes[k] = indexes[i];
            result[indexes[i]] = (result[indexes[i]] == null ? 0 : result[indexes[i]]) + count;
            i++;
            k++;
        }

        while (j <= right) {
            tempIndexes[k] = indexes[j];
            j++;
            k++;
        }

        for (i = left; i <= right; i++) {
            indexes[i] = tempIndexes[i - left];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 2, 6, 1};
        System.out.println(countSmaller(nums1)); // Output: [2, 1, 1, 0]
    }
}
