
public class Main {

     public static void main(String[] args) {
            DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
            list.add(3);
            list.add(5);
            list.add(2);
            list.add(7);
            list.printList();// Expected: 3 5 2 7 END
            list.removeAtPosition(3);
            list.printList();
            System.out.printf("Average number of List is => %.2f%n", list.averageOfList());


        }
    }



