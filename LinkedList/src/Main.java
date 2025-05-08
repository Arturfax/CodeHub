
import java.util.*;

public class Main {

     public static void main(String[] args) {
            LinkedList list = new LinkedList<>();
            list.add(10);
            list.add(20);
            list.add(30);

            list.printList(); // Output: 10 -> 20 -> 30 -> null

            list.removeAtPosition(2);
            list.printList(); // Output: 10 -> 30 -> null

            list.addAtPosition(2,77);
            list.printList();
            System.out.println("Element at index 1: " + list.get(1)); // Output: 30
        }
    }



