package recursion;

public class PrintNTo1 {

    public static void main(String[] args) {
        int input = 5;
        printNTo1(5);
    }

    public static void printNTo1(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printNTo1(n - 1);
    }
}
