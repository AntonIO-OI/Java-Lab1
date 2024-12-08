package org.example;

import java.util.Random;

public class RandomMatrixGenerator {
    private static final int MAX_VALUE = 100;

    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE);
            }
        }

        return matrix;
    }
}
