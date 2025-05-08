
import java.util.*;

public class Main {

     public static void main(String[] args) {
            LinkedList list = new LinkedList<>();
           //Test Case 1
            list.add(45);list.add(2);list.add(2);list.add(4);list.add(58);
            list.printList();
            // Output 45,2,2,4,58
            list.clearList();

            //Test Case 2
            list.add(45);list.add(5);
            list.printList();
            list.clearList();


            // Test Case 3 not adding to list
            list.printList();

            //TEST CASES ADDING TO POSITION

            //test case 1
            list.add(5);list.add(3);list.add(2);list.add(1);
            list.addAtPosition (2, 6);
            list.printList();
            list.clearList();

            //test case 2
            list.add(5);list.add(3);list.add(2);list.add(1);
            list.addAtPosition (0, 6);
            list.printList();
            list.clearList();
            //test case 3
            list.addAtPosition (0, 6);
            list.printList();
            list.clearList();
            //test case 4
            list.add(5);list.add(3);list.add(2);list.add(1);
            list.addAtPosition (0, 23);
            list.printList();
            list.addAtPosition (0, 6);
            list.printList();
            list.clearList();

            //TEST CASES REMOVING NUMBERS FROM POSITION



           /* System.out.println("Element at index 1: " + list.get(1));
            System.out.print("Average of List is: ");
            System.out.printf("%.2f" , list.averageOfList());*/
        }
    }



