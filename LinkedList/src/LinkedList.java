public class LinkedList {

    protected class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    protected Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Integer data) {
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
            System.out.println("\nCan't delete, node at that position doesn't exist");
            return;
        }

        current.next = current.next.next;
    }

    public void printList() {
        System.out.println();
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    public void addAtPosition(int position, Integer value) {
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

    public double averageOfList() {
        if (head == null) {
            System.out.println("List is empty.");
            return 0;
        }

        Node current = head;
        double sum = 0;
        int count = 0;

        while (current != null) {
            sum += current.data;
            count++;
            current = current.next;
        }

        return sum / count;
    }

    public void clearList() {
        head = null;
    }
    public void printComparedElements( int compareElements) {
        switch(compareElements){
            case 100://values not found
                System.out.println("One or both values not found in the list.");
                break;
            case 101: //first number greater
                System.out.println("First number is greater than second number");
                break;

            case 102://Second number greater
                System.out.println("Second number is greater than first number");
                break;
            case 103://elements are equal
                System.out.println("Numbers are equal");
                break;
            default:
                System.out.println("Invalid compare elements");
                break;
        }
    }
    public int compareElements(int firstNumber, int secondNumber) {
        boolean found1 = false;
        boolean found2 = false;

        Node current = head;

        while (current != null) {
            if (current.data.equals(firstNumber)) {
                found1 = true;
            }
            if (current.data.equals(secondNumber)) {
                found2 = true;
            }
            current = current.next;
        }

        if (!found1 || !found2) {
            return 100;
        }

        if (firstNumber > secondNumber) {
            return 101;
        } else if (firstNumber < secondNumber) {
            return 102;
        } else {
            return 103;
        }

    }

    public LinkedList greaterThanGivenValue(int value) {
        LinkedList greaterValues = new LinkedList();
        Node current = head;
        System.out.println(); // Adds space between test cases

        while (current != null) {
            if (current.data > value) {
                greaterValues.add(current.data);
            }
            current = current.next;
        }

        if (greaterValues.isEmpty()) {
            greaterValues.printList();
        }else{
            greaterValues.printList();
        }
        return greaterValues;

    }
    public void printingNodes(int result,int searchedValue){
            if (result != -1) {
                System.out.println("Node " + searchedValue + " is found at " + result + " Position");
            } else {
                System.out.println("Node " + searchedValue + " does not exist");
            }
        }



    public int searchForTheNode(int numberOfNode) {
        Node current = head;
        int index = 0;

        while (current != null) {
            index++;
            if (current.data.equals(numberOfNode)) {
                return index;// Return the 1-based index where the node is found
            }
            current = current.next;
        }
            return -1;// Node not found
    }
}
