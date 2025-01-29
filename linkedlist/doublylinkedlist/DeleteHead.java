package linkedlist.doublylinkedlist;

public class DeleteHead {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(11);
        Node n2 = new Node(12);

        head.next = n1;
        n1.prev = head;
        n1.next = n2;
        n2.prev = n1;

        print(head);
        //Node newHead = deleteHead(head);
        Node newHead = deleteLastNode(head);
        System.out.println();
        print(newHead);
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    /**
     * Time complexity : Theta(1)
     */
    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) return null;
        else {
            head = head.next;
            head.prev = null;
            return head;
        }
    }

    /**
     * Time complexity : Theta(N)
     */
    public static Node deleteLastNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
}

class Node {
    Node next;
    Node prev;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
