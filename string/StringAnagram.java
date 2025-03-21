package string;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String input1 = "abcdef";
        String input2 = "fedcab";

        boolean naiveMethod = naiveMethod(input1, input2);
        System.out.println(naiveMethod);
    }

    public static boolean naiveMethod(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        String sort1 = new String(chars1);
        String sort2 = new String(chars2);

        return sort1.equals(sort2);
    }
}
