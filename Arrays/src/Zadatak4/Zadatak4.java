package Zadatak4;
import Zadatak2.Zadatak2;

public class Zadatak4 {
    private static int[] niz={1,2,3,4,5,6,7,8,9,10};

    public static int[] ParnePozicije(){
        int size=(niz.length+1)/2;
        int[] NoviNiz=new int[size];
        int j=0;
        for (int i=0;i<niz.length;i+=2){
            NoviNiz[j++]=niz[i];
        }
        return NoviNiz;
    }

    public static void main(String[] args) {
        System.out.println("Elementi na parnim pozicijama");
        int[] ParniElementi=ParnePozicije();
        Zadatak2.ispis(ParniElementi);
    }
}
