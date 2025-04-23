package Zadatak4;
import Zadatak2.Zadatak2;

public class Zadatak4 {

    public int[] evenPositions(int[] array){
        int size=(array.length+1)/2;
        int[] newArray=new int[size];
        int newIndex=0;
        for (int index=0;index<array.length;index+=2){
            newArray[newIndex++]=array[index];
        }
        return newArray;
    }



}
