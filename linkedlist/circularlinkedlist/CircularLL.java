package linkedlist.circularlinkedlist;

public class CircularLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n2 = new Node(11);
        Node n3 = new Node(12);
        Node n4 = new Node(13);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        print1(head);
        head = insertBeginNaive(head, 9);
        head = insertBeginEfficient(head, 8);
        head = insertLastNaive(head, 14);
        head = insertLastNaive(head, 15);
        head = insertLastEffective(head, 16);
        head = insertLastEffective(head, 17);
        head = insertLastEffective(head, 18);
        head = insertLastEffective(head, 19);
        head = deleteHeadNaive(head);
        head = deleteHeadNaive(head);
        head = deleteHeadEfficient(head);
        head = deleteHeadEfficient(head);
        System.out.println();
        print(head);
    }

    public static void print(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
    }

    public static void print1(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");

        for (Node curr = head.next; curr != head; curr = curr.next) {
            System.out.print(curr.data + " ");
        }
    }

    /**
     * Time complexity : Theta(N)
     */
    public static Node insertBeginNaive(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }

    /*
     * Time Complexity : Theta(1)
     */
    public static Node insertBeginEfficient(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;

            int tm = temp.data;
            temp.data = head.data;
            head.data = tm;

            return head;
        }
    }

    /**
     * Time complexity : Theta(N)
     */
    public static Node insertLastNaive(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.next = head;
        return head;
    }

    public static Node insertLastEffective(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
        } else {
            temp.next = head.next;
            head.next = temp;

            //swap
            int tm = temp.data;
            temp.data = head.data;
            head.data = tm;

        }
        return temp;
    }

    public static Node deleteHeadNaive(Node head) {
        if (head == null || head.next == null) return null;

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = head.next;
        return curr.next;
    }

    public static Node deleteHeadEfficient(Node head) {
        if (head == null || head.next == null) return null;
        //swap
        head.data = head.next.data;

        //delete 2nd node
        head.next = head.next.next;
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
