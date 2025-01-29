package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class InsertAtBegin {
    public static Node begin(int data, Node head) {
        Node node = new Node(data);
        node.next = head;
        return node;
    }
}
