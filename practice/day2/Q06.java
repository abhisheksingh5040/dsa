package practice.day2;

//Q06 Find largest and smallest element in an array.
public class Q06 {
    public static void main(String[] args) {
        int[] input = {1, 6, 4, 3, 8, 9, 3};
        largestAndSmallestNumber(input);
    }

    public static void largestAndSmallestNumber(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
