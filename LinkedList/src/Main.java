
public class Main {

     public static void main(String[] args) {
            LinkedList list = new LinkedList<>();

           /*//Test Case 1
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

            //TEST CASES COMPARING ELEMENTS
            //test case 1
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.compareElements(2,3);
            list.clearList();

            //test case 2
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.compareElements(3,2);
            list.clearList();

            //test case 3
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.compareElements(3,3);
            list.clearList();

            //test case 4
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.compareElements(3,33);
            list.clearList();

            //test case 5
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.compareElements(2,3);
            list.add(6);
            list.compareElements(6,5);
            list.clearList();


            //Test Cases Greater Than Given Number
               //test case 1
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.greaterThanGivenValue(3);
            list.clearList();

            //test case 2
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.greaterThanGivenValue(33);
            list.clearList();

            //test case 3
            list.add(4);list.add(3);list.add(1);list.add(2);list.add(5);
            list.greaterThanGivenValue(3);
            list.clearList();

            //test case 4
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.greaterThanGivenValue(3);
            list.addAtPosition(4,6);
            list.greaterThanGivenValue(3);
            list.clearList();

            //Test cases SEARCH FOR NODE IN LIST
            //test case 1
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.searchForTheNode(3);
            list.clearList();

            //test case 2
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.searchForTheNode(-11);
            list.clearList();

            //test case 3
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            list.searchForTheNode(2);
            list.addAtPosition(1,6);
            list.searchForTheNode(2);
            list.clearList();

            //TEST CASES SORTING LINKED LIST

            //test case 1
            list.add(2);list.add(4);list.add(3);list.add(1);list.add(5);
            System.out.println("Before Sorting");
            list.printList();
            SortedLinkedList.sortList(list);
            System.out.println("\nAfter Sorting");
            list.printList();
            list.clearList();

            //test case 2
            list.add(2);list.add(4);list.add(3);list.add(1);list.add(5);
            list.addAtPosition(0,6);
            System.out.println("\nBefore Sorting");
            list.printList();
            SortedLinkedList.sortList(list);
            System.out.println("\nAfter Sorting");
            list.printList();
            list.clearList();

            //test case 3
            list.add(2);list.add(4);list.add(3);list.add(1);list.add(5);
            list.addAtPosition(0,6);
            list.addAtPosition(1,7);
            System.out.println("\nBefore Sorting");
            list.printList();
            SortedLinkedList.sortList(list);
            System.out.println("\nAfter Sorting");
            list.printList();
            list.clearList();

            //Sorted Linked List TEST CASES part 2
            //test 1
            SortedLinkedList list2 = new SortedLinkedList();//new object using SortedLinkedList
            list2.add(10);list2.add(9);list2.add(8);list2.add(7);list2.add(6);list2.add(5);
            list2.add(4);list2.add(3);list2.add(2);list2.add(1);
            list2.sortList();
            list2.printList();
            list2.clearList();

            //test 2
            list2.add(-1);list2.add(0);list2.add(-2);list2.add(3);list2.add(4);list2.add(5);
            list2.sortList();
            list2.printList();
            list2.clearList();

            //test 3
            list2.add(100);list2.add(4);list2.add(-100);list2.add(0);list2.add(4);
            list2.sortList();
            list2.printList();
            list2.clearList();

            //test 4
            list2.add(0);list2.add(5);list2.add(0);
            list2.sortList();
            list2.printList();
            list2.clearList();*/

            DoublyLinkedList<Integer> list3 = new DoublyLinkedList<>();
            System.out.println("== INSERT START & END ==");
            list3.add(3);
            list3.add(5);
            list3.add(2);
            list3.add(7);
            list3.printList(); // Expected: 2 3 5 7 END
            // DoubleLinkedList.Node node=list.getNode(10);*/
/*
            System.out.println("== INSERT AT POSITION ==");
            list.Insert(4, 2); // Insert 4 at index 2
            list.display(); // Expected: 2 3 4 5 7 END

            System.out.println("== DELETE FROM START ==");
            list.deleteFromStart();
            list.display(); // Expected: 3 4 5 7 END

            System.out.println("== DELETE FROM END ==");
            list.deleteFromEnd();
            list.display(); // Expected: 3 4 5 END

            System.out.println("== DELETE AT INDEX 1 ==");
            list.delete(1); // Remove 4
            list.display(); // Expected: 3 5 END

            System.out.println("== AVERAGE ==");
            double avg = list.average();
            System.out.println("Average: " + avg); // Expected: 4.0

            System.out.println("== GET INDEX OF VALUE ==");
            int index = list.getIndex(5);
            System.out.println("Index of 5: " + index); // Expected: 1

            System.out.println("== COMPARE NODES (0 vs 1) ==");
            int maxIndex = list.compareNodes(0, 1);
            System.out.println("Greater node index: " + maxIndex); // Expected: 1

            System.out.println("== DISPLAY > 3 ==");
            list.displayGraterthan(3); // Expected: 5 END

            System.out.println("== ADDITIONAL INSERTIONS ==");
            list.InsertEnd(10);
            list.InsertEnd(12);
            list.InsertEnd(1);
            list.display(); // Expected: 3 5 10 12 1 END

            System.out.println("== DISPLAY > 6 ==");
            list.displayGraterthan(6); // Expected: 10 12 END
*/

        }
    }



