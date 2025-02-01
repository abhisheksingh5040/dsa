package stack;

import linkedlist.Node;

public class MyStackLL {
    int size;
    Node head;

    public MyStackLL() {
        size = 0;
        head = null;
    }

    public void push(int data) {
        Node temp = new Node(data);
        size++;
        temp.next = head;
        head = temp;
    }

    public int peek() {
        return head.data;
    }

    public int pop() {
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

}

