package linkedlist.program;

public class ReverseLL {
    public static void main(String[] args) {
        Node head = InsertSLL.insert(null, 10);
        head = InsertSLL.insert(head, 11);
        head = InsertSLL.insert(head, 12);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 14);
        head = InsertSLL.insert(head, 15);

        Print.printSinglyLL(head);
        head = reverseLL(head);
        System.out.println();
        Print.printSinglyLL(head);
    }

    /*
     * Time Complexity : O(N)
     */
    private static Node reverseLL(Node head) {
        if (head == null || head.next == null) return head;

        Node prev = null, curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            // set next and prev
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
