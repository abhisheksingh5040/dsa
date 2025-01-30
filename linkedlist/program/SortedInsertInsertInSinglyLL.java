package linkedlist.program;

public class SortedInsertInsertInSinglyLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(12);
        Node n2 = new Node(14);
        Node n3 = new Node(16);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        Node node = sortedInsert(head, 12);
        Print.printSinglyLL(node);

    }

    /*
     * Time Complexity : O(N)
     */
    public static Node sortedInsert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) return temp;
        if (head.data > data) {
            temp.next = head;
            return temp;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.data <= data && curr.next.data >= data) {
                temp.next = curr.next;
                curr.next = temp;
                return head;
            }
            curr = curr.next;
        }

        curr.next = temp;
        return head;
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}
