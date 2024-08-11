package practice;

public class CountDigits {
    public static void main(String[] args) {
//        int input = 1;
//        int count = count(input);
//        System.out.println(count);

        for (int i = 1; i <= 1000; i++) {
            System.out.println("sorry " + i);
        }
    }

    public static int count(int num) {
        return (int) Math.floor(Math.log10(num)) + 1;
    }
}
