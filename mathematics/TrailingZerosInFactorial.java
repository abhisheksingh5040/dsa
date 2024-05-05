package mathematics;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        int input = 5;

        //naive method
        int naiveMethod = naiveMethod(input);
        System.out.println(naiveMethod);

        //efficient method
        int efficientMethod = efficientMethod(input);
        System.out.println(efficientMethod);
    }

    //Time Complexity : Theta(n)
    public static int naiveMethod(int num) {
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }

        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact = fact / 10;
        }

        return count;
    }

    /*
    NEED TO COUNT 2 & 5 -> TO GET TRAILING ZEROS
     */
    //Time Complexity : Theta(log(n))
    public static int efficientMethod(int num) {
        if (num < 5) {
            return 0;
        }

        int result = 0;

        for (int i = 5; i <= num; i = i * 5) {
            result = result + num / i;
        }

        return result;
    }
}
