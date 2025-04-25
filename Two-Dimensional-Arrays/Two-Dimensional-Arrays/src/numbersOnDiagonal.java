public class numbersOnDiagonal {


    public void printMainDiagonal(int rows,int columns) {
        matrixCreator creator = new matrixCreator();
        int[][] matrix = creator.create2DArray(rows, columns);

        System.out.println("Diagonal values are:");
        for (int index = 0; index < rows; index++) {
            System.out.print(matrix[rows-1- index][index] + "\t");
        }
        System.out.println();
    }

}
