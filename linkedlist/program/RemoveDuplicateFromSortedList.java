package linkedlist.program;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        Node head = InsertSLL.insert(null, 10);
        head = InsertSLL.insert(head, 11);
        head = InsertSLL.insert(head, 12);
        head = InsertSLL.insert(head, 12);
        head = InsertSLL.insert(head, 12);
        head = InsertSLL.insert(head, 12);
        head = InsertSLL.insert(head, 12);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 13);
        head = InsertSLL.insert(head, 14);
        head = InsertSLL.insert(head, 14);
        head = InsertSLL.insert(head, 14);
        head = InsertSLL.insert(head, 14);
        head = InsertSLL.insert(head, 14);
        head = InsertSLL.insert(head, 14);

        Print.printSinglyLL(head);
        System.out.println();
        removeDuplicate(head);
        Print.printSinglyLL(head);
    }

    public static void removeDuplicate(Node head) {
        if (head == null) return;
        Node point = head;

        while (head != null) {
            if (point.data != head.data) {
                point.next = head;
                point = point.next;
            }
            head = head.next;
        }

        point.next = null;
    }
}
