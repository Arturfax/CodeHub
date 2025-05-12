public class LinkedList<T extends Number> {

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
            System.out.println("\nCan't delete done, because node at that position doesn't exist");
            return;
        }

        current.next = current.next.next;
    }
    

    public void printList() {
        System.out.println();
        Node current = head;
        if(current == null){
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

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


        public double averageOfList() {
            if (head == null) {
                System.out.println("List is empty.");
                return 0;
            }

            Node current = head;
            double sum = 0;
            int count = 0;

            while (current != null) {
                sum += current.data.doubleValue(); // Convert T to double
                count++;
                current = current.next;
            }

            return sum / count;
        }
        public void clearList(){
        head = null;
        }

        public void compareElements(int firstNumber, int secondNumber) {

         boolean found1 = false;
         boolean found2 = false;

         Node current = head;

                         // Traverse the list to check for the presence of both values
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
        System.out.println("One or both values not found in the list.");
        return;
    }

    // Both values are found, now compare them
        double d1 = firstNumber;
        double d2 = secondNumber;

    if (d1 > d2) {
        System.out.println("First number is greater than second number");
    } else if (d1 < d2) {
        System.out.println("Second number is greater than first number");
    } else {
        System.out.println("The numbers are equal");
    }
}

    public void greaterThanGivenValue(int value){
        Node current = head;
        int counter=0;
        System.out.println();//ads space between test cases
        while (current != null) {
            if (current.data.doubleValue() > value) {
                System.out.print(current.data+" is greater than " + value+", ");
                counter++;
            }
            current = current.next;
            if (current == null && counter == 0) {//it prints cant find greater than only if no previous number was found
                System.out.println("Can't find greater than " + value);
            }
            }
        }
        public void searchForTheNode(int numberOfNode){
            Node current = head;
            int index = 0;
            int counter = 0;
            while (current != null) {
                index++;
                if (current.data.equals(numberOfNode)) {
                    System.out.println("Node is found at  "+index+" Position ");
                    counter++;
                }
                current = current.next;
                if(current == null && counter == 0){
                    System.out.println("Node does not exist");
                }
            }
        }


}