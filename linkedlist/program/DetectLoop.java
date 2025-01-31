package linkedlist.program;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(15);
        Node n2 = new Node(12);
        Node n3 = new Node(20);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n2;
        boolean result = naiveSolution(head);
        boolean method2 = method2(head);
        boolean floydAlgo = floydAlgo(head);
        System.out.println(result);
        System.out.println(method2);
        System.out.println(floydAlgo);
    }

    /*
     * Time Complexity: O(N ^ 2)
     * Auxiliary space : O(1)
     */
    public static boolean naiveSolution(Node head) {
        if (head == null) return false;
        Node curr = head;
        while (curr != null) {
            Node temp = head;

            while (temp != curr) {
                if (temp == curr.next) {
                    return true;
                }
                temp = temp.next;
            }
            curr = curr.next;
        }
        return false;
    }

    /*
     * Time Complexity: O(N)
     * Auxiliary space : O(N)
     */
    public static boolean method2(Node head) {
        Set<Node> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }

    public static boolean floydAlgo(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
