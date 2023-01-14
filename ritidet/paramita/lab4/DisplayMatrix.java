package ritidet.paramita.lab4;

import java.util.Scanner;
/**
* This DisplayMatrix program is the program that creat matrix with row and column by number
* that user input ,and numbers in matrix is numbers from input to. This program have nine method : 
* 1. inputMatrix() reads the number of rows and columns for rowDim and colDim. 
* Then the method uses those numbers to create the matrix.  Then the method repeatedly 
* asks to enter each element in the matrix. The example output is shown in Figure 12.
* 2. showMatrix() show the original matrix that has been entered.
* 3. showMatrixByRow() shows the matrix by row.
* 4. showMatrixByColumn() shows the matrix by column.
* 5. showMatrixByRowBackward() shows the matrix by row backward.
* 6. showMatrixByColumnBackward() shows the matrix by column backward.
* 7. showMatrixByDiagonalTopLeftBottomRight() shows the diagonal elements of the matrix 
* from the top left to the bottom right.
* 8. showMatrixByDiagonalTopRightBottomLeft() shows the diagonal elements of the matrix 
* from the top right to the bottom left.
* 9. showMatrixByRowZigzag() shows the matrix by row zigzag
*
* @author Paramita ritidet 
* @version 1.0, 14/1/2023
*
*/

public class DisplayMatrix {
    static int[][] matrix; // 2-dimensional int array named matrix
    static int rowDim, colDim; // the number of rows and columns respectively
    final static Scanner input = new Scanner(System.in); // open new scanner
    /**
     * this main method is run for nine method 
     * inputMatrix() Method that reads the number of rows and columns
     * and uses those numbers to create the matrix.
     * showMatrix() Method that show the original matrix that has been entered.
     * showMatrixByRow() Method that shows the matrix by row.
     * showMatrixByColumn() Method that hows the matrix by column.
     * showMatrixByRowBackward() Method that shows the matrix by row backward.
     * showMatrixByColumnBackward() Method that shows the matrix by column backward.
     * showMatrixByDiagonalTopLeftBottomRight() Method that shows the diagonal elements of the matrix
     * from the top left to the bottom right.
     * showMatrixByDiagonalTopRightBottomLeft() Method that shows the diagonal elements of the matrix
     * from the top right to the bottom left.
     * showMatrixByRowZigzag() Method that shows the matrix by row zigzag
     * @param args command line arguments
     */

    public static void main(String[] args) {
        inputMatrix(); // Method that reads the number of rows and columns
        // and uses those numbers to create the matrix.
        showMatrix(); // Method that show the original matrix that has been entered.
        showMatrixByRow(); // Method that shows the matrix by row.
        showMatrixByColumn(); // Method that hows the matrix by column.
        showMatrixByRowBackward(); // Method that shows the matrix by row backward.
        showMatrixByColumnBackward(); // Method that shows the matrix by column backward.
        showMatrixByDiagonalTopLeftBottomRight(); // Method that shows the diagonal elements of the matrix
        // from the top left to the bottom right.
        showMatrixByDiagonalTopRightBottomLeft(); // Method that shows the diagonal elements of the matrix
        // rom the top right to the bottom left.
        showMatrixByRowZigzag(); // Method that shows the matrix by row zigzag
    }

    static void inputMatrix() {
        System.out.print("Enter the size of the matrix (number of rows then number of columns) : ");
        rowDim = input.nextInt(); // get number of matrix row
        colDim = input.nextInt(); // get number of matrix column
        matrix = new int[rowDim][colDim]; // creat matrix that have size by rowDim and colDim
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print("Enter element at row " + i + " column " + j + " : ");
                int number_in_matrix = input.nextInt(); // get number in matrix from input
                matrix[i][j] = number_in_matrix; // Take numbers from input to matrix
                // System.out.println();
            }
        }
        input.close();

    }

    static void showMatrix() {
        System.out.println("Show the original matrix");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void showMatrixByRow() {
        System.out.print("Show the matrix by row : ");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByColumn() {
        System.out.print("Show the matrix by culumn : ");
        for (int j = 0; j < colDim; j++) {
            for (int i = 0; i < rowDim; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByRowBackward() {
        System.out.print("Show the matrix by row backward : ");
        for (int i = rowDim - 1; i >= 0; i--) {
            for (int j = colDim - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByColumnBackward() {
        System.out.print("Show the matrix by column backward : ");
        for (int j = colDim - 1; j >= 0; j--) {
            for (int i = rowDim - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByDiagonalTopLeftBottomRight() {
        System.out.print("show the diagonal elements of the matrix from top-left to the bottom-right : ");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    static void showMatrixByDiagonalTopRightBottomLeft() {
        System.out.print("show the diagonal elements of the matrix from top-right to bottom-left : ");
        for (int i = 0; i < rowDim; i++) {
            for (int j = colDim - 1; j >= 0; j--) {
                if (i + j == colDim - 1) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    static void showMatrixByRowZigzag() {
        System.out.print("Show the matrix by row zigzag : ");
        for (int i = 0; i < rowDim; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < colDim; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = colDim - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}