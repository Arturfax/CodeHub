public class LinkedList<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void removeAtPosition(int position) {
        if (position < 0 || head == null) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        current.next = current.next.next;
    }

    public T get(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }

        throw new IndexOutOfBoundsException("Index: " + index);
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addAtPosition(int position, T value) {
        Node newNode = new Node(value);

        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }


}
