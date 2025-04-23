package Zadatak2;

public class Zadatak2 {
    private static int[] niz={1,2,3,4,5,6,7,8,9,10};

    public static void ispis(int array[]){
        for(int value : array){
            System.out.print(value+" ");
        }
    }


    public static void main(String[] args) {
        ispis(niz);
    }
}
