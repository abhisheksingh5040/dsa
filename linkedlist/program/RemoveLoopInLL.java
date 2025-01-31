package linkedlist.program;

public class RemoveLoopInLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(15);
        Node n2 = new Node(12);
        Node n3 = new Node(20);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n2;

        removeLoop(head);
        Print.printSinglyLL(head);
    }

    public static void removeLoop(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) return;
        slow = head;

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
    }
}
