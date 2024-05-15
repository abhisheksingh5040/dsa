package mathematics;

public class Prime {
    public static void main(String[] args) {
        int input = 18;
        boolean naive = naive(input);
        System.out.println(naive);
    }

    public static boolean naive(int num) {
        if (num == 1)
            return false;

        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}
