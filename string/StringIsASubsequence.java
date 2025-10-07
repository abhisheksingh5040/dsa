package string;

public class StringIsASubsequence {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "grges";
        boolean subSequence = isSubSequence(s1, s2);
        System.out.println(subSequence);
    }

    public static boolean isSubSequence(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j == s2.length() ? true : false;
    }
}
