package practice.day2;

//Q09 Find the second-largest number in an array.
public class Q09 {
    public static void main(String[] args) {
        int[] input = {1, 6, 4, 3, 8, 9, 3};
        secondLargestNumber(input);
    }

    private static void secondLargestNumber(int[] arr) {
        int n = arr.length;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Second largest number: " + max2);
    }
}
