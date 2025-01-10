package array;

public class MaximumConsecutive1s {
    public static void main(String[] args) {
        int[] input = {0, 1, 1, 1, 0, 1, 1};
        int n = input.length;
        naiveSolution(input, n);
        optimizeSolution(input, n);
    }

    public static void naiveSolution(int[] arr, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 1)
                        count++;
                    else break;
                }
                result = Math.max(result, count);
            }
        }
        System.out.println(result);
    }

    public static void optimizeSolution(int[] arr, int n) {
        int result = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                result = Math.max(result, count);
            }
        }
        System.out.println(result);
    }
}
