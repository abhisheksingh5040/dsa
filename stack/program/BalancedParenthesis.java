package stack.program;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String input = "[]{[()]}";
        boolean balanced = isBalanced(input);
        System.out.println(balanced);
    }

    public static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                else if (!matching(stack.peek(), ch)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean matching(char a, char b) {
        return ((a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')'));
    }
}
