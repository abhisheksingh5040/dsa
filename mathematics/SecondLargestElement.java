package mathematics;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 7, 8, 6 };
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }

    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }else if (arr[i] > second && second != first) {
                second = arr[i];
            }
        }
        return second;
    }
}
