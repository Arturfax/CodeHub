public class DoublyLinkedList<T extends Number & Comparable<T>> extends LinkedList<T> {

    private class DoublyNode extends Node {
        DoublyNode prev;

        DoublyNode(T data) {
            super(data);
            this.prev = null;
        }
    }

    private DoublyNode head;
    private DoublyNode tail;

    @Override
    public void add(T data) {//adding element to the end of list
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    @Override
    public void removeAtPosition(int position) {
        if (position < 0 || head == null) {
            System.out.println("Invalid position");
            return;
        }

        DoublyNode current = head;
        int index = 0;

        while (current != null && index < position) {
            current = (DoublyNode) current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        if (current == head) head = (DoublyNode) current.next;
        if (current == tail) tail = current.prev;

        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) ((DoublyNode) current.next).prev = current.prev;
    }

    @Override
    public void addAtPosition(int position, T value) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        DoublyNode newNode = new DoublyNode(value);

        if (position == 0) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            head = newNode;
            if (tail == null) tail = head;
            return;
        }

        DoublyNode current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = (DoublyNode) current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) ((DoublyNode) current.next).prev = newNode;
        current.next = newNode;

        if (newNode.next == null) tail = newNode;
    }

    @Override
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = (DoublyNode) current.next;
        }
        System.out.println("null");
    }
}
