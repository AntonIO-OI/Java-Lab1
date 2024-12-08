package org.example;

public class MatrixOperations {
    public static int[][] performBitwiseXor(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] ^ matrixB[i][j];
            }
        }

        return result;
    }

    public static int calculateSumOfMaxElementsInRows(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix cannot be empty.");
        }

        int sum = 0;

        for (int[] row : matrix) {
            int max = Integer.MIN_VALUE;
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
            sum += max;
        }

        return sum;
    }
}
