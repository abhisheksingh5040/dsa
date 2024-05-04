package mathematics;

public class PalindromeNumbers {
    public static void main(String[] args) {
        long input = 1221L;
        boolean palindrome = isPalindrome(input);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(long num){
        long temp = num;
        long reverse = 0L;

        while(temp > 0){
            long digit  = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        return num == reverse;
    }
}
