package Queue_21_08_2024;

public class Queue {
    private static final int MAX = 10;
    private int[] arr;
    private int front;
    private int rear;
    private int count;

    public Queue() {
        arr = new int[MAX];
        front = 0;
        rear = -1;
        count = 0;
    }

    // check number element in queue
    public boolean isEmpty() {
        return (count == 0);
    }

    // check queue is full?
    public boolean isFull() {
        return (count == MAX);
    }

    // size queue
    public int size() {
        return count;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + data);
            return;
        }
        rear = (rear + 1) % MAX;
        arr[rear] = data;
        count++;
        System.out.println("");
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No elements to peek.");
            return -1;
        }
        return arr[front];
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % MAX;
        count--;
        return item;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % MAX] + " ");
        }
        System.out.println();
    }
}