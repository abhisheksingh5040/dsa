package stack.program;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {20, 30, 10, 5, 15};
        int n = arr.length;

        previousGreaterElement(arr, n);
    }

    private static void previousGreaterElement(int[] arr, int n) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        for (int i = 0; i < n; i++) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }
            int r = stack.isEmpty() ? -1 : stack.peek();
            System.out.print(r + " ");
            stack.push(arr[i]);
        }
    }
}
