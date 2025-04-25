//Zadatak 2

public class matrixCreator {
    //creates and returns a 2D array
    public int[][] create2DArray(int rows, int columns) {
        int[][] createdMatrix = new int[rows][columns];

        //fill the matrix with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                createdMatrix[i][j] = i * j;
            }
        }

        return createdMatrix;
    }
}
