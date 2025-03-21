package string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String input = "madam";
        int n = input.length();

        boolean naiveMethod = naiveMethod(input, n);
        System.out.println(naiveMethod);

        boolean optimizeMethod = optimizeMethod(input, n);
        System.out.println(optimizeMethod);
    }

    public static boolean naiveMethod(String str, int n) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return str.equalsIgnoreCase(builder.toString());
    }

    public static boolean optimizeMethod(String str, int n) {
        int start = 0, end = n - 1;

        while (start < end) {
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
