public class FrequencyInSortedOrder {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        int n = input.length();
        frequency(input, n);
    }

    public static void frequency(String str, int n) {
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            arr[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0)
                System.out.println((char)(i + 'a') + "-" + arr[i]);
        }
    }
}
