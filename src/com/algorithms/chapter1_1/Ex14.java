package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex14 {
    public static int lg(int N) {
        int i = 0;
        while (N != 0) {
            i++;
            N = N >>> 1;
        }

        return i - 1;
    }

    public static void main(String[] args) {
        StdOut.println(lg(10));
    }
}
