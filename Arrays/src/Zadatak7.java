public class Zadatak7 {

    public int[] swapElements(int[] array){
        for(int i = 0; i < array.length-1; i+=2){
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }

        return  array;
    }
}
