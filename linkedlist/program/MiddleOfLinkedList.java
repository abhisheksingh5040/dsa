package linkedlist.program;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = InsertSLL.insert(null, 10);
        head = InsertSLL.insert(head, 20);
        head = InsertSLL.insert(head, 30);
        head = InsertSLL.insert(head, 40);
        head = InsertSLL.insert(head, 50);
        head = InsertSLL.insert(head, 60);

        Print.printSinglyLL(head);
        System.out.println();
        naiveSolution(head);
        efficientSolution(head);
    }

    public static void naiveSolution(Node head) {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 1; i <= count / 2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void efficientSolution(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
