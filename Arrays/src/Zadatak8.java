import Zadatak2.Zadatak2;

public class Zadatak8 {
    public int[] sortArray(int[] array) {
        // Simple bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        return array;
    }
}
