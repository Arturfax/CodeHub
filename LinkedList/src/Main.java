
public class Main {

     public static void main(String[] args) {
            LinkedList list = new LinkedList();

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
            int result = list.compareElements(2,3);
            list.printComparedElements(result);
            list.clearList();

            //test case 2
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            result=list.compareElements(3,2);
            list.printComparedElements(result);
            list.clearList();

            //test case 3
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            result =list.compareElements(3,3);
            list.printComparedElements(result);
            list.clearList();

            //test case 4
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            result= list.compareElements(3,33);
            list.printComparedElements(result);
            list.clearList();

            //test case 5
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            result=list.compareElements(2,3);
            list.printComparedElements(result);
            list.add(6);
            result=list.compareElements(6,5);
            list.printComparedElements(result);
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
            list.clearList();*/

            //Test cases SEARCH FOR NODE IN LIST
           //test case 1
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            int node=list.searchForTheNode(3);
            list.printingNodes(node,42);
            list.clearList();

            //test case 2
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            node=list.searchForTheNode(-11);
            list.printingNodes(node,-11);
            list.clearList();

            //test case 3
            list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
            node=list.searchForTheNode(2);
            list.printingNodes(node,2);
            list.addAtPosition(1,6);
            node=list.searchForTheNode(2);
            list.printingNodes(node,2);
            list.clearList();



/*
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
            list.clearList();*/

           /* //Sorted Linked List TEST CASES part 2
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

        }
    }



