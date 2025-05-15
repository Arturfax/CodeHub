public class DoublyLinkedList<T extends Number & Comparable<T>> extends LinkedList<T> {

    private class DoublyNode extends Node {
        DoublyNode prev;

        DoublyNode(T data) {
            super(data);
            this.prev = null;
        }
    }

    private DoublyNode tail;

    @Override
    public void add(T data) {
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        DoublyNode currentTail = (DoublyNode) tail;
        currentTail.next = newNode;
        newNode.prev = currentTail;
        tail = newNode;
    }

    @Override
    public void removeAtPosition(int position) {
        if (position < 0 || head == null) {
            System.out.println("Invalid position");
            return;
        }

        DoublyNode current = (DoublyNode) head;
        int index = 0;

        while (current != null && index < position) {
            current = (DoublyNode) current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        if (current == head) head = current.next;
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
            if (head != null) ((DoublyNode) head).prev = newNode;
            head = newNode;
            if (tail == null) tail = newNode;
            return;
        }

        DoublyNode current = (DoublyNode) head;
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

        DoublyNode current = (DoublyNode) head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = (DoublyNode) current.next;
        }
        System.out.println("null");
    }

    @Override
    public double averageOfList() {
        double sum = 0;
        int count = 0;

        if (head == null) {
            System.out.println("List is empty");
            return 0;
        }

        DoublyNode current = (DoublyNode) head;
        while (current != null) {
            sum += current.data.doubleValue();
            count++;
            current = (DoublyNode) current.next;
        }
        return sum/count;
    }
}
