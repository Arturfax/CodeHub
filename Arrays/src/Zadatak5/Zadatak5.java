package Zadatak5;
import Zadatak3.Zadatak3;

public class Zadatak5 {

    public int Average(int[] array){
        Zadatak3 zadatak3 = new Zadatak3();
        int AverageNumber=zadatak3.getSum(array)/ array.length;
        return AverageNumber;
    }
    public void printAverage(int[] array){
       int avg=Average(array);
        for(int number: array){
            if(number>avg){
                System.out.println(number);
            }
        }
    }


}
