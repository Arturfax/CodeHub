package Zadatak3;

public class Zadatak3 {
    private static int[] niz={4,6,5,7,88,9};

    public static int getSum(int[] array) {
        int ukupno = 0;
        for (int broj: array) {
            ukupno += broj;
        }
        return ukupno;

    }
    public static void main(String[] args) {
        System.out.println("Suma brojeva niza je:"+ getSum(niz));

    }
}
