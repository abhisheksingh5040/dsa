package recursion;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        int k = 1;
        int fact = fact(input, k);
        System.out.println(fact);
    }

    public static int fact(int n, int k) {
        if (n == 0 || n == 1) {
            return k;
        }

        return fact(n - 1, n * k);
    }
}
