package Queue_21_08_2024;

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();

        queue.enQueue(5);
        queue.displayQueue();

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Queue size is: " + queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
        System.out.println(queue.peek());

        System.out.println("Queue size is: " + queue.size());

    }
}
