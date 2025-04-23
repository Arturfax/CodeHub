package Zadatak5;
import Zadatak3.Zadatak3;

public class Zadatak5 {
    private int[] niz={4,6,3,73,8,9,2,32,45};

    public int AverageOfNiz(){
        int BrojClanova=(niz.length+1)/2;
        int Average=Zadatak3.getSum(niz)/BrojClanova;
        return Average;
    }
    public void printAverage(int array[]){
        for(int i: array){
            if(niz[i]>AverageOfNiz()){
                System.out.println(niz[i]);
            }
        }
    }

}
