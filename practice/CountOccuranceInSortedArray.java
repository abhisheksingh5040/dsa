package practice;

public class CountOccuranceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 12, 15};
        int input = 10;
        int countLeft = countLeft(arr, input);
        int countRight = countRight(arr, input);

        int result = countRight - countLeft + 1;
        System.out.println(result);
    }

    public static int countLeft(int[] arr, int input) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == input) {
                if (mid == 0 || arr[mid - 1] < input) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else if (arr[mid] < input) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int countRight(int[] arr, int input) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == input) {
                if (mid == arr.length - 1 || arr[mid] < arr[mid + 1]) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < input) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
