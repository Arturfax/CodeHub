//Zadatak 2

public class matrixCreator {
    //creates and returns a 2D array
    public int[][] create2DArray(int rows, int columns) {
        int[][] createdMatrix = new int[rows][columns];

        //fill the matrix with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //makes the first column and row start from the numner 1
                if(i==0 || j==0 ){
                    createdMatrix[i][j] = 1;
                }else {
                    createdMatrix[i][j] = i * j;
                }
            }
        }

        return createdMatrix;
    }
}
