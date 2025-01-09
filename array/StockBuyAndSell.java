package array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] input = {1, 5, 3, 8, 12};
        int n = input.length;
        int maxProfit = getMaxProfit(input, n);
        System.out.println(maxProfit);
    }

    public static int getMaxProfit(int[] arr, int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                res = res + arr[i] - arr[i - 1];
            }
        }
        return res;
    }
}
