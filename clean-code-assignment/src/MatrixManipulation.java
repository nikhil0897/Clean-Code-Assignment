import java.util.Scanner;

/**
 * @author Nikhil Sharma
 */

public class MatrixManipulation {

    /**
     * This function is converting rows of matrix[][] to 0 according to the occurrences of '0' in matrix[][]
     * @param matrix is the initial 2D matrix
     * @param rowCheck is the new array that we created in order to convert particular rows to 0
     */
    private static void convertRowsZero(int matrix[][], int rowCheck[]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(rowCheck[i] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /**
     * This function is converting columns of matrix[][] to 0 according to the occurrences of '0' in matrix[][]
     * @param matrix is the initial 2D matrix
     * @param columnCheck is the new array that we created in order to convert particular columns to 0
     */
    private static void convertColumnsZero(int matrix[][], int columnCheck[]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]!=0 && columnCheck[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /**
     * This function is setting particular elements of rowCheck[] and columnCheck[] to 0 in
     * order to convert matrix[][] accordingly later on
     * @param matrix
     * @return statement is returning the modified matrix with all the rows and columns containing
     *         any '0'converted entirely to 0
     */
    public static int[][] manipulateMatrixWithZero(int matrix[][]) {
        int i, j, rowSize = matrix.length, columnSize = matrix[0].length;
        int rowCheck[] = new int[rowSize], columnCheck[] = new int[columnSize];
        for (i = 0; i < rowSize; i++) {    // initializing this with 1
            rowCheck[i] = 1;
        }
        for (i = 0; i < columnSize; i++) {
            columnCheck[i] = 1;
        }
        for (i = 0; i < rowSize; i++) {     // setting 0 at some places in rowCheck[] and columnCheck[]
            for (j = 0; j < columnSize; j++) {      // according to the occurrence of '0' in matrix[][]
                if (matrix[i][j] == 0) {
                    rowCheck[i] = 0;
                    columnCheck[j] = 0;
                }
            }
        }
        convertRowsZero(matrix, rowCheck);
        convertColumnsZero(matrix, columnCheck);

        return matrix;
    }

    /**
     * This function is displaying the final matrix
     * @param matrix
     */
    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * This is the main(), here I am taking input from the user for number or rows and columns
     * and then input to the 2D matrix[][]
     * @param args
     */
    public static void main(String args[]) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of rows and columns: ");
            int numberOfRow = input.nextInt();
            int numberOfColumn = input.nextInt();
            int[][] matrix = new int[numberOfRow][numberOfColumn];
            System.out.println("Enter data in the matrix: ");
            for( int i=0; i<numberOfRow; i++ ) {
                for( int j=0; j<numberOfColumn; j++ ) {
                    matrix[i][j] = input.nextInt();
                }
            }
            int modifiedMatrix[][] = manipulateMatrixWithZero(matrix);
            System.out.println();
            System.out.println("This is the modified matrix: ");
            printMatrix(modifiedMatrix);
        } catch (NegativeArraySizeException negativeMatrixSize) {
            System.out.println("Row or Column size can't be negative.");
        }
    }

}

/**
 * Time Complexity of this code: O(M*N), where M is the number of rows and N is the number of columns
 * Auxiliary Space: O(M+N)
 *
 * Good practices that I have followed while writing this code:
 * 1. A function should be small.
 * 2. A function’s name should be written in such a way that it explains what the function is doing here.
 * 3. A function should do only one thing, and they should do it well.
 * 4. Use of exceptions rather than returned error codes.
 * 5. No function has more than two arguments passed inside.
 * 6. Descriptive names has been assigned to all the functions.
 * 7. The code is readable with a top-down approach.
 * 8. Name of all the functions are kept as a verb.
 * 9. Rule of structured programming is being followed here. Every function has one entry and one exit, no break or continue either.
 */