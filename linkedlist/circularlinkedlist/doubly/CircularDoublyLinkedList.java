package linkedlist.circularlinkedlist.doubly;

public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        Node head = insertAtBegin(null, 10);
        head = insertAtBegin(head, 11);
        head = insertAtBegin(head, 12);
        head = insertAtBegin(head, 13);
        head = insertAtBegin(head, 14);
        head = insertAtBegin(head, 15);

        head = insertAtLast(head, 11);
        head = insertAtLast(head, 12);
        head = insertAtLast(head, 13);
        head = insertAtLast(head, 14);
        head = insertAtLast(head, 15);
        print(head);
    }

    public static void print(Node head) {
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
    }

    public static Node insertAtBegin(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }

        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;

        return temp;
    }

    public static Node insertAtLast(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }

        temp.prev = head.prev;
        head.prev.next = temp;
        temp.next = head;
        head.prev = temp;
        return head;
    }
}

class Node {
    Node next;
    Node prev;
    int data;

    Node(int data) {
        this.data = data;
    }
}
