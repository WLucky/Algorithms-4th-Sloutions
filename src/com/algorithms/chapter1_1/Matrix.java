package com.algorithms.chapter1_1;

/*Ex33*/
public class Matrix {
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) return -1;
        int dotRest = 0;
        for (int i = 0; i < x.length; i++) {
            dotRest += x[i] * y[i];
        }
        return dotRest;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        int N;
        if ((N = a[0].length) != b.length) {
            return null;
        }
        double[][] multRest = new double[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                /*求multRest[r][c]*/
                for (int i = 0; i < N; i++) {
                    multRest[r][c] += a[r][i] * b[i][c];
                }
            }
        }

        return multRest;
    }

    public static double[][] transpose(double[][] a) {
        int R = a.length;
        int C = a[0].length;
        double[][] transposeRest = new double[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                transposeRest[i][j] = a[j][i];
            }
        }
        return transposeRest;
    }

    public static double[] mult(double[][] a, double[] x) {
        int N = x.length;
        if (N != a[0].length) {
            return null;
        }

        double[] reslt = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                reslt[i] += a[i][j] * x[j];
            }
        }
        return reslt;
    }

    public static double[] mult(double[] y, double[][] a) {
        int N = y.length;
        if (N != a.length) {
            return null;
        }

        double[] reslt = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                reslt[i] += y[j] * a[j][i];
            }
        }
        return reslt;
    }

}
