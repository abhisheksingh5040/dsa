package string;

public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        int n = input.length() - 1;
        int optimizeMethod = optimizeMethod(input, n);
        System.out.println(optimizeMethod);
    }

    /**
     * Time complexity : O(N)
     */
    public static int optimizeMethod(String str, int n) {
        int CHAR = 256;
        boolean[] visited = new boolean[CHAR];
        int res = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (!visited[str.charAt(i)]) {
                res = i;
            } else {
                visited[str.charAt(i)] = true;
            }
        }

        return res;
    }
}
