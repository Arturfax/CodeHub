
public class Main {

     public static void main(String[] args) {


            DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
            System.out.println("== INSERT START & END ==");
            list.add(3);
            list.add(5);
            list.add(2);
            list.add(7);
            list.printList(); // Expected: 2 3 5 7 END

        }
    }



