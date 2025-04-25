public class numbersAboveDiagonal {

    public void numbersAboveDiagonal(int rows, int columns) {
        matrixCreator matrix = new matrixCreator();
        int[][] newMatrix = matrix.create2DArray(rows, columns);

        System.out.println("New Two-Dimensional-Array with only numbers above diagonal");

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                if (row + col < rows - 1) {
                    System.out.print(newMatrix[row][col] + " ");
                }

            }
            System.out.println();

        }


    }
}
