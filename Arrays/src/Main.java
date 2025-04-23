import Zadatak2.Zadatak2;
import Zadatak3.Zadatak3;
import Zadatak4.Zadatak4;
import Zadatak5.Zadatak5;
import Zadatak6.Zadatak6;

public class Main {

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int[] array2={1,8,2,6,7,4,9,6,3,5};
        Zadatak1 zadatak1 = new Zadatak1();
        printName(zadatak1.getName(3));

        Zadatak2 zadatak2 = new Zadatak2();
        System.out.println("\nIspisani svi elementi");
        zadatak2.print(array);

        Zadatak3 zadatak3 = new Zadatak3();
        System.out.println("\nSuma brojeva niza je:"+ zadatak3.getSum(array));


        Zadatak4 zadatak4 = new Zadatak4();
        System.out.println("Elementi na parnim pozicijama");
        int [] evenElements= zadatak4.evenPositions(array);
        zadatak2.print(evenElements);

        Zadatak5 zadatak5 = new Zadatak5();
        System.out.println("\nBrojevi veci od prosecnog");
        zadatak5.printAverage(array);

        Zadatak6 zadatak6= new Zadatak6();
        System.out.println("\nObrnuti redosled niza");
        zadatak6.reverseElements(array);

        Zadatak7 zadatak7 = new Zadatak7();
        System.out.println("\nZamenjeni redosled niza");
        zadatak7.swapElements(array);

        Zadatak8 zadatak8 = new Zadatak8();
        System.out.println("\nSortiran redosled niza");
        zadatak8.sortArray(array2);
            }

    public static void printName(String name){
        System.out.println("Ime na datom indexu je "+ name);
    }

}

