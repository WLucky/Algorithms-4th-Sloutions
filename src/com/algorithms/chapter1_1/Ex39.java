package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Ex39 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int[] matchNum = new int[4];

        for (int i = 0; i < T; i++) {
            int N = 100;
            for (int j = 0; j < 4; j++) {
                N *= 10;
                int[] a = new int[N];
                int[] b = new int[N];
                for (int k = 0; k < N; k++) {
                    a[k] = StdRandom.uniform(100000, 1000000);
                    b[k] = StdRandom.uniform(100000, 1000000);
                }
                Arrays.sort(a);
                for (int k = 0; k < N; k++) {
                    if (BinarySearch.rank(b[k], a) != -1) {
                        matchNum[j]++;
                    }
                }
            }
        }

        int N = 100;
        for (int i = 0; i < 4; i++) {
            N *= 10;
            StdOut.println("N = " + N + " average match num = " + (double) matchNum[i] / T);
        }
    }
}

//N = 1000 average match num = 0.99
//N = 10000 average match num = 110.37
//N = 100000 average match num = 10511.09
//N = 1000000 average match num = 670769.04
