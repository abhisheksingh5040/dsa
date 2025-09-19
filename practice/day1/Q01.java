package practice.day1;

//Q1 Reverse a string without using built-in methods.
public class Q01 {
    public static void main(String[] args) {
        String str = "abhishek";
        String result = reversedString(str);
        System.out.println(result);
    }

    public static String reversedString(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
