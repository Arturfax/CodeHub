import Zadatak5.Zadatak5;

public class Main {

    public static void main(String[] args) {
        int[] niz={1,2,3,4,5,6,7,8,9,10};

        Zadatak1 zadatak1 = new Zadatak1();
        printName(zadatak1.getName(3));
        Zadatak5 zadatak5 = new Zadatak5();
        zadatak5.printAverage(niz);
            }

    public static void printName(String name){
        System.out.println("Ime na datom indexu je "+ name);
    }
}

