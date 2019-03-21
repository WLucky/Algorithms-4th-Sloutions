package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex13 {
    public static void transpositionArray(int[][] Metrix, int rows, int columns) {
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows; r++) {
                StdOut.print(Metrix[r][c]);
            }
            StdOut.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        transpositionArray(a, 2, 3);
    }
}
