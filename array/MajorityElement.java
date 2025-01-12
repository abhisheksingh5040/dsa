package array;

// Any number which may appear n/2 times that is an majority element
public class MajorityElement {
    public static void main(String[] args) {
        int[] input = {8, 3, 4, 8, 8};
        int n = input.length;
        int naiveSolution = naiveSolution(input, n);
        System.out.println(naiveSolution);
    }

    /**
     * Time complexity : O(N^2)
     */
    public static int naiveSolution(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }
}
