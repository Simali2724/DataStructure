

import java.util.Arrays;
import java.util.Scanner;

public class ConvertAccendingorderrow {

    // Function to sort each row of the matrix
    static void sortRows(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            // Sorting each row using Arrays.sort()
            Arrays.sort(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix dimensions as input
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declare a matrix
        int[][] matrix = new int[rows][cols];

        // Taking matrix elements as input from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Sort each row of the matrix
        sortRows(matrix, rows, cols);

        // Display the matrix after sorting each row
        System.out.println("\nMatrix After Sorting Each Row in Ascending Order:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
