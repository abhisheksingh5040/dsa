package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int fibo = fibo(3);
        System.out.println(fibo);
    }

    public static int fibo(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        return fibo(num - 1) + fibo(num - 2);
    }
}
