
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

            //test case 1
            list.add(5);list.add(3);list.add(2);list.add(1);
            list.removeAtPosition(0);
            list.printList();//expected 3,2,1
            list.clearList();

            //test case 2
            list.add(5);list.add(3);list.add(2);list.add(1);
            list.removeAtPosition(2);
            list.printList();//expected 5,3,1
            list.clearList();

            //test case 3
            list.add(5);list.add(3);list.add(2);list.add(1);
            list.removeAtPosition(12);//expected error message
            list.clearList();

            //test case 4
            list.add(5);list.add(3);list.add(2);list.add(1);
            list.removeAtPosition(0);
            list.removeAtPosition(1);
            list.printList();//expected 3,1 //
            list.clearList();
            //test case 5

            list.add(5);list.add(3);list.add(2);list.add(1);
            list.removeAtPosition(0);
            list.printList();//Expected 3,2,1
            list.removeAtPosition(0);
            list.printList();//expected 2,1
            list.clearList();
            // AVERAGE VALUE TEST CASES

            //test case 1
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            System.out.println("\nAverage of list is -> "+list.averageOfList());
            list.clearList();

            //test case 2
            list.add(1);list.add(2);list.add(3);list.add(4.5);list.add(5);
            System.out.println("\nAverage of list is -> "+list.averageOfList());
            list.clearList();

            //test case 3
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            System.out.println("\nAverage of list is -> "+list.averageOfList());
            list.addAtPosition(4,6);
            System.out.println("\nAverage of list is -> "+list.averageOfList());

            list.clearList();


        }
    }



