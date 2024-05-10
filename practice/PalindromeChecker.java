package practice;

public class PalindromeChecker {

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "Java programming";

        if (isPalindrome(str1)) {
            System.out.println("\"" + str1 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str1 + "\" is not a palindrome.");
        }

        if (isPalindrome(str2)) {
            System.out.println("\"" + str2 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str2 + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
