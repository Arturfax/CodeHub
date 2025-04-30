import java.util.LinkedList;
import java.util.*;

public class Main {
    Scanner scanner=new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();//sam napravi objekat

    public void addElements(){
        while(!scanner.hasNextInt())scanner.next();
        int number=scanner.nextInt();
        System.out.println("Enter the elements to be added");
        for(int index=0;index<number;index++){
            list.add(scanner.nextInt());
        }


    }
    public void printList(){
        System.out.print("Output: ");
        for(int index=0;index<list.size();index++) {
            System.out.print(" "+list.get(index));
        }
    }
    public void addAtPosition(){
        Scanner sc=new Scanner(System.in);
        int position= sc.nextInt();
        int value=sc.nextInt();
        if(position<0 || position>list.size()){
            System.out.println("Invalid position");
            return;
        }
        list.add(position, value);
    }

    public void removeElements(){
        Scanner sc=new Scanner(System.in);
        int position= sc.nextInt();
        if(position<0 || position>list.size()){
            System.out.println("Invalid position");
            return;
        }
        list.remove(position);
    }

    public void averageValue(){
        //convert list to array than calculate average of array
        if(list.isEmpty()){
            System.out.println("List is empty");
            //return 0;
        }
        int sum=0;
        for (int value:list){
            sum +=value;
        }
        double average=(double) sum/list.size();
        System.out.println("\nThe average is "+String.format("%.2f",average));
       // return(double) sum/list.size();

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
            Main list=new Main();
            list.addElements();
            list.printList();
            System.out.println("\nEnter the element and Position to be added");

            list.addAtPosition();
            list.printList();
            System.out.println("\nEnter the position from which to remove an element");

            list.removeElements();
            list.printList();
            list.averageValue();
        }
    }
