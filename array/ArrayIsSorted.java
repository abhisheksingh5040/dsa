package array;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 9};
        int n = input.length;
        boolean isSorted = isSorted(input, n);
        System.out.println(isSorted);
    }

    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
