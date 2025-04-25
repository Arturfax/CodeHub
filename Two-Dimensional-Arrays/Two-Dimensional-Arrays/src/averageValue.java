public class averageValue {

    public double calculateAverageOfRow(int rowIndex, int numberRows, int numberColumns) {
        matrixCreator createdArray = new matrixCreator();
        int[][] matrix = createdArray.create2DArray(numberRows, numberColumns);

        if (rowIndex < 0 || rowIndex >= numberRows) {
            System.out.println("Invalid row index!");
            return -1;
        }

        int sum = 0;
        for (int value : matrix[rowIndex]) {
            sum += value;
        }

        return (double) sum / numberColumns;
    }
}
