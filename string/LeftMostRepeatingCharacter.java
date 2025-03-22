package string;

public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String input = "abccbd";
        int n = input.length() - 1;
        int naiveMethod = naiveMethod(input, n);
        System.out.println(naiveMethod);

        int optimizeMethod = optimizeMethod(input, n);
        System.out.println(optimizeMethod);
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
    public static int optimizeMethod(String str, int n) {
        final int CHAR = 256;
        int[] chars = new int[CHAR];

        for (int i = 0; i < n; i++) {
            chars[str.charAt(i)]++;
        }

        for (int i = 0; i < n; i++) {
            if(chars[str.charAt(i)] > 1){
                return i;
            }
        }
        return -1;
    }
}
