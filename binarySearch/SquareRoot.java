package binarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int input = 10;
        int naiveSolution = naiveSolution(input);
        System.out.println(naiveSolution);

        int optimizeSolution = optimizeSolution(input);
        System.out.println(optimizeSolution);
    }

    /**
     * Time complexity : Theta(sqrt(N))
     * Space complexity : O(1)
     */
    public static int naiveSolution(int num) {
        int i = 1;

        while (i * i <= num) {
            i++;
        }

        return i - 1;
    }

    /**
     * Time complexity : O(logN)
     * space complexity : O(1)
     */
    public static int optimizeSolution(int num) {
        int low = 0, high = num,result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sq = mid * mid;

            if (sq == num) {
                return mid;
            } else if (sq > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
                result = mid;
            }
        }

        return result;
    }
}
