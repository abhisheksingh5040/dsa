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
        //Node begin = InsertAtBegin.begin(9, head);
        //PrintList.print(begin);

        //InsertAtEnd.end(13, head);
        Node insert = InsertAtGivenPosition.insert(9, 1, head);
        System.out.println();
        PrintList.print(insert);
    }
}
