package practice.day1;

//Q04 Generate Fibonacci series up to n terms.
public class Q04 {
    public static void main(String[] args) {
        int n = 5;
        int fibo = fibo(n);
        System.out.println(fibo);
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

}
