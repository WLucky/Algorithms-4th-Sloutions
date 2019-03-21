package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex11 {
    public static void printTwoDimenArray(boolean[][] array, int row, int column) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (array[r][c]) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
            }
            StdOut.print("\n");
        }
    }

    public static void main(String[] args) {
        boolean[][] a = {{false, true, true}, {true, false, true}, {true, true, false}};

        printTwoDimenArray(a, 3, 3);
    }
}
