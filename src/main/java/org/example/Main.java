package org.example;

public class Main {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        int[][] matrixA = RandomMatrixGenerator.generateMatrix(rows, cols);
        int[][] matrixB = RandomMatrixGenerator.generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);

        try {
            int[][] matrixC = MatrixOperations.performBitwiseXor(matrixA, matrixB);
            System.out.println("Matrix C (A ^ B):");
            printMatrix(matrixC);

            int sumOfMaxElements = MatrixOperations.calculateSumOfMaxElementsInRows(matrixC);
            System.out.println("Sum of the largest elements in each row of matrix C: " + sumOfMaxElements);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
        System.out.println();
    }
}
