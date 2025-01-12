package array;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] input = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        int n = input.length;

        boolean naiveSolution = naiveSolution(input, n, sum);
        System.out.println(naiveSolution);

        boolean optimizeSolution = optimizeSolution(input, n, sum);
        System.out.println(optimizeSolution);
    }

    /**
     * Time complexity : O(N^2)
     * Space complexity : O(1)
     */
    public static boolean naiveSolution(int[] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < n; j++) {
                s += arr[j];

                if (sum == s) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean optimizeSolution(int[] arr, int n, int sum) {
        int s = 0, ans = 0;
        for (int e = 0; e < n; e++) {
            ans += arr[e];
            while (ans > sum) {
                ans = ans - arr[s];
                s++;
            }

            if (ans == sum) {
                return true;
            }
        }
        return false;
    }
}
