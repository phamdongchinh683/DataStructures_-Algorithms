package Linked_List_13_8_2024.Circular_linked_list;

public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

            tail = newNode;

            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void displayList() {
        Node current = head;

        if (head == null) {
            System.out.println("The given list is empty");
        }

        else {
            System.out.println("The data in the circular linked list are: ");

            do {
                System.out.print(" " + current.data);
                current = current.next;
            }

            while (current != head);
            System.out.println();

        }
    }
}
