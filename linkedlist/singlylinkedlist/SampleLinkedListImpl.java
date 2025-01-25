package linkedlist.singlylinkedlist;

import linkedlist.Node;

public class SampleLinkedListImpl {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(11);
        Node n2 = new Node(12);

        head.next = n1;
        n1.next = n2;

        PrintList.print(head);
        System.out.println();
        RecursiveTraversal.print(head);
        System.out.println();
        RecursiveTraversal.print(head);
    }
}
