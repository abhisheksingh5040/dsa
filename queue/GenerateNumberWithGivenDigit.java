package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumberWithGivenDigit {
    public static void main(String[] args) {

        int input = 10;

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(5 + "");
        queue.offer(6 + "");

        for (int count = 0; count < input; count++) {
            String curr = queue.poll();
            System.out.print(curr + " ");
            queue.offer(curr + "5");
            queue.offer(curr + "6");
        }
    }
}
