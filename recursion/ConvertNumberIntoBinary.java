package recursion;

public class ConvertNumberIntoBinary {
    public static void main(String[] args) {
        int input = 50;
        convertNumberIntoBinary(input, 0);
    }

    public static void convertNumberIntoBinary(int num, int res) {
        if (num == 0) {
            return;
        }

        convertNumberIntoBinary(num / 2,res);
        System.out.print(num % 2);
    }
}
