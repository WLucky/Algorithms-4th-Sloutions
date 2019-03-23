package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex33 {
    public static void printVector(double[] x) {
        for (int i = 0; i < x.length; i++) {
            StdOut.printf("%6.1f ", x[i]);
        }
        StdOut.println();
    }

    public static void printMatrix(double[][] x) {
        int R = x.length;
        int C = x[0].length;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                StdOut.printf("%6.1f ", x[i][j]);
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        double[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] b = {{2, 1, 3}, {6, 5, 4}, {9, 8, 7}};
        double[] x = {1, 2, 3};
        double[] y = {4, 5, 6};

        StdOut.println("The Matrix a is");
        printMatrix(a);
        StdOut.println("The Matrix b is");
        printMatrix(b);
        StdOut.println("The Vector x is");
        printVector(x);
        StdOut.println("The Vector y is");
        printVector(y);

        StdOut.print("The vector dot product of x y is: ");
        StdOut.println(Matrix.dot(x, y));

        StdOut.println("The matrix-matrix product of a b is: ");
        printMatrix(Matrix.mult(a, b));

        StdOut.println("The transpose of a is: ");
        printMatrix(Matrix.transpose(a));

        StdOut.println("The matrix-vector product of a x is: ");
        printVector(Matrix.mult(a, x));

        StdOut.println("The vector-matrix product of y ais: ");
        printVector(Matrix.mult(y, a));
    }
}
