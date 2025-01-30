package linkedlist.program;

public class Print {
    public static void printSinglyLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
