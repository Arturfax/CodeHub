public class Zadatak7 {

    public void swapElements(int[] array){
        for(int i = 0; i < array.length-1; i+=2){
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
