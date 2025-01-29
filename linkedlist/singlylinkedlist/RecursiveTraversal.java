package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class RecursiveTraversal {

    /**
     * Time Complexity : Theta(N)
     * Space Complexity : Theta(N)
     */
    public static void print(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        print(head.next);
    }
}
