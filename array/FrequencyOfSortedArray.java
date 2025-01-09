package array;

public class FrequencyOfSortedArray {
    public static void main(String[] args) {
        int[] input = {10, 10, 10, 25, 30, 30};
        int n = input.length;
        frequencyOfSortedArray1(input, n);
        printFreq(input, n);
    }

    public static void frequencyOfSortedArray1(int[] arr, int n) {
        int freq = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println(arr[i - 1] + " - " + freq);
                freq = 1;
            }

            if (i == n - 1 && freq != 1) {
                System.out.println(arr[n - 1] + " - " + freq);
            }
        }

        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " - " + freq);
        }
    }

    static void printFreq(int arr[], int N) {

        // Stores the frequency of an element
        int freq = 1;

        // Traverse the array arr[]
        for (int i = 1; i < N; i++) {
            // If the current element is equal
            // to the previous element
            if (arr[i] == arr[i - 1]) {
                // Increment the freq by 1
                freq++;
            } else {
                System.out.println("Frequency of "
                        + arr[i - 1]
                        + " is: " + freq);
                // Update freq
                freq = 1;
            }
        }

        // Print the frequency of the last element
        System.out.println("Frequency of " + arr[N - 1]
                + " is: " + freq);
    }
}
