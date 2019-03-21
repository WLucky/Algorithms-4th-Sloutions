package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex15 {
    public static int[] histogram(int[] a, int M) {
        int[] statisticArray = new int[M];
        for (int i = 0; i < a.length; i++) {
            int val = a[i];
            if ((val < M) && (val >= 0)) {
                statisticArray[val]++;
            }
        }
        return statisticArray;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 1, 3, 2};
        int[] statisticArray = new int[5];

        statisticArray = histogram(a, 5);
        StdOut.println(Arrays.toString(statisticArray));
    }
}
