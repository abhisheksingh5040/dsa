package mathematics;

public class GCDorHCFofTwoNumbers {

    public static void main(String[] args) {
        int input1 = 16;
        int input2 = 12;
        int naive = naiveUsingWhile(input1, input2);
        System.out.println(naive);
    }

    // Theta(MIN(NUM1,NUM2))
    public static int naive(int num1, int num2) {
        int min = Math.min(num1, num2);

        for (int i = min; i >= 0; i--)
            if (num1 % i == 0 && num2 % i == 0)
                return i;

        return 1;
    }

    public static int naiveUsingWhile(int num1, int num2) {
        int res = Math.min(num1, num2);

        while (res > 0) {
            if (num1 % res == 0 && num2 % res == 0)
                break;

            res--;
        }
        return res;
    }

    /*
     *  Euclidean Algorithm
     *  Basic Idea:
     *      let 'b' be smaller than 'a' gcd (a,b) = gcd (a - b, b)
     *
     *  Why ?
     *      Let 'g' be GCD of 'a' and 'b'
     *      a = gx , b = gy and GCD(x,y) = 1;
     *      (a, b) = g(x - y)
     *
     */
    public static int efficientMethod(int num1, int num2) {
        return 0;
    }
}
