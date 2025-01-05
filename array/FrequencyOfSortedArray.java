package array;

public class FrequencyOfSortedArray {
    public static void main(String[] args) {
        int[] input = {10, 10, 10, 25, 30, 30};
        int n = input.length;
        frequencyOfSortedArray(input, n);
    }

    public static void frequencyOfSortedArray(int[] arr, int n) {
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + "-" + count);
                count = 1;
            } else {
                count++;
            }
        }
    }
}
