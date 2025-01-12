package array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        //int[] arr = {3, 4, 8, -9, 20, 6};
        int[] arr = {4, 2, -2};
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        right[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = arr[i] + left[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i] + right[i + 1];
        }

        for (int i = 1; i < n - 1; i++) {
            if (left[i - 1] == right[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }

        if(right[1] == 0){
            System.out.println(arr[0]);
        }
    }
}
