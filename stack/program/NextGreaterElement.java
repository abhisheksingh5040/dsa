package stack.program;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        int n = arr.length;

        List<Integer> list = nextGreaterElement(arr, n);
        Collections.reverse(list);
        System.out.println(list);
    }

    private static List<Integer> nextGreaterElement(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[n - 1]);
        for (int i = n - 1; i >= 0; i--) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }

            int r = stack.isEmpty() ? -1 : stack.peek();
            list.add(r);
            stack.push(arr[i]);
        }
        return list;
    }
}
