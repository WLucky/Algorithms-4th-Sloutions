package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex27 {
    private static long COUNT = 0;
    private static long COUNT2 = 0;

    public static double binomial(int N, int k, double p) {
        COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double binomialB(int N, int k, double p, double[][] buffer) {
        COUNT2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }

        if (buffer[N][k] != 0) {
            return buffer[N][k];
        }

        buffer[N][k] = (1.0 - p) * binomialB(N - 1, k, p, buffer) + p * binomialB(N - 1, k - 1, p, buffer);

        return buffer[N][k];
    }

    public static void main(String[] args) {
        double[][] buffer = new double[101][51];
        StdOut.println("binomial result: " + binomial(30, 10, 0.6) + " count: " + COUNT);
        StdOut.println("binomialB result: " + binomialB(30, 10, 0.6, buffer) + " count: " + COUNT2);
    }
}

//binomial result: 0.0019974906520854206 count: 261200977
//binomialB result: 0.0019974906520854206 count: 4533
