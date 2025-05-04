package recursion;

import java.util.Enumeration;

public class SumOfDigit {
    public static void main(String[] args) {
        int input = 5;
        int sumWithoutTailRecursion = sum(input);
        System.out.println(sumWithoutTailRecursion);

        int sumWithTailRecursion = sum1(input, 0);
        System.out.println(sumWithTailRecursion);
    }

    //without tail recursion
    public static int sum(int num) {
        if (num == 0) return 0;

        return num + sum(num - 1);
    }

    //with tail recursion
    public static int sum1(int num, int k) {
        if (num == 0) return k;

        return sum1(num - 1, k + num);
    }
}
