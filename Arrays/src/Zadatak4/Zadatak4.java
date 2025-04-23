package Zadatak4;
import Zadatak2.Zadatak2;

public class Zadatak4 {

    public int[] evenPositions(int[] array){
        int size=(array.length+1)/2;
        int[] NewArray=new int[size];
        int j=0;
        for (int i=0;i<array.length;i+=2){
            NewArray[j++]=array[i];
        }
        return NewArray;
    }



}
