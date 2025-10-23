package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        System.out.println(queue);
    }
}
