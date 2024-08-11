package mathematics;

public class Prime {
    public static void main(String[] args) {
        int input = 19;
        boolean naive = naive(input);
        System.out.println(naive);

        boolean efficientWay = efficientWay(input);
        System.out.println(efficientWay);

        boolean moreEfficient = moreEfficient(input);
        System.out.println(moreEfficient);
    }

    //Time complexity O(n)
    public static boolean naive(int num) {
        if (num == 1)
            return false;

        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    //Time complexity : O(root N)
    public static boolean efficientWay(int num) {
        if (num == 1)
            return false;

        for (int i = 2; i * i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public static boolean moreEfficient(int num) {
        if (num == 1)
            return false;

        if (num == 2 || num == 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i < num; i = i + 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return false;

        return true;
    }
}
