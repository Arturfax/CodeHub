public class Matrix {


    private int[][] matrix;

    // Constructor to create the matrix
    public Matrix(int numberRows, int numberColumns) {
        this.matrix = create2DArray(numberRows, numberColumns);
    }

    // Creates and returns a 2D array
    private int[][] create2DArray(int numberRows, int inputColumns) {
        int[][] createdMatrix = new int[numberRows][inputColumns];

        // Fill the matrix with values(no zero values)
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < inputColumns; j++) {
                if (i == 0 || j == 0) {
                    createdMatrix[i][j] = 1;
                } else {
                    createdMatrix[i][j] = i + j;
                }
            }
        }
        return createdMatrix;
    }

    // Prints the whole matrix
    public void printMatrix() {
        System.out.println("Array[] X:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Calculates average of a given row
    public double calculateAverageOfRow(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= matrix.length) {
            throw new IllegalArgumentException("Invalid row index: " + rowIndex);
        }

        int sum = 0;
        for (int value : matrix[rowIndex]) {
            sum += value;
        }
        return (double) sum / matrix[rowIndex].length;
    }

    // Prints the main diagonal
    public void printMainDiagonal() {
        System.out.println("Diagonal values are:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[matrix.length - 1 - i][i] + "\t");
        }
        System.out.println();
    }

    // Prints numbers above the diagonal
    public void numbersAboveDiagonal() {
        System.out.println("New Two-Dimensional-Array with only numbers above diagonal:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row + col < matrix.length - 1) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
