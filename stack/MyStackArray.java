package stack;

public class MyStackArray {
    int[] arr;

    int cap;
    int top;

    MyStackArray(int cap) {
        arr = new int[cap];
        this.cap = cap;
        top = -1;
    }

    public void push(int num) {
        if (top == cap - 1) throw new RuntimeException("Stack is full!!"); //overflow

        top++;
        arr[top] = num;
    }

    public int peek() {
        if (top == -1) throw new RuntimeException("Stack is Empty!!!"); //underflow

        return arr[top];
    }

    public int pop() {
        if (top == -1) throw new RuntimeException("Stack is Empty!!!");//underflow

        int res = arr[top];
        top--;
        return res;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
