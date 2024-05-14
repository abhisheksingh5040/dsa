package mathematics;

public class LCM {
    public static void main(String[] args) {
        int input1 = 4;
        int input2 = 6;
        int lcm = lcm(input1, input2);
        System.out.println(lcm);
    }

    public static int lcm(int num1, int num2) {
        int max = Math.max(num1, num2);
        for (int i = max; i <= num1 * num2; i++)
            if (i % num1 == 0 && i % num2 == 0)
                return i;

        return num1 * num2;
    }
}
