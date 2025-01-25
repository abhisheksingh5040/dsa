package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class RecursiveTraversal {

    public static void print(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        print(head.next);
    }
}
