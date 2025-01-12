package array;

public class PrefixSum {

    private static int[] output;

    public static void main(String[] args) {
        int[] input = {2, 8, 3, 9, 6, 5, 4};
        int n = input.length;
        setPrefixSum(input, n);
        int sum = getSum(1, 1);
        System.out.println(sum);

    }

    public static void setPrefixSum(int[] arr, int n) {
        output = new int[n];
        output[0] = arr[0];

        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] + arr[i];
        }
    }

    public static int getSum(int start, int end) {
        return start == 0 ? output[end] : output[end] - output[start - 1];
    }
}
