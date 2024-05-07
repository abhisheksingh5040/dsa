package mathematics;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        long factorial = factorial(input);
        System.out.println(factorial);
    }

    public static long factorial(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
