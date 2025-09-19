package practice.day1;

//Q5) Count vowels and consonants in a string.
public class Q05 {
    public static void main(String[] args) {
        String input = "abhishek";
        count(input);
    }

    public static void count(String str) {
        int n = str.length();
        int vow = 0;
        int con = 0;
        String vowels = "aeiou";
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vow++;
            } else {
                con++;
            }
        }

        System.out.println("Volwels: " + vow);
        System.out.println("Consonents : " + con);
    }
}
