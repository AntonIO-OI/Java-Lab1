package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomMatrixGeneratorTest {

    @Test
    void testGenerateMatrix_Dimensions() {
        int rows = 4;
        int cols = 5;

        int[][] matrix = RandomMatrixGenerator.generateMatrix(rows, cols);

        assertEquals(rows, matrix.length);
        assertEquals(cols, matrix[0].length);
    }

    @Test
    void testGenerateMatrix_RandomValuesWithinRange() {
        int rows = 3;
        int cols = 3;
        int maxValue = 100;

        int[][] matrix = RandomMatrixGenerator.generateMatrix(rows, cols);

        for (int[] row : matrix) {
            for (int value : row) {
                assertTrue(value >= 0 && value < maxValue, "Value out of range: " + value);
            }
        }
    }
}
