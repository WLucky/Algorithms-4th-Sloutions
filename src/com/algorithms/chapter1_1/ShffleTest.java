package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

public class ShffleTest {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int[] a = new int[M];
        int[][] num = new int[M][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[j] = j;
            }
            StdRandom.shuffle(a);
            for (int j = 0; j < M; j++) {
                num[a[j]][j]++;
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%6d ", num[i][j]);
            }
            System.out.println();
        }
    }
}
