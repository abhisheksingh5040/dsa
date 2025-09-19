package practice.day1;

//Q 2) Check if a string is a palindrome.
public class Q02 {
    public static void main(String[] args) {
        String input = "Madam";
        boolean palindrome = isPalindrome(input);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
