package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class PrintList {

    public static void print(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
