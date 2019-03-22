package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex30 {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        StdOut.println("Input N:");
        int N = StdIn.readInt();
        boolean[][] primeArray = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (gcd(i, j) == 1) {
                    primeArray[i][j] = true;
                } else {
                    primeArray[i][j] = false;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.printf("%6s", primeArray[i][j]);
            }
            StdOut.println();
        }
    }
}
