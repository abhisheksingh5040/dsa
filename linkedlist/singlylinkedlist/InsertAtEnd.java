package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class InsertAtEnd {
    public static void end(int data, Node head) {

        if (head == null) return;
        
        while (head.next != null) {
            head = head.next;
        }

        Node last = new Node(data);
        head.next = last;
    }
}
