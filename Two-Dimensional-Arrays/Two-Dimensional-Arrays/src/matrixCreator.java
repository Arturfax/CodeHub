//Zadatak 2

public class matrixCreator {


    //creates and returns a 2D array
    public int[][] create2DArray( int numberRows,int inputColumns) {
        int[][] createdMatrix = new int[numberRows][inputColumns];

        //fill the matrix with values
        for (int index = 0; index < numberRows; index++) {
            for (int j = 0; j < inputColumns; j++) {
                //makes the first column and row start from the numner 1
                if(index ==0 || j==0 ){
                    createdMatrix[index][j] = 1;
                }else {
                    createdMatrix[index][j] = index + j;
                }
            }
        }
        return createdMatrix;
    }
}
