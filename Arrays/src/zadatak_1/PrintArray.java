package zadatak_1;

import java.util.ArrayList;
import java.util.List;

public class PrintArray {
    private static int [] niz={1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        System.out.println("clanovi niza su");
        final List<Integer> listOfIntegers=getArrayValues(niz);
        System.out.println(listOfIntegers);
    }

    private static List<Integer> getArrayValues(int [] arr){
        final List<Integer> listOfIntegers=new ArrayList<>();
        for (int i:  niz){
            listOfIntegers.add(i);
        }
        return listOfIntegers;
    }

}
