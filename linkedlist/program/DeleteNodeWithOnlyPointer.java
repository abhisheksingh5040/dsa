package linkedlist.program;

public class DeleteNodeWithOnlyPointer {
    public static void main(String[] args) {
        Node head = InsertSLL.insert(null, 10);
        Node n1 = InsertSLL.insert(head, 11);
        Node n2 = InsertSLL.insert(n1, 12);
        Node n3 = InsertSLL.insert(n2, 13);
        Node n4 = InsertSLL.insert(n3, 14);

        Print.printSinglyLL(head);
        deleteNode(n2);
        System.out.println();
        Print.printSinglyLL(head);
    }

    public static void deleteNode(Node ref) {
        ref.data = ref.next.data;
        ref.next = ref.next.next;
    }
}
