package Zadatak5;
import Zadatak3.Zadatak3;

public class Zadatak5 {
    private static int[] niz={4,6,3,73,8,9,2,32,45};

    public static int AverageOfNiz(){
        int BrojClanova=(niz.length+1)/2;
        int Average=Zadatak3.getSum(niz)/BrojClanova;
        return Average;
    }
    public static void Ispis(){
        for(int i=0;i<niz.length;i++){
            if(niz[i]>AverageOfNiz()){
                System.out.println(niz[i]);
            }
        }
    }
    public static void main(String[] args) {
        Ispis();
    }




}
