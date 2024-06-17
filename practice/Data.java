package practice;

public class Data {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isCheck(n));
    }

    public static boolean isCheck(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i * i + j * j == n){
                    return true;
                }
            }
        }
        return false;
    }
}
