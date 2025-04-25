//ZADATAK 1
public class matrixPrinter {

        public void  printMatrix(int rows, int columns) {
            matrixCreator createdArray= new matrixCreator();
            int[][] matrix = createdArray.create2DArray(rows, columns);

            //printing
            for(int[] row: matrix){
                for(int value: row) {
                    System.out.print(value + "\t");

                }
                System.out.println();
            }

        }


}



