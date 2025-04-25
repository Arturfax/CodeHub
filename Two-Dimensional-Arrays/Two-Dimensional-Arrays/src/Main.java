import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.println("Enter number of Rows and Columns to build an Matrix");
        int numberRows = scanner.nextInt();
        int numberColumns = scanner.nextInt();

        // Zadatak 1: Print the matrix
        matrixPrinter twoDimensionalArray = new matrixPrinter();
        twoDimensionalArray.printMatrix(numberRows, numberColumns);

        // Input row number for average
        System.out.println("Enter the number of a Row to calculate the average:");
        int rowToAverage = scanner.nextInt();
        //-1 because computer counts from 0
        int realRowToAverage = rowToAverage-1;
        // Zadatak 3: Calculate average value of selected row
        averageValue avgCalculator = new averageValue();
        double average = avgCalculator.calculateAverageOfRow(realRowToAverage, numberRows, numberColumns);

        if (average != -1) {
            System.out.println("Average of row " + realRowToAverage + " is: " + average);
        }

        //Zadatak 4 Printing the numbers on the Main diagonal of Matrix
        if(numberRows==numberColumns) {
            numbersOnDiagonal diag = new numbersOnDiagonal();
            diag.printMainDiagonal(numberRows, numberColumns);
        }
        scanner.close();
    }
}
