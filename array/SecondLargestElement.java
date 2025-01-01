package array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] input = {5, 8, 20, 10};
        int secondLargestElement = secondLargestElement(input, input.length);
        System.out.println(secondLargestElement);
    }

    private static int secondLargestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
        }

        return max2;
    }
}
