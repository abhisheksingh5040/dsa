package queue;

//Using Circular Array
public class QueueUsingArray {

    int[] arr;
    int front;
    int cap;
    int size;

    int rear;

    QueueUsingArray(int cap) {
        arr = new int[cap];
        this.cap = cap;
        front = 0;
        size = 0;
        rear = 0;
    }

    public void enqueue(int data) {
        arr[rear] = data;
        rear++;
        size++;
    }

    public int dequeue() {
        int data = arr[front];
        front--;
        size--;
        return data;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        System.out.println(queue.size());
    }

}
