package mathematics;

public class CountDigit {

    public static void main(String[] args) {
        int input = 12345678;
        int countedDigit = countDigit(input);
        System.out.println(countedDigit);
    }

    public static int countDigit(int num) {
        int count = 0;

        while (num != 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
