package practice.day1;

//Q3 Find factorial of a number
public class Q03 {
    public static void main(String[] args) {
        int input = 5;
        int fact = fact(input);
        System.out.println(fact);

        int factRecursive = factRecursive(input);
        System.out.println(factRecursive);
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int factRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
