package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class InsertAtGivenPosition {
    public static Node insert(int data, int pos, Node head) {
        int count = 0;
        Node current = head;
        if (pos == 0) {
            Node node = new Node(data);
            node.next = head;
            return node;
        } else {
            while (current != null) {
                if (pos == count - 1) {
                    Node node = new Node(data);
                    node.next = current.next;
                    current.next = node;
                    return head;
                } else {
                    count++;
                    current = current.next;
                }
            }
            return head;
        }
    }
}
