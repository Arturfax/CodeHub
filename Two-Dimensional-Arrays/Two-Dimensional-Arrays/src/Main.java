import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // Input number of rows and columns
        System.out.println("Enter number of Rows and Columns to build a Matrix:");
        int numberRows = scanner.nextInt();
        int numberColumns = scanner.nextInt();

                // Create Matrix object
        Matrix matrixOperations = new Matrix(numberRows, numberColumns);

                // Zadatak 1: Print the matrix
        matrixOperations.printMatrix();

                // Input row number for average
        System.out.println("Enter the number of a Row to calculate the average:");
        int rowToAverage = scanner.nextInt();
        int realRowToAverage = rowToAverage - 1;

                // Zadatak 3: Calculate average value of selected row
        double average = matrixOperations.calculateAverageOfRow(realRowToAverage);

                if (average != -1) {
                    System.out.println("Average of row " + rowToAverage + " is: " + average);
                }

                // Checking if the matrix is square
                if (numberRows == numberColumns) {
                    // Zadatak 4: Print Main Diagonal
                    matrixOperations.printMainDiagonal();

                    // Zadatak 5: Print Numbers Above Diagonal
                    matrixOperations.numbersAboveDiagonal();
                }

                scanner.close();
            }


    }
