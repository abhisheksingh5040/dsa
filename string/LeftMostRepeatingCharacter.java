package string;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String input = "abccbd";
        int n = input.length() - 1;
        int naiveMethod = naiveMethod(input, n);
        System.out.println(naiveMethod);

        int optimizeMethod1 = optimizeMethod1(input, n);
        int optimizeMethod2 = optimizeMethod2(input, n);
        int optimizeMethod3 = optimizeMethod3(input, n);
        System.out.println(optimizeMethod1);
        System.out.println(optimizeMethod2);
        System.out.println(optimizeMethod3);
    }

    /**
     * Time complexity : O(N^2)
     */
    public static int naiveMethod(String str, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Time complexity : O(2N)
     */
    public static int optimizeMethod1(String str, int n) {
        final int CHAR = 256;
        int[] chars = new int[CHAR];

        for (int i = 0; i < n; i++) {
            chars[str.charAt(i)]++;
        }

        for (int i = 0; i < n; i++) {
            if (chars[str.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Time complexity : O(N)
     */
    public static int optimizeMethod2(String str, int n) {
        final int CHAR = 256;
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int fi = fIndex[str.charAt(i)];
            if (fi == -1) {
                fIndex[str.charAt(i)] = i;
            } else {
                res = Math.min(fi, res);
            }
        }
        return res == Integer.MIN_VALUE ? -1 : res;
    }

    /**
     * Time complexity : O(N)
     */
    public static int optimizeMethod3(String str, int n) {
        final int CHAR = 256;
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (visited[str.charAt(i)]) {
                res = i;
            } else {
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
}
