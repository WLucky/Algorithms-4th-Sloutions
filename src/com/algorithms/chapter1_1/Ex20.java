package com.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex20 {
    public static double ln(int N) {
        if (N == 0) {
            return 0;
        }
        return Math.log(N) + ln(N - 1);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdOut.println(ln(N));
    }
}
