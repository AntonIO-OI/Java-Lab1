package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixOperationsTest {

    @Test
    void testPerformBitwiseXor_ValidMatrices() {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrixB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] expected = {
                {8, 10, 4},
                {2, 0, 2},
                {4, 10, 8}
        };

        int[][] result = MatrixOperations.performBitwiseXor(matrixA, matrixB);
        assertArrayEquals(expected, result);
    }

    @Test
    void testPerformBitwiseXor_DifferentDimensions() {
        int[][] matrixA = {
                {1, 2},
                {3, 4}
        };
        int[][] matrixB = {
                {1, 2, 3}
        };

        assertThrows(IllegalArgumentException.class, () -> MatrixOperations.performBitwiseXor(matrixA, matrixB));
    }

    @Test
    void testCalculateSumOfMaxElementsInRows() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = MatrixOperations.calculateSumOfMaxElementsInRows(matrix);
        assertEquals(18, result); // Max elements: 3, 6, 9
    }

    @Test
    void testCalculateSumOfMaxElementsInRows_EmptyMatrix() {
        int[][] emptyMatrix = {};

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> MatrixOperations.calculateSumOfMaxElementsInRows(emptyMatrix));

        assertEquals("Matrix cannot be empty.", exception.getMessage());
    }
}
